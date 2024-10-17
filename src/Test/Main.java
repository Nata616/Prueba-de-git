/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import model.Mercancia;
import model.Producto;
import model.Servicio;
import model.Sistema;

/**
 *
 * @author Nata
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        try {
            // 1-1: Intento de creación con código incorrecto
            System.out.println("1-1");
            Servicio servicioIncorrecto = new Servicio("Mantenimiento máquina de cortar pasto", 2500.0, 15.0, true, "897323");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // 1-2: Creación de servicio exitoso
            System.out.println("1-2");
            Servicio servicioCorrecto = new Servicio("Mantenimiento máquina de cortar pasto", 2500.0, 15.0, true, "8973231");
            System.out.println(servicioCorrecto);

            // 1-3: Intento de creación con código incorrecto
            System.out.println("1-3");
            Producto productoIncorrecto = new Producto("Manguera de desagote lavarropa", 650.0, 15.0, true, "432597");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // 1-4: Creación de producto exitoso
            System.out.println("1-4");
            Producto productoCorrecto = new Producto("Manguera de desagote lavarropa", 650.0, 15.0, true, "4325971");
            System.out.println(productoCorrecto);

            // 2-1: Calcular precio final del servicio
            System.out.println("2-1");
            System.out.println(productoCorrecto.calcularPrecioFinal());

            // 2-2: Calcular precio final del producto
            System.out.println("2-2");
            System.out.println(productoCorrecto.calcularPrecioFinal());

            // 3-1: Agregar productos y servicios
            System.out.println("3-1");
            sistema.agregarProducto("3892871", "Aceite para máquinas", 430.0, 10.0, true);
            sistema.agregarServicio("3892815", "Mantenimiento de cortadora de césped", 2520.0 ,0.0 ,true);
            sistema.agregarProducto("9381925", "Tambor lavarropa", 7500.0, 25.0, false);
            sistema.agregarServicio("3481759", "Mantenimiento estufa", 1250.0, 0.0, false);

            // 3-2: Reintentar agregar servicio ya existente
            System.out.println("3-2");
            sistema.agregarServicio("3892815", "Mantenimiento de cortadora de césped", 2520.0, 0.0, true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 4: Traer mercancías en oferta
        System.out.println("4");
        for (Mercancia m : sistema.traerMercancia(true)) {
            System.out.println(m);
        }
    }
}
