# TareaINF331
Repositorio de manejo de inventario simple, tarea de la asignatura de Pruebas de Software, profesor Oscar Reyes

## Integrantes
- Cristóbal Pérez

## Descripción
Entrega de la **tarea 1** de la asignatura INF331, Pruebas de Software, de la universidad Técnica Federico Santa María. El programa es un manejo simple de inventario, donde se utiliza una lista de objetos dentro del código, por lo que no se guardan los articulos del inventario al cerrar la aplicacion. El programa maneja los siguientes aspectos:
- CRUD basico de articulos, que contienen un nombre, descripción, cantidad, precio unitario y una categaria.
- Filtrado por nombre, categoria, buscar por un precio o menos y buscar por una cantidad o menos.
- Generación de una lista de articulos del inventario y de un reporte con los articulos que no tienen stock, la cantidad de articulos y el precio total del inventario.

## Instalación
Requisitos para ejecutar el programa:

- Tener instalado [maven](https://maven.apache.org/download.cgi)

- Tener instalado, por lo menos, [java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

Para ejecutar el programa:
1- Acceder a la terminal de comandos (cmd) y acceder hasta la carpeta donde se haya descargado el repositorio
2- Ejecutar en la terminal **mvn compile**
3- Ejecutar en la terminal **mvn install**
4- Acceder desde algún IDE o directamente ejecutar el archivo de java desde la cmd, el archivo que se debe ejecutar es **inventario.java**

## Cómo usar
Al iniciar el programa, solicitará un usuario y una contraseña, actualmente solo es valido el usuario "OscarReyes", cuya contraseña es "INF331". Luego, se desplegará el menú con las opciones:
1. *Agregar un producto:* pedirá rellenar cada caracteristica del articulo.
2. *Modificar un producto:* se solicita el nombre del producto, luego se puede modificar solo una caracteristica.
3. *Eliminar un producto:* se solicita el nombre del producto.
4. *Filtrado o busqueda:* se puede elegir entre filtrar por la inicial de un nombre del producto, filtrar por una palabra del nombre, por una cantidad especifica o menos, por un precio especifico o menos y por una categoria.
5. *Lista de inventario:* se muestra la lista del inventario actual.
6. *Reporte de inventario:* se muestra un reporte con los articulos que no tienen stock, la cantidad de articulos y el precio total del inventario.
7. *Cerrar la aplicacion:* se cierra la aplicacion y se termina la ejecucion del programa.

## Cómo contribuir
Se puede solicitar ayudar en el repositorio para mejorar el codigo, realizar modificaciones o reparar errores.

## Licencia
Se puede utilizar el codigo para uso libre y modificarlo, si se usa el proyecto, mostrar el nombre de usuario o nombre del creador.
