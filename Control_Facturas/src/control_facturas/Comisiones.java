/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_facturas;

import static control_facturas.Control_Facturas.nuevaFactura;

/**
 *
 * @author ashle
 */
public class Comisiones {
    
    // DECLARAMOS LAS VARIABLES NECESARIAS
    
    private int puntosAgente; 
    private double totalComisiones; 
    private double totalFactura; 
    private boolean bonoExtra; 
    private boolean bloqueoComision;
    
    /// INCIALIZAMOS CON SETTER Y GETTER 

    public int getPuntosAgente() {
        return puntosAgente;
    }

    public void setPuntosAgente(int puntosAgente) {
        this.puntosAgente = puntosAgente;
    }

    public double getTotalComisiones() {
        return totalComisiones;
    }

    public void setTotalComisiones(double totalComisiones) {
        this.totalComisiones = totalComisiones;
    }

    public boolean isBloqueoComision() {
        return bloqueoComision;
    }

    public void setBloqueoComision(boolean bloqueoComision) {
        this.bloqueoComision = bloqueoComision;
    }
    
    

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public boolean isBonoExtra() {
        return bonoExtra;
    }

    public void setBonoExtra(boolean bonoExtra) {
        this.bonoExtra = bonoExtra;
    }
    
    /// METODO DE CALCULO DE LAS COMISIONES
    ///
    
    public void comisionesAgente(Factura nuevaFactura1) {

        ///SI VENDIO TODOS LOS PRODUCTOS 
     if (nuevaFactura.getProductoAutomotriz() > 0 && nuevaFactura.getProductoElectronico() > 0 && nuevaFactura.getProdutoConstruccion() > 0) {

            totalComisiones = (nuevaFactura.getMontoFactura() * 0.10); // Asignamos el 10%
            puntosAgente = 3;
            bloqueoComision = true;
        }
        // 3 ELECTRONICOS 
        if (nuevaFactura.getProductoElectronico() >= 3 && bloqueoComision == false) {
            totalComisiones = (nuevaFactura.getMontoFactura() * 0.04);
            puntosAgente = (puntosAgente + 1);
        } else if (nuevaFactura.getProductoElectronico() <= 3 && nuevaFactura.getProductoElectronico() > 0 && bloqueoComision == false) {
            totalComisiones = (nuevaFactura.getMontoFactura() * 0.02);
            puntosAgente = (puntosAgente + 1);
        }

        if (nuevaFactura.getProductoAutomotriz() >= 4 && bloqueoComision == false) {
            totalComisiones = ((nuevaFactura.getMontoFactura() * 0.04) + totalComisiones);
            puntosAgente = (puntosAgente + 1);
        } else if (nuevaFactura.getProductoAutomotriz() <= 4 && nuevaFactura.getProductoAutomotriz() > 0 && bloqueoComision == false) {
            totalComisiones = ((nuevaFactura.getMontoFactura() * 0.02) + totalComisiones);
            puntosAgente = (puntosAgente + 1);
        }
        if (nuevaFactura.getProdutoConstruccion() > 0 && bloqueoComision == false) {
            totalComisiones = ((nuevaFactura.getMontoFactura() * 0.08) + totalComisiones);
            puntosAgente = (puntosAgente + 2);

        }

        if (nuevaFactura.getMontoFactura() > 50000) {
            totalComisiones = ((nuevaFactura.getMontoFactura() * 0.05) + totalComisiones);

        }

        if (Control_Facturas.getCanFacturas() > 3 && bloqueoComision == false) {

            totalComisiones = (totalComisiones + 20000);
            bonoExtra = true;

        }
    }
    
    // FIN METODO DE COMISIONES 

    @Override
    public String toString() {
        return "Comisiones" 
                + "Puntos Agente:  \n " + puntosAgente  + " " 
                + "TotalC omisiones: \n " + totalComisiones  + " " 
                + "Total Factura: \n " + totalFactura  + " " 
                + "Bono Extra: " + (bonoExtra ? "Si tiene bono extra" : "No tiene bono extra") + " " 
                + "Bloqueo Comision: " + bloqueoComision + '}';
    }
    
    
}




    
    
