# Reproductor de Audio
El presente proyecto permite la ejecucion de archivos de audio especñificamente en el formato MP3.
### Dependencias
Para ejecutar el proyecto primero es necesario descargar la dependencia `jlayer`. En Intellij IDEA esto deberia realizarse automáticamente, sino se da clic derecho al archivo `pom.xml`, luego se elige la opción **Maven > Reload Project.**

### Archivos MP3
En la carpeta `audio` se alojan una serie de archivos descargados de https://freemusicarchive.org el cual provee archivos MP3 con licencia Creative Commons (CC BY-NC-ND 4.0).

## Uso
Para ejecutar el proyecto se puede ejecutar desde la clase `PlayerApp`. Luego en la ventana se busca un archivo mediante el botón `Open File` (Solo es permitido el uso de archivos MP3) y luego se reproduce con el botón `Play`.