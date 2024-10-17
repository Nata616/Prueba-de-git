/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nata
 */
public class Producto extends Mercancia{
    private String producto;
    private double precioProducto;
    private double porcentajeDescuento;
    private boolean esDescuentoEn2daUnidad;

    public Producto(String producto, double precioProducto, double porcentajeDescuento, boolean esDescuentoen2daUnidad, String codMercancia) throws Exception {
        super(codMercancia);
        this.producto = producto;
        this.precioProducto = precioProducto;
        this.porcentajeDescuento = porcentajeDescuento;
        this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public boolean isEsDescuentoen2daUnidad() {
        return esDescuentoEn2daUnidad;
    }

    public void setEsDescuentoen2daUnidad(boolean esDescuentoEn2daUnidad) {
        this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
    }       
    
    @Override
    public double calcularPrecioFinal() {
        if (esDescuentoEn2daUnidad){
            return (precioProducto * 2) * (1 - porcentajeDescuento / 200);
        }else{
            return precioProducto * (1 - porcentajeDescuento / 100);
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "codMercancia=" + codMercancia + "producto=" + producto + ", precioProducto=" + precioProducto + ", porcentajeDescuento=" + porcentajeDescuento + ", esDescuentoEn2daUnidad=" + esDescuentoEn2daUnidad + '}';
    }
    
   
}
