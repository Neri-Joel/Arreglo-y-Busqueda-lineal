package com.tcca;
import java.util.Random;

public class ArregloLineal
{
private int[] datos; // arreglo de valores
private static Random generador = new Random();

// crea un arreglo de un tama�o dado, y lo rellena con enteros aleatorios
public ArregloLineal( int tamanio )
{
datos = new int[ tamanio ]; // crea un espacio para el arreglo

// llena el arreglo con valores int aleatorios, en el rango de 10 a 99
for ( int i = 0; i < tamanio; i++ )
datos[ i ] = 10 + generador.nextInt( 90 );
} // fin del constructor de ArregloLineal

// realiza una b�squeda lineal en los datos
public int busquedaLineal( int claveBusqueda )
{
// itera a trav�s del arreglo en forma secuencial
for ( int indice = 0; indice < datos.length; indice++ )
if ( datos[ indice ] == claveBusqueda )
return indice; // devuelve el �ndice del entero

return -1; // no se encontr� el entero
} // fin del m�todo busquedaLineal

// m�todo para imprimir los valores del arreglo
public String toString()
{
StringBuilder temporal = new StringBuilder();

// itera a trav�s del arreglo
for ( int elemento : datos )
temporal.append( elemento + " " );

temporal.append( "\n" ); // agrega el car�cter de nueva l�nea
return temporal.toString();
} // fin del m�todo toString
} // fin de la clase ArregloLineal
