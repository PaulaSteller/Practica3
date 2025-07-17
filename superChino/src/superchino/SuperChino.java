/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superchino;

/**
 *
 * @author Laboratorio
 */
public class SuperChino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        superInfo chino = new superInfo();
        empleado empleado1 = new empleado();
        producto info = new producto();
        utilidades util = new utilidades();
        util.datosSuper(chino);
        util.datosEmpleaado(empleado1);
        util.productos(info);

    }

}
