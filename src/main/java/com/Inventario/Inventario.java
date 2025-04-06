package com.Inventario;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;

public class Inventario {

    private static final Logger logger = LogManager.getLogger();

    private static ArrayList<producto> lista_productos = new ArrayList<producto>();

    public static void main(String[] args) throws IOException {
        Boolean menu = true;

        Console console = System.console();

        String usuario = console.readLine("Escribe el nombre de usuario: ");
        String contrasena = console.readLine("Escribe la contrasena del usuario: ");

        if(!(usuario.equals("OscarReyes") && contrasena.equals("INF331"))){
            menu = false;

            logger.error("La contrasena o el usuario ingresado es incorrecto");
        }

        while(menu){
            String resp = console.readLine("Bienvenido al menu, estan las siguientes opciones: \n 1- Agregar un producto \n 2- Modificar un producto \n 3- Eliminar un producto \n 4- Buscar/Filtrar productos \n 5- Generar un listado de Inventario \n 6- Generar un reporte de Inventario \n 7- Terminar el menu \n Opcion:");

            if(resp.equals("1")){
                String nombre = console.readLine("Escribe el nombre del nuevo producto: ");
                String descripcion = console.readLine("Escribe una descripcion: ");
                String cantidad = console.readLine("Escribe la cantidad disponible: ");
                String precio = console.readLine("Escribe el precio de un solo producto: ");
                String categoria = console.readLine("Escribe la categoria del producto: ");

                producto nuevo_producto = new producto();
                nuevo_producto.setName(nombre);
                nuevo_producto.setDescripcion(descripcion);
                nuevo_producto.setCategoria(categoria);
             
                
                try{
                    nuevo_producto.setCantidad(Integer.valueOf(cantidad));
                }
                catch(Exception error){
                    nuevo_producto.setCantidad(0);
                    logger.error("Ha ocurrido una excepcion, no es un numero: {}", error);
                }

                try{
                    nuevo_producto.setPrecio(Integer.valueOf(precio));
                }
                catch(Exception error){
                    nuevo_producto.setCantidad(0);
                    logger.error("Ha ocurrido una excepcion, no es un numero: {}", error);
                }
                

                lista_productos.add(nuevo_producto);

                logger.info("Se agrego el producto: {}", nombre);
            }

            else if(resp.equals("2")){
                String nombre = console.readLine("Escribe el nombre del producto que se quiere modificar: ");

                for(producto prod: lista_productos){
                    if(nombre.equals(prod.getName())){
                        logger.info("Nombre: {}, Descripcion: {}, Cantidad disponible: {}, Precio actual: {}, Categoria: {} \n", prod.getName(), prod.getDescripcion(), prod.getCantidad(), prod.getPrecio(), prod.getCategoria());

                        String modificacion = console.readLine("Que aspecto se quiere modificar (en minuscula): ");

                        if(modificacion.equals("nombre")){
                            String name = console.readLine("Escribe el nuevo nombre del producto: ");
                            prod.setName(name);
                        }

                        else if(modificacion.equals("descripcion")){
                            String description = console.readLine("Escribe la nueva descripcion del producto: ");
                            prod.setDescripcion(description);
                        }

                        else if(modificacion.equals("cantidad")){
                            String quantity = console.readLine("Escribe la nueva cantidad del producto: ");

                            try{
                                prod.setCantidad(Integer.valueOf(quantity));
                            }
                            catch(Exception error){
                                logger.error("Se ha producido un error, no es un numero: {}", error);
                            }
                            
                        }

                        else if(modificacion.equals("precio")){
                            String price = console.readLine("Escribe el nuevo precio del producto: ");

                            try{
                                prod.setPrecio(Integer.valueOf(price));
                            }
                            catch(Exception error){
                                logger.error("Se ha producido un error, no es un numero: {}", error);
                            }
                            
                        }

                        else if(modificacion.equals("categoria")){
                            String category = console.readLine("Escribe la nueva categoria del producto: ");
                            prod.setCategoria(category);
                        }

                        else{
                            logger.warn("No existe ese aspecto, eligen entre nombre, descripcion, cantidad, precio y categoria");
                        }
                    }
                }
            }

            else if(resp.equals("3")){
                String nombre = console.readLine("Escribe el nombre del producto que se quiere eliminar: ");

                producto prod_eliminar = new producto();
                
                for(producto prod: lista_productos){
                    if(nombre.equals(prod.getName())){
                        logger.warn("Se borrara el producto con nombre {}", nombre);

                        prod_eliminar = prod;
                    }
                }

                try{
                    lista_productos.remove(prod_eliminar);
                }
                catch(Exception error){
                    logger.error("Ha ocurrido un error, no se ha eliminado ningun producto: {}", error);
                }
            }

            else if(resp.equals("4")){
                String filtrado = console.readLine("Escribe el metodo de filtrado de productos: \n 1- Filtrar por nombre con letra inicial \n 2- Filtrar por una palabra \n 3- Filtrar por cantidad de stock (menos) \n 4- Filtrar por precio (menos) \n 5- Filtrar por categoria \n Opcion:");
                
                if(filtrado.equals("1")){
                    String letra = console.readLine("Escribe la letra inicial a filtrar: ");

                    for(producto prod: lista_productos){
                        if(prod.getName().startsWith(letra.toLowerCase()) || prod.getName().startsWith(letra.toUpperCase())){
                            logger.info("Producto que inicia con {}: {}", letra, prod.getName());
                        }
                    }
                }

                else if(filtrado.equals("2")){
                    String palabra = console.readLine("Escribe la palabra a filtrar: ");

                    for(producto prod: lista_productos){
                        if(prod.getName().contains(palabra)){
                            logger.info("Producto que contiene la palabra {}: {}", palabra, prod.getName());
                        }
                    }
                }

                else if(filtrado.equals("3")){
                    String cantidad = console.readLine("Escribe la cantidad a filtrar: ");

                    for(producto prod: lista_productos){
                        if(prod.getCantidad() <= Integer.parseInt(cantidad)){
                            logger.info("Producto que tiene menos de {}: {}", cantidad, prod.getName());
                        }
                    }
                }

                else if(filtrado.equals("4")){
                    String precio = console.readLine("Escribe el precio a filtrar: ");

                    for(producto prod: lista_productos){
                        if(prod.getPrecio() <= Integer.parseInt(precio)){
                            logger.info("Producto que tiene menos de {}: {}", precio, prod.getName());
                        }
                    }
                }

                else if(filtrado.equals("5")){
                    String categoria = console.readLine("Escribe la categoria a filtrar: ");

                    for(producto prod: lista_productos){
                        if(prod.getCategoria().equals(categoria)){
                            logger.info("Producto que inicia con {}: {}", categoria, prod.getName());
                        }
                    }
                }

                else{
                    logger.warn("La opcion ingresada no existe, elige una opcion del 1 al 7");
                }
            }

            else if(resp.equals("5")){
                for(producto prod: lista_productos){
                    logger.info("Nombre: {}, Descripcion: {}, Cantidad disponible: {}, Precio actual: {}, Categoria: {}", prod.getName(), prod.getDescripcion(), prod.getCantidad(), prod.getPrecio(), prod.getCategoria());
                }
            }

            else if(resp.equals("6")){
                int total_productos = 0;
                int valor_productos = 0;
    
                for(producto prod: lista_productos){
                    total_productos = total_productos + prod.getCantidad();
                    valor_productos = valor_productos + (prod.getCantidad() * prod.getPrecio());

                    if(prod.cantidad == 0){
                        logger.warn("El producto {} de la categoria {} se ha quedado sin stock", prod.getName(), prod.getCategoria());
                    }
                }

                logger.info("Actualmente, hay {} productos, con un valor igual a {}", total_productos, valor_productos);
            }

            else if(resp.equals("7")){
                menu = false;
            }
        
            else{
                logger.warn("La opcion ingresada no existe, elige una opcion del 1 al 7");
            }
        }

        logger.info("Cerrando aplicacion");
    }
}
