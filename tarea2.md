# Tarea 2, INF331

Nombre: Cristóbal Pérez Bórquez
Grupo 7
Tema: "LogisticaGlobal.com: Gestión de Incidentes Robóticos en Warehouse"

## Objetivo del sistema

El objetivo general del sistema solicitado es ser una aplicación web que reemplaze el engorroso proceso actual de registro de incedencias de los robots. El sistema debe registrar, clasificar y permitir seguir el estado de la incidencia, debe ser accesible y confiable, buscando mejorar la operatividad del manejo de inventario y optimizar el seguimiento de los incidentes de robots.

## Casos de Uso

**CU 01 - Registro de incidencias**

| Nombre          | Creación de registro de incidencias |   CU 01  |
|-----------------|------------------------------------------------|
| Resumen         | Un jefe de turno observa un incidente, lo      |
|                 | registra fisicamente indicando los robots que  |
|                 | estan involucrados y crea la incidencia en el  |
|                 | software basado en lo registrado.              |
|-----------------|------------------------------------------------|
| Actores         |        Jefe de turno de la empresa             |
|-----------------|------------------------------------------------|
| Pre Condiciones | El software es accedido por una cuenta de jefe |
|                 | de turno, ya se debe tener la incidencia en    |
|                 | formato fisico. Se selecciona la opción de     |
|                 | crear incidencia nueva.                        |
|-----------------|------------------------------------------------|
| Flujos          | # |  Flujo principal  | # | Flujo alternativo  |
|-----------------|------------------------------------------------|
|                 | 1 | Se despliega los  |   |                    |
|                 |   | datos a llenar    |   |                    |
|-----------------|------------------------------------------------|
|                 | 2 | Se agrega nombre  |   |                    |
|                 |   | a la incidencia   |   |                    |
|-----------------|------------------------------------------------|
|                 | 3 | Se agrega fecha y |   |                    |
|                 |   | hora del hecho    |   |                    |
|-----------------|------------------------------------------------|
|                 | 4 | Se agrega lugar   |   |                    |
|                 |   | en donde ocurre   |   |                    |
|                 |   | el incidente      |   |                    |
|-----------------|------------------------------------------------|
|                 | 5 | Se agregan las    |   |                    |
|                 |   | fichas por cada   |   |                    |
|                 |   | robot involucrado |   |                    |
|-----------------|------------------------------------------------|
| PostCondiciones | Se guerda el registro de la incidencia, junto  |
|                 | a las fichas de cada robot. Se asigna ID       |
|                 | automaticamente al incidente.                  |

**CU 02 - Creación de ficha de un robot**

| Nombre          | Creación de fichas asociada a robot |   CU 02  |
|-----------------|------------------------------------------------|
| Resumen         | Al llenar la incidencia, puede haber más de un |
|                 | robot involucrado en el accidente, por lo que  |
|                 | se debe llenar una ficha por cada uno de ellos |
|-----------------|------------------------------------------------|
| Actores         |        Jefe de turno de la empresa             |
|-----------------|------------------------------------------------|
| Pre Condiciones | Se está creando una ficha nueva. Se está       |
|                 | accediendo desde una cuenta de jefe de turno.  |
|-----------------|------------------------------------------------|
| Flujos          | # |  Flujo principal  | # | Flujo alternativo  |
|-----------------|------------------------------------------------|
|                 | 1 | Se agrega el ID   |   |                    |
|                 |   | del robot         |   |                    |
|-----------------|------------------------------------------------|
|                 |   |                   |1.1| No existe registro |
|                 |   |                   |   | del ID del robot,  |
|                 |   |                   |   | se muestra error   |
|-----------------|------------------------------------------------|
|                 | 2 | Se agrega una     |   |                    |
|                 |   | descripcion de lo |   |                    |
|                 |   | que le ocurrio al |   |                    |
|                 |   | robot             |   |                    |
|-----------------|------------------------------------------------|
| PostCondiciones | Se guarda una ficha asociada a la incidencia.  |

**CU 03 - Busqueda de una incidencia por ID**

| Nombre          | Busqueda de una incidencia guardada |   CU 03  |
|-----------------|------------------------------------------------|
| Resumen         | Para facilitar encontrar las incidencias       |
|                 | guardadas en el sistema, hay un boton en donde |
|                 | se puede filtrar las incidencias, para buscar  |
|                 | solo una, se puede dar un ID.                  |
|-----------------|------------------------------------------------|
| Actores         | Jefe de turno, técnicos, supervisor            |
|-----------------|------------------------------------------------|
| Pre Condiciones | Se accedio al sistema y se apreto el boton de  |
|                 | lupa, emerge una ventana con los recuadros en  |
|                 | donde se puede filtrar, en este caso una sola  |
|                 | por ID de la incidencia.                       |
|-----------------|------------------------------------------------|
| Flujos          | # |  Flujo principal  | # | Flujo alternativo  |
|-----------------|------------------------------------------------|
|                 | 1 | Se escribe un ID  |   |                    |
|                 |   | y se selecciona   |   |                    |
|                 |   | el boton buscar   |   |                    |
|-----------------|------------------------------------------------|
|                 | 2 | Se despliega una  |   |                    |
|                 |   | ventana con el    |   |                    |
|                 |   | incidente buscado |   |                    |
|-----------------|------------------------------------------------|
|                 |   |                   |2.1| No existe un       |
|                 |   |                   |   | incidente con el   |
|                 |   |                   |   | ID buscado         |
|-----------------|------------------------------------------------|
| PostCondiciones | Se muestra o no un incidente guardado en el    |
|                 | sistema, si se muestra uno, se puede acceder.  |

**CU 04 - Busqueda de incidencias por filtrado**

| Nombre          | Busqueda de incidencias guardadas   |   CU 04  |
|-----------------|------------------------------------------------|
| Resumen         | Para facilitar encontrar las incidencias       |
|                 | guardadas en el sistema, hay un boton en donde |
|                 | se puede filtrar las incidencias, para buscar  |
|                 | varias, se puede buscar por fecha (posterior), |
|                 | por nombre y por estado de la incidencia.      |
|-----------------|------------------------------------------------|
| Actores         | Jefe de turno, técnicos, supervisor            |
|-----------------|------------------------------------------------|
| Pre Condiciones | Se accedio al sistema y se apreto el boton de  |
|                 | lupa, emerge una ventana con los recuadros en  |
|                 | donde se puede filtrar, en este caso se busca  |
|                 | por fecha, nombre o estado de incidencia       |
|-----------------|------------------------------------------------|
| Flujos          | # |  Flujo principal  | # | Flujo alternativo  |
|-----------------|------------------------------------------------|
|                 | 1 | Se escribe uno de |   |                    |
|                 |   | los atributos y   |   |                    |
|                 |   | selecciona buscar |   |                    |
|-----------------|------------------------------------------------|
|                 | 2 | Se despliega una  |   |                    |
|                 |   | ventana con todos |   |                    |
|                 |   | los incidentes    |   |                    |
|                 |   | que cumplen con   |   |                    |
|                 |   | el filtro elegido |   |                    |
|-----------------|------------------------------------------------|
|                 |   |                   |2.1| No existe un       |
|                 |   |                   |   | incidente con el   |
|                 |   |                   |   | atributo buscado   |
|-----------------|------------------------------------------------|
| PostCondiciones | Se muestra o no los incidentes guardados en el |
|                 | sistema, si se muestra alguno, se muestra la   |
|                 | slista y se pueden seleccionar.                |

**CU 05 - Creación de reportes de incidentes**

| Nombre          | Creación de reportes estadisticos    |  CU 05  |
|-----------------|------------------------------------------------|
| Resumen         | Actualmente, cada supervisor crea reportes     |
|                 | mensuales y anuales sobre los incidentes de la |
|                 | empresa y sus robots, que contienen tiempos,   |
|                 | tipos de resolucion, etc.                      |
|-----------------|------------------------------------------------|
| Actores         |                 Supervisor                     |
|-----------------|------------------------------------------------|
| Pre Condiciones | Se accede desde una cuenta de supervisor, se   |
|                 | ha seleccionado la sección de estadisticos.    |
|-----------------|------------------------------------------------|
| Flujos          | # |  Flujo principal  | # | Flujo alternativo  |
|-----------------|------------------------------------------------|
|                 | 1 | Se selecciona la  |   |                    |
|                 |   | opción de reporte |   |                    |
|                 |   | mensual           |   |                    |
|-----------------|------------------------------------------------|
|                 |   |                   |1.1| Se selecciona la   |
|                 |   |                   |   | opción de reporte  |
|                 |   |                   |   | anual              |
|-----------------|------------------------------------------------|
|                 | 2 | Se genera un      |   |                    |
|                 |   | reporte con los   |   |                    |
|                 |   | incidentes de los |   |                    |
|                 |   | ultimos 30 dias   |   |                    |
|-----------------|------------------------------------------------|
|                 |   |                   |2.1| Se genera un       |
|                 |   |                   |   | reporte con los    |
|                 |   |                   |   | incidentes del año |
|                 |   |                   |   | actual             |
|-----------------|------------------------------------------------|
| PostCondiciones | Se genera un reporte mensual o anual que se    |
|                 | puede descargar en formato PDF.                |

**CU 06 - Eliminar una incidencia registrada**

| Nombre          | Eliminación de incidencias          |   CU 06  |
|-----------------|------------------------------------------------|
| Resumen         | A veces, se puede ingresar incorrectamente una |
|                 | incidencia o se crea por accidente una nueva,  |
|                 | para ello es útil poder eliminarla.            |
|-----------------|------------------------------------------------|
| Actores         | Jefe de turno, técnicos, supervisor            |
|-----------------|------------------------------------------------|
| Pre Condiciones | Se debe acceder a una de las incidencias       |
|                 | guardadas en el sistema y se debe seleccionar  |
|                 | el botón de eliminar.                          |
|-----------------|------------------------------------------------|
| Flujos          | # |  Flujo principal  | # | Flujo alternativo  |
|-----------------|------------------------------------------------|
|                 | 1 | Se muestra una    |   |                    |
|                 |   | ventana de        |   |                    |
|                 |   | confirmación      |   |                    |
|-----------------|------------------------------------------------|
|                 | 2 | Se selecciona la  |   |                    |
|                 |   | opcion de "si"    |   |                    |
|-----------------|------------------------------------------------|
|                 |   |                   |2.1| Se selecciona la   |
|                 |   |                   |   | opcion de "no "    |
|-----------------|------------------------------------------------|
|                 | 3 | Se elimina la     |   |                    |
|                 |   | incidencia        |   |                    |
|                 |   | seleccionada y se |   |                    |
|                 |   | vuelve al menu    |   |                    |
|-----------------|------------------------------------------------|
|                 |   |                   |3.1| No se elimina la   |
|                 |   |                   |   | incidencia y se    |
|                 |   |                   |   | vuelve a la        |
|                 |   |                   |   | incidencia         |
|-----------------|------------------------------------------------|
| PostCondiciones | Se elimina o no del sistema una incidencia.    |

**CU 07 - Revisión de incidente inicial**

| Nombre          | Supervisor revisa la incidencia     |   CU 07  |
|-----------------|------------------------------------------------|
| Resumen         | Después de que el jefe de planta crea la       |
|                 | incidencia, el supervisor debe clasificarla,   |
|                 | definir la gravedad y asignar técnicos.        |
|-----------------|------------------------------------------------|
| Actores         |                 Supervisor                     |
|-----------------|------------------------------------------------|
| Pre Condiciones | Se accede desde la cuenta de un supervisor, se |
|                 | accede a una incidencia recientemente creada.  |
|-----------------|------------------------------------------------|
| Flujos          | # |  Flujo principal  | # | Flujo alternativo  |
|-----------------|------------------------------------------------|
|                 | 1 | Se selecciona la  |   |                    |
|                 |   | opcion de         |   |                    |
|                 |   | revision inicial  |   |                    |
|-----------------|------------------------------------------------|
|                 | 2 | Se clasifica con  |   |                    |
|                 |   | una opción dentro |   |                    |
|                 |   | de la lista       |   |                    |
|-----------------|------------------------------------------------|
|                 | 3 | Se define el      |   |                    |
|                 |   | nivel de gravedad |   |                    |
|                 |   | de la incidencia  |   |                    |
|-----------------|------------------------------------------------|
|                 | 4 | Se asignan los    |   |                    |
|                 |   | nombres de los    |   |                    |
|                 |   | técnicos          |   |                    |
|-----------------|------------------------------------------------|
| PostCondiciones | Se guarda la modificación de la incidencia y   |
|                 | se cambia el estado a "revisado", se guarda la |
|                 | hora de la modificación.                       |

**CU 08 - Se revisan los robots de la incidencia**

| Nombre          | Revisión de robots por técnicos     |   CU 08  |
|-----------------|------------------------------------------------|
| Resumen         | Después de la revisión inicial, los técnicos   |
|                 | asignados deben ir a revisar los robots        |
|                 | mencionados en la incidencia y modifican la    |
|                 | incidencia con los detalles de la revisión.    |
|-----------------|------------------------------------------------|
| Actores         |                    Técnicos                    |
|-----------------|------------------------------------------------|
| Pre Condiciones | Se accede desde la cuenta de un técnico, se    |
|                 | accede a una incidencia en estado "revisado" y |
|                 | se selecciona la opción de revisión técnica.   |
|-----------------|------------------------------------------------|
| Flujos          | # |  Flujo principal  | # | Flujo alternativo  |
|-----------------|------------------------------------------------|
|                 | 1 | Se selecciona una |   |                    |
|                 |   | de las opciones   |   |                    |
|                 |   | de nuevo estado   |   |                    |
|-----------------|------------------------------------------------|
|                 | 2 | Se escribe en un  |   |                    |
|                 |   | recuadro la       |   |                    |
|                 |   | descripción de la |   |                    |
|                 |   | revisión técnica  |   |                    |
|-----------------|------------------------------------------------|
| PostCondiciones | Se guarda la modificación de la incidencia y   |
|                 | se cambia el estado a "revisado por técnicos", |
|                 | se guarda la hora de la modificación.          |

**CU 09 - Revisión final del supervisor**

| Nombre          | Revisión final incidencia           |   CU 09  |
|-----------------|------------------------------------------------|
| Resumen         | Después de la revisión técnica, el supervisor  |
|                 | debe revisar lo indicado por los técnicos y    |
|                 | firmar la incidencia.                          |
|-----------------|------------------------------------------------|
| Actores         |                 Supervisor                     |
|-----------------|------------------------------------------------|
| Pre Condiciones | Se accede desde la cuenta de un supervisor, se |
|                 | accede a una incidencia en estado "revisado    |
|                 | por técnicos" y selecciona la opción de        |
|                 | revisión final.                                |
|-----------------|------------------------------------------------|
| Flujos          | # |  Flujo principal  | # | Flujo alternativo  |
|-----------------|------------------------------------------------|
|                 | 1 | Se selecciona la  |   |                    |
|                 |   | opción de firmar  |   |                    |
|                 |   | electronicamente  |   |                    |
|-----------------|------------------------------------------------|
|                 | 2 | El sistema        |   |                    |
|                 |   | pregunta si se    |   |                    |
|                 |   | esta seguro       |   |                    |
|-----------------|------------------------------------------------|
|                 | 3 | El sistema        |   |                    |
|                 |   | deja la firma en  |   |                    |
|                 |   | la incidencia con |   |                    |
|                 |   | la firma de la    |   |                    |
|                 |   | cuenta            |   |                    |
|-----------------|------------------------------------------------|
|                 |   |                   |3.1| El sistema avisa   |
|                 |   |                   |   | que no hay firma   |
|                 |   |                   |   | guardada en la     |
|                 |   |                   |   | cuenta             |
|-----------------|------------------------------------------------|
| PostCondiciones | Se guarda la modificación de la incidencia y   |
|                 | se cambia el estado a "finalizada", se guarda  |
|                 | la hora de la modificación.                    |

**CU 10 - Acceder a menu del sistema**

| Nombre          | Acceso al sistema por la cuenta     |   CU 10  |
|-----------------|------------------------------------------------|
| Resumen         | Al ingresar al sistema, se debe elegir el tipo |
|                 | de cuenta al que se quiere ingresar, pues cada |
|                 | cuenta tiene distintos privilegios y opciones. |
|-----------------|------------------------------------------------|
| Actores         | Jefe de turno, técnicos, supervisor            |
|-----------------|------------------------------------------------|
| Pre Condiciones | Se ingresa al sistema desde cualquier          |
|                 | dispositivo, se debe tener cuenta desde antes. |
|-----------------|------------------------------------------------|
| Flujos          | # |  Flujo principal  | # | Flujo alternativo  |
|-----------------|------------------------------------------------|
|                 | 1 | Se selecciona el  |   |                    |
|                 |   | tipo de cuenta a  |   |                    |
|                 |   | ingresar          |   |                    |
|-----------------|------------------------------------------------|
|                 | 2 | Se ingresa el     |   |                    |
|                 |   | correo asociado a |   |                    |
|                 |   | la cuenta         |   |                    |
|-----------------|------------------------------------------------|
|                 | 3 | Se ingresa la     |   |                    |
|                 |   | contraseña de     |   |                    |
|                 |   | la cuenta         |   |                    |
|-----------------|------------------------------------------------|
|                 | 4 | Se selecciona el  |   |                    |
|                 |   | boton de aceptar  |   |                    |
|-----------------|------------------------------------------------|
|                 |   |                   |4.1| El sistema avisa   |
|                 |   |                   |   | que el correo o la |
|                 |   |                   |   | constraseña es     |
|                 |   |                   |   | incorrecta         |
|-----------------|------------------------------------------------|
|                 |   |                   |4.2| El sistema         |
|                 |   |                   |   | devuelve a la      |
|                 |   |                   |   | selección del tipo |
|                 |   |                   |   | de cuenta          |
|-----------------|------------------------------------------------|
| PostCondiciones | Se ingresa con el tipo de cuenta y se muestra  |
|                 | el menu del sistema.                           |


## Requisitos Funcionales

1- El sistema debe permitir la creación de incidencias que describen los incidentes de los robots, permitiendo agregar los detalles del registro inicial del incidente, es decir, un nombre, una fecha y hora, el lugar del incidente y fichas que identifican a cada robot que está involucrado en la incidencia.

2- El sistema debe permitir la modificación de las incidencias, de la siguiente forma:

a. Pasando a estado "revisado", luego de la revisión inicial de la incidencia, agregando una clasificación, el nivel de gravedad y la asignación de técnicos.

b. Pasando a estado "revisado por técnicos", luego de que los técnicos revisen los robots involucrados en la incidencia y se agregue una descripción de lo acontecido en la revisión técnica y el nuevo estado de los robots posterior a la revisión.

c. Pasando a estado "finalizado", luego de que un supervisor revise los detalles de la revisión técnica y lo apruebe con una firma.

3- El sistema debe permitir el filtrado y busqueda de las incidencias guardadas en el sistema, se debe permitir buscar una incidencia por su ID y filtrar según el nombre, fecha y estado, por lo mínimo.

4- El sistema debe guardar la fecha y hora de la creación y modificación de cada incidencia. El formato de fecha y hora debe seguir el formato decidido por la empresa.

5- El sistema debe dar la opción de generar un reporte mensual (ultimos 30 dias) y un reporte anual (del año cursado), donde se de un resumen de las incidencias creadas y modificadas por en el marco de tiempo utilizado.

6- El sistema debe tener un registro de usuarios, con un correo y contraseña individual. Se debe separar las cuentas por el tipo, siendo las opciones:

a. Jefe de turno

b. Técnico

c. Supervisor

7- El sistema debe tener un panel adminsitrativo, de uso exclusivo, que permita gestionar los usuarios y monitorear el sistema.

8- El sistema debería permitir eliminar una incidencia, teniendo que confirmar la eliminación para no eliminar accidentalmente una incidencia correctamente guardada.

## Requisitos No Funcionales

1- El sistema debe ser responsivo según el dispositivo utilizado para acceder al sistema, sea un pc, notebook, tablet o teléfono movil.

2- El sistema debe ser accesible por una variedad de dispositivos moviles y de computadores.

3- El sistema debe facilitar el registro y consulta de datos para usuarios con distintos niveles de experiencia tecnológica, por lo que debe ser simple.

4- El sistema debe ser confiable en la seguridad de los datos, debe garantizar que los datos sean precisos y trazables para mantener la eficiencia de la gestión de inventario automatizado.

5- El sistema debe mejorar la eficiencia del manejo de las incidencias, reduciendo los tiempos que actualmente se utilizan para crear los reportes y coordinar los equipos mediante la automatización.

6- El sistema debería estar operable en cualquier momento durante el funcionamiento de la empresa, en caso contrario, debería ser solucionado a la brevedad para que vuelva a estar operativo.

## Priorización de Requerimientos

- **Priorización Alta**: Los requerimientos de creación y modificación de las incidencias de robots, de filtrado y búsqueda de estas, los reportes mensuales y anuales, y de registro de usuarios tienen una priorización alta, pues son requeridos para el correcto funcionamiento del sistema para manejar las incidencias como se manejan fisicamente en la actualidad y son el principal foco del proyecto. El requerimiento de la facilidad de uso, la precisión y seguridad de los datos, y la mejora en eficiencia del sistema también tienen una prioridad alta, pues son los objetivos del sistema y son esenciales para que el sistema sea lo que la empresa busca.

- **Priorización Media**: El requerimiento de guardado de fechas al modificar y crear una incidencia tiene prioridad media, pues es importante para mejorar la eficiencia del proceso y permitir la trazabilidad de las incidencias, pero puede ser guardado manualmente, perdiendo eficiencia, pero manteniendo la trazabilidad. El requerimiento de un panel administrativo tiene una priorización media, pues es útil para que un encargado en la empresa pueda crear y seguir las cuentas que se utilizan en el sistema, pero no es lo más importante en el proceso de las incidencias y no debería ser igualmente priorizado en comparación a otros requisitos funcionales. Los requisitos de responsividad, accesibilidad y operabilidad son importantes para el sistema, pues se busca que el sistema sea utilizado en una variedad de equipos, además de que debería ser operativo en cualquier momento de la ejecución de los trabajos de la empresa, pero no cumplirlos no afectaría en igual medida a los otros requisitos no funcionales que tienen un impacto mayor en el proyecto.

- **Priorización Baja**: El requerimiento de menor importancia es el de eliminación de incidencias, pues resulta útil en caso de que se cree accidentalmente una incidencia, pero no tiene un impacto importante en el sistema y no ha sido solicitado explicitamente por el cliente.

## Reglas de Negocio

- El sistema debe seguir los formatos que se utilizan actualmente en la empresa, por ejemplo, seguir el formato de fecha y hora, y seguir los estados que se manejan actualmente de las incidencias, luego de la creación inicial del jefe de de turno, la revisión inicial del supervisor, la revisión técnica y la revisión final del supervisor.

- Se debería tener una cuenta para cada persona de la empresa, que utilice el sistema, y que tenga los permisos necesarios para ejercer sus funciones relacionadas a las incidencias de los accidentes de robots.

- Se debe mantener o mejorar los reportes mensuales y anuales que actualmente crean los supervisores de la empresa, pues son utilizados para evaluar el desempeño de la automatización de la empresa y la evaluación de las incidencias.

## Diagramas de la solución

## Supuestos

- Se supone que una misma persona no tendrá más de una cuenta en el sistema, pues debería solo cumplir un cierto rol en la empresa y con los permisos que el sistema le brinda debería permitirle cumplir sus funciones relacionadas al sistema.

- Se supone que se tendrá una lista de los robots manejados en la empresa, con su propio ID definido, para ser guardado en el sistema y facilitar el manejo de las fichas de robots.

- Se supone que hay una lista actualizada de los empleados de la empresa que utilizarán el sistema, para crear cuentas antes del uso oficial del sistema.

- Se supone que se brindará información, se permitirá una entrevista o se permitirá acceso a los documentos que se manejan actualmente en las etapas de la incidencia.

## Plan de Prueba

1- Se debe probar el correcto funcionamiento de la creación y modificación de incidencias, revisando tanto los datos guardados en el backend y que el frontend reaccione correctamente a la interacción de los usuarios con los formularios que se presentan en cada etapa. Además, se debe probar que cada tipo de usuario solo pueda acceder a las modificaciones que deben utilizar durante el proceso. *(Prueba funcional)* **Valida requerimientos de creación y modificación de incidencias**.

2- Constatar que los filtrados y busquedas de incidencias funcionen correctamente, comparandolos con los datos de incidencias guardados en el backend. *(Prueba funcional)* **Valida requerimiento de filtrado de incidencias**.

3- Revisar que los incidentes efectivamente sean eliminados en el backend en el caso de que se confirme la eliminación, es importante esta confirmación y que ocurra siempre, pues evita posibles errores. *(Prueba funcional)* **Valida requerimiento de eliminación de incidencias**.

4- Revisar el funcionamiento del acceso al menú, que sea facil el seleccionar un tipo de cuenta y que se pueda acceder correctamente con el correo y contraseña correspondiente, es crucial revisar que el correo y contraseña correspondan a una cuenta del tipo correcto, además de revisar en el backend que efectivamente existe la cuenta. *(Prueba funcional)* **Valida requerimiento de manejo de cuentas**.

5- Revisar que efectivamente se cambie automaticamente el estado, se guarde la fecha y hora de la modificación de una incidencia cuando un usuario realice esta acción. Se debe revisar que estos datos guardados sean correctos. *(Prueba no funcional)* **Valida requerimientos de creación y modificación de incidencias**.

6- Revisar que los datos del reporte sean correctos, pues son esenciales para la administración de la empresa. *(Prueba de aceptación)* **Valida requerimiento de reportes estadisticos**.

7- Probar que el sistema sea accesible y responsivo con distintos dispositivos. Se debe tener una variedad de estos, en tamaño y hardware. *(Prueba no funcional)* **Valida requerimientos de accesibilidad y responsividad**.

8- Se debe probar la facilidad de uso del sistema con empleados de distinto nivel de experiencia tecnologica de la empresa, esto para mantener un bien nivel de simplicidad. *(Prueba de aceptación)* **Valida requerimiento de facilidad**.

9- Probar que se mejora la eficiencia del manejo de las incidencias en comparación a las incidencias físicas, esto se debe hacer cuando ya se lleven meses utilizando el sistema. *(Prueba no funcional)* **Valida requerimiento de mejora de eficiencia**.

10- No se va a probar la operabilidad, pues eso se verá en el funcionamiento del sistema en el dia a dia de la empresa. Tampoco se probará el panel administrativo, pues no es una prueba que tiene prioridad y ya se estan probando el manejo de cuentas.