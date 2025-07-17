/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class utilidades {

    public void datosSuper(superInfo chino) {
        chino.setCodigoSuper(JOptionPane.showInputDialog(null, "Digite el nombre del super"));
        chino.setNombreSuper(JOptionPane.showInputDialog(null, "Digite el codigo del super"));
    }

    public void datosEmpleaado(empleado empleado1) {
        empleado1.setNombreEmpleado(JOptionPane.showInputDialog(null, "Digite el nombre del super"));
        empleado1.setCedulaEmpleado(JOptionPane.showInputDialog(null, "Digite el codigo del super"));
    }

    public void productos(producto info) {

        info.setNombreProducto(JOptionPane.showInputDialog(null,"Digite el nombre del producto"));
        info.setCodigoProducto(JOptionPane.showInputDialog(null,"Digite el codigo del producto"));
        info.setCantidadProducto(JOptionPane.showInputDialog(null,"Digite la cantidad del producto"));
        int var = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio"));
        info.setPrecioProducto(var);
        info.setTipoProducto("Digite el tipo del producto");
    }

    public void total(int tipoProducto) {

    }
}
