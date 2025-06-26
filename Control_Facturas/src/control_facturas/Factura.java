/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_facturas;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Factura {
    
    //DEFINIMOS LAS VARIABLES NECESARIAS
    private String nombreCliente; 
    private String mes;
    private int cedulaCliente; 
    private int codigoFactura; 
    private double montoFactura; 
    private int productoElectronico; 
    private int productoAutomotriz; 
    private int produtoConstruccion; 
    
    /// INICIALIZAMOS CON SETTER Y GETTERS PARA INGRESAR LOS VALORES EN PANTALLA 

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getProductoElectronico() {
        return productoElectronico;
    }

    public void setProductoElectronico(int productoElectronico) {
        this.productoElectronico = productoElectronico;
    }

    public int getProductoAutomotriz() {
        return productoAutomotriz;
    }

    public void setProductoAutomotriz(int productoAutomotriz) {
        this.productoAutomotriz = productoAutomotriz;
    }

    public int getProdutoConstruccion() {
        return produtoConstruccion;
    }

    public void setProdutoConstruccion(int produtoConstruccion) {
        this.produtoConstruccion = produtoConstruccion;
    }
    
    //METODO LLENAR FACTURA 
    
    public void llenarFactura () {
        
        
        /// PEDIMOS EL VALOR DE LAS VARIABLES
        
        String inputNomCliente = JOptionPane.showInputDialog("Digite el nombre del cliente: "); 
        int inputCeduCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cedula del cliente:"));
        int inputCodigoFac = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la factura:"));
        double inputMonto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto total de la factura:"));
        int inputElectronico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos elctronicos vendidos:"));
        int inputAutomotriz = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos automotrices vendidos:"));
        int inputContrucion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos construccion vendidos:"));
        
        /// SWITCH MES
        
                int opcion3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del mes del año *SOLO INGRESE NUMEROS:"));
        
        switch(opcion3){
            
            case 1:
                setMes("Enero");
                break; 
            case 2:
                setMes("Febrero");
                break; 
            case 3:
                setMes("Marzo");
                break; 
            case 4:
                setMes("Abril");
                break; 
            case 5:
                setMes("Mayo");
                break; 
            case 6:
                setMes("Junio");
                break;
            case 7:
                setMes("Julio");
                break;
            case 8:
                setMes("Agosto");
                break;     
            case 9:
                setMes("Septiembre");
                break;  
            case 10:
                setMes("Octubre");
                break; 
            case 11:
                setMes("Noviembre");
                break;  
            case 12:
                setMes("Diciembre");
                break;
            default:
                JOptionPane.showMessageDialog(null, "EL MES NO ES VALIDO");

        }

        // ASIGANAMOS LOS VALORES 
        setCedulaCliente(inputCeduCliente);
        setCodigoFactura(inputCodigoFac);
        setMontoFactura(inputMonto);
        setNombreCliente(inputNomCliente);
        setProductoElectronico(inputElectronico);
        setProductoAutomotriz(inputAutomotriz);
        setProdutoConstruccion(inputContrucion);
    }

    public void editarFactura() {

        /// Vamos a crear la opcion de seguir editando
            ///
            
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea cambiar un dato ingresado?");

        boolean editarDatos = (opcion == JOptionPane.YES_OPTION);  // creamos este dato booleano para que se pueda volver a preguntar si desea cambiar algo + y salir del while

        while (editarDatos) {

            int option2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que Deseas Editar?\n"
                    + "1. Nombre Cliente\n"
                    + "2. Numero de Cedula\n"
                    + "3. Codigo de la Factura \n"
                    + "4. Monto de la Factura \n"
                    + "5. Cantidad de Productos Electronicos \n"
                    + "6. Cantidad de Productos Automotices \n"
                    + "7. Cantidad de Productos Construccion \n"
                    + "8. Mes del Año \n"
                    + "9. Salir"));

            switch (option2) {

                case 1:
                    String inputNomCliente = JOptionPane.showInputDialog("Digite el nombre del cliente: ");
                    setNombreCliente(inputNomCliente);
                    break;
                case 2:
                    int inputCeduCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cedula del cliente:"));
                    setCedulaCliente(inputCeduCliente);
                    break;
                case 3:
                    int inputCodigoFac = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la factura:"));
                    setCodigoFactura(inputCodigoFac);
                    break;
                case 4:
                    double inputMonto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto total de la factura:"));
                    setMontoFactura(inputMonto);
                    break;
                case 5:
                    int inputElectronico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos elctronicos vendidos:"));
                    setProductoElectronico(inputElectronico);
                    break;
                case 6:
                    int inputAutomotriz = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos automotrices vendidos:"));
                    setProductoAutomotriz(inputAutomotriz);
                    break;
                case 7:
                    int inputContrucion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos construccion vendidos:"));
                    setProdutoConstruccion(inputContrucion);
                    break;
                case 8:
                    /// SWITCH MES
        
                int opcion3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del mes del año *SOLO INGRESE NUMEROS:"));

                    switch (opcion3) {

                        case 1:
                            setMes("Enero");
                            break;
                        case 2:
                            setMes("Febrero");
                            break;
                        case 3:
                            setMes("Marzo");
                            break;
                        case 4:
                            setMes("Abril");
                            break;
                        case 5:
                            setMes("Mayo");
                            break;
                        case 6:
                            setMes("Junio");
                            break;
                        case 7:
                            setMes("Julio");
                            break;
                        case 8:
                            setMes("Agosto");
                            break;
                        case 9:
                            setMes("Septiembre");
                            break;
                        case 10:
                            setMes("Octubre");
                            break;
                        case 11:
                            setMes("Noviembre");
                            break;
                        case 12:
                            setMes("Diciembre");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "EL MES NO ES VALIDO");
                    }
                    break;
                case 9:
                   editarDatos = false; 
                    continue; //continua con el codigo    
                default:
                    JOptionPane.showMessageDialog(null, "La opcion no es valida");
                    continue;    

            }

        }
    }

        ///FIN METODO EDITAR DATOS
        ///
    
    ///AGREGAMOS TO STRING
    ///
    
    @Override
    public String toString() {
        return "Facturas  \n " 
                + "Nombre Cliente: \n " + nombreCliente  + " " 
                + "Mes del año: \n " + mes  + " " 
                + "Cedula Cliente: \n " + cedulaCliente  + " " 
                + "Codigo Factura:  \n " + codigoFactura  + " " 
                + "Monto Factura: \n " + montoFactura  + " " 
                + "Cantidad de Producto Electronico: \n " + productoElectronico + " " 
                + "Cantidad de Producto Automotriz: \n " + productoAutomotriz  + " "  
                + "Cantidad de Producto Construccion: " + produtoConstruccion + '}';
    }
    
    

}

    
    

