# Verificación y Validación del Software 2021
GRUPO IWM-42-1

## Instrucciones para ejecutar las pruebas

### 1º Clonar el repositorio remoto en uno local

    https://github.com/cturienzo/vv_integracion.git

### 2º Importar el proyecto con un IDE (Eclipse o IntelliJ) como un proyecto Maven.

<p align="center">
    <img alt="captura 1" src="./images/captura1.jpg?raw=true" />
    <img alt="captura 2" src="./images/captura2.jpg?raw=true" />
</p>

### 3º Desde el IDE, ejecutar el programa con la opción **Run As > Maven install** para descargar las librerías con las que hay dependencias.

<img alt="captura 3" src="./images/captura3.jpg?raw=true" />
*Si en algún momento falla el Maven install, se debe ejecutar Maven clean (para limpiar los resultados de compilaciones anteriores) y después Maven install de nuevo.

### 4º Una vez se han instalado correctamente las librerías de JUnit y SingleLinkedList, se pueden ejecutar los test de la carpeta *src/test/java* con la opción **Run As > JUnit Test**
