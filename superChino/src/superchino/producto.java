/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

/**
 *
 * @author Laboratorio
 */
public class producto {

    private String codigoProducto;
    private String nombreProducto;
    private String cantidadProducto;
    private double precioProducto;
    private String tipoProducto;
    private double precioBruto;
    private double ganancia;

    public producto() {
    }

    public producto(String codigoProducto, String nombreProducto, String cantidadProducto, double precioProducto, String tipoProducto, double precioBruto, double ganancia) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.tipoProducto = tipoProducto;
        this.precioBruto = precioBruto;
        this.ganancia = ganancia;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(String cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    @Override
    public String toString() {
        return "producto{" + "codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", cantidadProducto=" + cantidadProducto + ", precioProducto=" + precioProducto + ", tipoProducto=" + tipoProducto + ", precioBruto=" + precioBruto + ", ganancia=" + ganancia + '}';
    }

}
