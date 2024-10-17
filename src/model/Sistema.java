/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nata
 */
public class Sistema {

    private List<Mercancia> firstMercancia;

    public Sistema() {
        this.firstMercancia = new ArrayList<>();
    }

    public Mercancia traerMercancia(String codMercancia) {
        for (Mercancia m : firstMercancia) {
            if (m.getCodMercancia().equals(codMercancia)) {
                return m;
            }
        }
        return null;
    }

    public List<Mercancia> traerMercancia(boolean enOferta) {
        List<Mercancia> enOfertaLista = new ArrayList<>();
        for (Mercancia m : firstMercancia) {
            if (m instanceof Producto) {
                Producto p = (Producto) m;
                if (p.isEsDescuentoen2daUnidad()) {
                    enOfertaLista.add(m);
                }
            } else if (m instanceof Servicio) {
                Servicio s = (Servicio) m;
                if (s.isEnPromocion()) {
                    enOfertaLista.add(m);
                }
            }
        }
        return enOfertaLista;
    }

    public boolean agregarProducto(String codMercancia, String producto, double precioProducto, double porcentajeDescuento, boolean esDescuentoEn2daUnidad) throws Exception {
        if (traerMercancia(codMercancia) == null) {
            firstMercancia.add(new Producto(producto, precioProducto, porcentajeDescuento, esDescuentoEn2daUnidad, codMercancia));
            return true;
        }
        throw new Exception("Ya existe una mercancía con el código proporcionado.");
    }

    public boolean agregarServicio(String codMercancia, String servicio, double presupuesto, double porcentajeDescuento, boolean enPromocion) throws Exception {
        if (traerMercancia(codMercancia) == null) {
            firstMercancia.add(new Servicio(servicio, presupuesto, porcentajeDescuento, enPromocion, codMercancia));
            return true;
        }
        throw new Exception("Ya existe una mercancía con el código proporcionado.");
    }
}
