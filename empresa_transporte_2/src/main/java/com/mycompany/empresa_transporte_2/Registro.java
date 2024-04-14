
package com.mycompany.empresa_transporte_2;

/**
 *
 * @author aleja
 */
public class Registro {
    
    public  String placa, descricion, nombre, ruta, marca , modelo;

    public Registro(String placa, String descripcion, String nombre, String ruta, String marca, String modelo) {
        this.placa = placa;
        this.descricion = descripcion;
        this.nombre = nombre;
        this.ruta = ruta;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescripcion() {
        return descricion;
    }

    public void setDescripcion(String descricion) {
        this.descricion = descricion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
    
    
}
