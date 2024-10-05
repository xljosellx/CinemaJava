# Indicaciones
Programa orientado a objetos sobre un cine (solo de una sala) tiene un conjunto de asientos (8 filas por 9 columnas, por ejemplo).
Del cine nos interesa conocer la película que se está reproduciendo y el precio de la entrada en el cine.

* De las películas nos interesa saber el título, duración, edad mínima y director.
* Del espectador, nos interesa saber su nombre, edad y el dinero que tiene.
* Los asientos son etiquetados por una letra (columna) y un número (fila), la fila 1 empieza al final de la matriz como se muestra en la tabla. También deberemos saber si está ocupado o no el asiento.

![image](https://github.com/user-attachments/assets/ad7c03d5-3053-48ba-ac03-100d5aeb283f)

# Condiciones
Realizaremos una pequeña simulación, en el que generaremos muchos espectadores y los sentaremos aleatoriamente (no podemos donde ya este ocupado).
En esta versión sentaremos a los espectadores de uno en uno.

* Solo se podrá sentar si tienen el suficiente dinero, hay espacio libre y tiene edad para ver la película.
* En caso de que el asiento este ocupado le buscamos uno libre.
* Los datos del espectador y la película pueden ser totalmente aleatorios.
* Cada vez que se asigne un asiento debe mostrar un mensaje que indique el nombre del espectador y número de asiento asignado; luego preguntar si quiere asignar otro asiento,
  mostrar los asientos asignados y pendientes de asignar o finalizar el programa.
