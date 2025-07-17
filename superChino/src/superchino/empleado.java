/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

/**
 *
 * @author Laboratorio
 */
public class empleado {
    private String nombreEmpleado;
    private String cedulaEmpleado;

    public empleado() {
    }

    public empleado(String nombreEmpleado, String cedulaEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    @Override
    public String toString() {
        return "empleado{" + "nombreEmpleado=" + nombreEmpleado + ", cedulaEmpleado=" + cedulaEmpleado + '}';
    }
    
}
