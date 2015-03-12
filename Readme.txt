================================================================================
=========================VEHÍCULO A CONTROL REMOTO==============================
================================================================================

Instrucciones:
--------------

. El archivo P_ingreso_vehiculo.jar se debe ejecutar desde una consola de comandos. 
	. Desde Windows, ejecutar el menu Inicio .
	. Haga clic en la opción Run Ejecutar.
	.Escriba en el recuadro "cmd" y haga clic en OK para abrir la consola.
	
	.  o pulse Tecla de Windows + R, escriba en el recuadro "cmd" y haga clic en OK para abrir la consola.

. Escribir el comando en la consola : java -jar (y la ubicacion donde se tenga el .jar).
	. Ej: java - jar C:\Users\Documents\NetBeansProjects\P_ingreso_vehiculo\dist\P_ingreso_vehiculo.jar

. Le pedira dos numeros enteros para generar la superficie de desplazamiento nxm , primero las filas , despues las columnas.
. Le pedira escribir los comandos para desplazar el vehiculo.
	. Los comandos sobre el vehículo serán en formato <Desplazamiento>,<Dirección>. 
		.Ej: 5,N.
	. El <Desplazamiento> debe ser escrito con un numero entero.
	. La <Dirección> son los puntos carinales N(Norte),S(Sur),E(Este),O(Oeste).
	. Puede escribir una serie de comandos separados por el signo ; (punto y coma).
		.Ej: 5,N;4,E  (5 posiciones en la direcion Norte, 4 posiciones en la direccion Este).
. Se procesa los movimientos desde la posicion [0][0] de la superficie de desplazamiento.
. Se muestra un mensaje, con la linea de comando ejecutada, la posicion en la que el vehiculo quedo, y el tamaño de la superifie.
. Le pregunta si desea continuar con el siguiente movimiento, pero este a partir del punto donde termino el vehiiulo ubicado.
	. Si su opcion es continuar, debera escribir otra linea de comando donde el vehiculo se desplazara.
	. Si su opcion es no continuar, decide salir.

================================================================================
==============================Creado Por========================================
================================================================================

Stephanie Margarita Calderón Tapia
CC. 1122649064 

================================================================================