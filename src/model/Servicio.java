/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nata
 */
public class Servicio extends Mercancia {
    private String servicio;
    private double presupuesto;
    private double porcentajeDescuento;
    private boolean enPromocion;

    public Servicio(String servicio, double presupuesto, double porcentajeDescuento, boolean enPromocion, String codMercancia) throws Exception {
        super(codMercancia);
        this.servicio = servicio;
        this.presupuesto = presupuesto;
        this.porcentajeDescuento = porcentajeDescuento;
        this.enPromocion = enPromocion;
    }   

    public boolean isEnPromocion() {
        return enPromocion;
    }

    public void setEnPromocion(boolean enPromocion) {
        this.enPromocion = enPromocion;
    }

    @Override
    public double calcularPrecioFinal() {
        if (enPromocion){
            return presupuesto * (1 - porcentajeDescuento / 100);
        }else {
            return presupuesto;
        }
    }

    @Override
    public String toString() {
        return "Servicio{" + "codMercancia=" + codMercancia + "servicio=" + servicio + ", presupuesto=" + presupuesto + ", porcentajeDescuento=" + porcentajeDescuento + ", enPromocion=" + enPromocion + '}';
    }
    
}
