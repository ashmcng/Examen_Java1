/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control_facturas;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Control_Facturas {

    /**
     * @param args the command line arguments
     */
    
    // declaramos variable de cantidad de facturas y su valor para contar cuantos se crean
    private static int canFacturas = 0;
    private static double sumarFacturas;
    
    
    ///INICIALIZAMOS

    public static double getSumarFacturas() {
        return sumarFacturas;
    }

    public static void setSumarFacturas(double sumarFacturas) {
        Control_Facturas.sumarFacturas = sumarFacturas;
    }

    public static Factura getNuevaFactura() {
        return nuevaFactura;
    }

    public static void setNuevaFactura(Factura nuevaFactura) {
        Control_Facturas.nuevaFactura = nuevaFactura;
    }
    
    public static int getCanFacturas() {
        return canFacturas;
    }

    public static void setCanFacturas(int canFacturas) {
        Control_Facturas.canFacturas = canFacturas;
    }
    
    public static Factura nuevaFactura; // para que se pueda accesar al objeto de viaje en todas las clases
    
    public static void main(String[] args) {
        // TODO code application logic here

        
        JOptionPane.showInternalMessageDialog(null, "BIENVENIDO AL CUESTIONARION DEL AGENTE");
        
        Agente agent1 = new Agente(); 
        
        //LLAMAMOS AL CUESTIONARIO
        
        agent1.cuestionarioAgente();
        
        agent1.editarcuestionario(); // lo edita

        JOptionPane.showInternalMessageDialog(null, agent1.toString());

        /// CREAMOS UN BLOQUE CON CONDICION DE SALIDA PARA CREAR FACTURAS 
        ///
        ///
       int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar una Factura ?");

        boolean crearFactura = (opcion == JOptionPane.YES_OPTION);  // CONDICION DE SALIDA DEJA DE CREAR VIAJES 

        ///
        while (crearFactura) {

            nuevaFactura = new Factura(); // creamos  la factura 
            canFacturas++;  // sumamos a la cantidad de facturas

            nuevaFactura.llenarFactura(); // llamamos el metodo para llenar la variables 
            nuevaFactura.editarFactura(); // el  metodo para que pueda editar valores

            JOptionPane.showInternalMessageDialog(null, nuevaFactura.toString()); // enseñamos la factura creada

            /// *NOTA NO HEMOS VISTO ARRAYS NO SE PUEDEN GUARDAR MULTIPLES FACTURAS
            
              /// PREGUNTAMOS SI DESEA CREAR OTRA FACTURA
            
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra Factura?");

            crearFactura = (respuesta == JOptionPane.YES_OPTION);
            sumarFacturas = ( sumarFacturas + nuevaFactura.getMontoFactura());

        }
        
        JOptionPane.showInternalMessageDialog(null, "REGISTRO DE FACTURAS FINALIZADO"); // CONFIRMACION DE REGISTROS 
        
        // CREAMOS CALCULO DE COMISIONES 
        
        Comisiones nuevaComision = new Comisiones(); 
        nuevaComision.comisionesAgente(nuevaFactura);
        
        // DAMOS EL RINT FINAL
        
        JOptionPane.showInternalMessageDialog(null, "RESULTADOS \n" 
        + "El vendedor" + agent1.getNombreAgente() + " " 
        + "El codigo de agente" + agent1.getCodigoAgente() + " " 
        + "En el mes de  " + nuevaFactura.getMes() + " " 
        + "El total de ventas en facturas es de: \n" + sumarFacturas + " " 
        + "El vendedor obtenio un total de comisiones de:  \n" + nuevaComision.getTotalComisiones() + " " 
        + "El estado del bono extra " + (nuevaComision.isBonoExtra() ? "Si logro bono extra \n" : "No logro el bono extra \n") + " " 
        + "Los puntos de Agente Obtenidos: \n" + nuevaComision.getPuntosAgente() + " " 
        + "El estado de vehiculo del agente: " + (agent1.isVehiculoAgente() ? "El agente tiene vehiculo propio" : "El agente no tiene vehiculo propio"));
    }
}
