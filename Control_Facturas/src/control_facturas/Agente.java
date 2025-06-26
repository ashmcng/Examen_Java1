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
public class Agente {
    
    ///DECLARAMOS LAS VARIABLES QUE SE LE SOLICITAN AL AGENTE
    private String nombreAgente; 
    private int cedulaAgente; 
    private int codigoAgente;
    private String nombreSucursal; 
    private boolean vehiculoAgente; 
    
    /// INICIALIZAMOS LAS VARIABLES PARA QUE SE PUEDAN ASIGNAR EN PANTALLA 

    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public int getCedulaAgente() {
        return cedulaAgente;
    }

    public void setCedulaAgente(int cedulaAgente) {
        this.cedulaAgente = cedulaAgente;
    }

    public int getCodigoAgente() {
        return codigoAgente;
    }

    public void setCodigoAgente(int codigoAgente) {
        this.codigoAgente = codigoAgente;
    }
    
    

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public boolean isVehiculoAgente() {
        return vehiculoAgente;
    }

    public void setVehiculoAgente(boolean vehiculoAgente) {
        this.vehiculoAgente = vehiculoAgente;
    }
    
    
    /// FORMS PARA QUE SE LLENE EN PANTALLA
    
    public void cuestionarioAgente(){
        
        String inputNombreAgente = JOptionPane.showInputDialog("Digite El nombre del Agente"); 
        String inputNombreSucursal = JOptionPane.showInputDialog("Digite el nombre de la sucursal a la pertenece"); 
        int inputCedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cedula:"));
        int inputCodigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su codigo de agente *SOLO NUMEROS*:"));
        int inputVehiculo = JOptionPane.showConfirmDialog(null, "¿Posee vehiculo?");
        
        // ASIGNAMOS LAS VARIABLES 
        
        setCedulaAgente(inputCedula);
        setCodigoAgente(inputCodigo);
        setNombreAgente(inputNombreAgente);
        setNombreSucursal(inputNombreSucursal);
        setVehiculoAgente( inputVehiculo == JOptionPane.YES_OPTION); //TRANSFORMAMOS EL SI A TRUE BOOLEAN
        
    }

    // METODO PARA MODIFICAR LAS VARIABLES 
    public void editarcuestionario() {

        /// Vamos a crear la opcion de seguir editando
            ///
            
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea cambiar un dato ingresado?");

        boolean editarDatos = (opcion == JOptionPane.YES_OPTION);  // creamos este dato booleano para que se pueda volver a preguntar si desea cambiar algo + y salir del while

        while (editarDatos) {

            int option2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que Deseas Editar?\n"
                    + "1. Nombre Agente\n"
                    + "2. Nombre sucursal\n"
                    + "3. Numero de Cedula \n"
                    + "4. Numero de agente \n"
                    + "5. Estado de Poseer Vehiculo \n"
                    + "6. Salir"));

            switch (option2) {
                
                case 1: 
                    String inputNombreAgente = JOptionPane.showInputDialog("Digite El nombre del Agente");
                    setNombreAgente(inputNombreAgente);
                    break; 
                case 2: 
                    String inputNombreSucursal = JOptionPane.showInputDialog("Digite el nombre de la sucursal a la pertenece"); 
                    setNombreSucursal(inputNombreSucursal);
                    break;
                case 3: 
                    int inputCedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cedula:"));
                    setCedulaAgente(inputCedula);
                    break;
                case 4: 
                    int inputCodigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su codigo de agente *SOLO NUMEROS*:"));
                    setCodigoAgente(inputCodigo);
                    break;
                case 5: 
                     int inputVehiculo = JOptionPane.showConfirmDialog(null, "¿Posee vehiculo?");
                     setVehiculoAgente( inputVehiculo == JOptionPane.YES_OPTION); //TRANSFORMAMOS EL SI A TRUE BOOLEAN
                    break;
                case 6: 
                    editarDatos = false; 
                    continue; //continua con el codigo    
                default:
                    JOptionPane.showMessageDialog(null, "La opcion no es valida");
                    continue;

            }
        }
    }
    
    //FIN METODO EDITAR DATOS 
    
    //AGREGAMOS TO STRING

    @Override
    public String toString() {
        return "Agente \n " 
                + "Nombre Agente: \n " + nombreAgente + " " 
                + "Cedula Agente: \n " + cedulaAgente  + " " 
                + "Codigo Agente: \n " + codigoAgente  + " " 
                + "Nombre Sucursal: \n " + nombreSucursal  + " " 
                + "Vehiculo Agente: " + (vehiculoAgente ? "Si tiene Vehiculo" : "No tiene Vehiculo")+ '}';
    }
    
    
}




