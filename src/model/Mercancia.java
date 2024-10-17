/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nata
 */
public abstract class Mercancia {
    protected String codMercancia;
    public Mercancia(String codMercancia) throws Exception{
        if (codMercancia.length() != 7){
            throw new Exception("El codigo debe tener 7 caracteres.");
        }  
        this.codMercancia = codMercancia;
    }

    public String getCodMercancia() {
        return codMercancia;
    }

    public void setCodMercancia(String codMercancia) {
        this.codMercancia = codMercancia;
    }
    
    public abstract double calcularPrecioFinal();
}
