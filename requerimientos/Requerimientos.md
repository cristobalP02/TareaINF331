# Requerimientos

Entregable de los requerimientos solicitado para la tarea 1 de la asignatura Pruebas de Software (INF331), Universidad Técnica Federico Santa María.

## Integrantes

a. Cristóbal Pérez Bórquez

## Flujo de Trabajo

Como la tarea fue realizada de manera individual, no hubo una discusión sobre la especificación de los requerimientos, ni un control del versionamiento de la aplicación. El flujo del trabajo para la creación de la tarea, fue:
1. Primero organizar lo que se debía realizar e investigar sobre log4j, pues no se había utilizado antes.
2. Lograr instalar todos los requisitos para la correcta ejecución del programa, como log4j y maven.
3. Especificar el como se completarán los requerimientos en el código, especificando aspectos en los métodos de filtrado que se permitirán, el como se guardarán los artículos de inventario o el orden en que se realizará cada parte del código (por ejemplo, el orden de creación de cada opción del menu).
4. Comenzar la creación de código, según lo organizado anteriormente.
5. Crear el respositorio en Github y slack. Conectar slack al repositorio.
6. Crear la documentación solicitada.

## Descripción requerimientos

1. *R1:* **CRUD de Productos**: Permitir a los usuarios agregar, consultar, actualizar y eliminar productos del inventario. Cada producto debe tener un nombre, descripción, cantidad disponible, precio unitario y categoría (por ejemplo, "Electrónica", "Ropa", "Alimentos", etc.). Para especificar mejor este requerimiento, consideraría que se eliminaría y actualizaría según el nombre o ID del producto.
2. *R2:* **Gestión de Stock**: Permitir actualizar la cantidad de productos cuando se vendan o se reciban nuevas unidades. No estoy muy seguro de este requerimiento, pues se puede considerar que el CRUD de productos ya abarca el actualizar los productos, si se tuviera una interfaz visual, se podría considerar un botón para disminuir o aumentar en 1 la cantidad de productos, pero no se llegó a implementar como tal.
3. *R3:* **Filtrado y Búsqueda**. El requerimiento menos específicado, pues no da muchos detalles además de solicitar una forma de filtrar y buscar productos. En este caso se deben especificar el como se busca filtrar y por cual de los atributos, para que logre cumplir con hacer eficiente la busqueda de información de un producto.
4. *R4:* **Generación de Reportes**: Mostrar un resumen con el total de productos en inventario, el valor total del inventario y los productos agotados. Este requerimiento está bien especificado, pues pide los datos en especifico que se espera encontrar en el reporte. Lo que agregaría, sería especificar el formato en que se entrega el reporte, ya sea por escrito en el mismo programa (cmd) o en un archivo csv, pdf u otro.
5. *R5:* **Autenticación**: Proteger el acceso con un sistema de autenticación por nombre de usuario y contraseña. En este requerimiento anadiría si el usuario puede crear una cuenta y/o modificar la contraseña si se ha olvidado, también la cantidad de intentos que tiene un usuario para intentar acceder al sistema, cuando se equivoca al poner el usuario y/o el sistema.
