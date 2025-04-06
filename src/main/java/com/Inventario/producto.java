package com.Inventario;

public class producto {
    //Nombre del producto
    public String name;

    //Descripcion del producto
    public String descripcion;

    //Cantidad disponible del producto
    public int cantidad;

    //Precio unitario del producto
    public int precio;

    //Categoria del producto
    public String categoria;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }


    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }


    public int getPrecio(){
        return precio;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }


    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
}