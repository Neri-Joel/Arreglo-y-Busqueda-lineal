package com.tcca;
import java.util.Scanner;

public class PruebaBusquedaLineal
{
public static void main( String args[] )
{
// crea objeto Scanner para los datos de entrada
Scanner entrada = new Scanner( System.in );

int enteroBusqueda; // clave de búsqueda
int posicion; // ubicación de la clave de búsqueda en el arreglo

// crea el arreglo y lo muestra en pantalla
ArregloLineal arregloBusqueda = new ArregloLineal( 10 );
System.out.println( arregloBusqueda ); // imprime el arreglo

// obtiene la entrada del usuario
System.out.print(
"Escriba un valor entero (-1 para terminar): " );
enteroBusqueda = entrada.nextInt(); // lee el primer entero del usuario

// recibe en forma repetida un entero como entrada; -1 termina el programa
while ( enteroBusqueda != -1 )
{
// realiza una búsqueda lineal
posicion = arregloBusqueda.busquedaLineal( enteroBusqueda );

if ( posicion == -1 ) // no se encontró el entero
System.out.println( "El entero " + enteroBusqueda +
" no se encontro.\n" );
else // se encontró el entero
System.out.println( "El entero " + enteroBusqueda +
" se encontro en la posicion " + posicion + ".\n" );

// obtiene la entrada del usuario
System.out.print(
"Escriba un valor entero (-1 para terminar): " );
enteroBusqueda = entrada.nextInt(); // lee el siguiente entero del usuario
} // fin de while
} // fin de main
} // fin de la clase PruebaBusquedaLineal
