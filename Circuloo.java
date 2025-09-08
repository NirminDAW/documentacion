package com.mycompany.circuloo;
public class Circuloo {
private float x, y;
private float radio;
/**
 * Constructor que crea e inicializa un cono a partir de sus parámetros
 *
 * @param cX coordenada X del centro del cono a crear
 * @param cY coordenada Y del centro del cono a crear
 * @param r radio del cono a crear
 */
public Circuloo (float cX, float cY, float r) { // constructor
this.x = cX;
this.y = cY;
this.radio = r;
 }
/**
 * Obtiene la coordenada X
 * @return 
 */
 public float getX() { 
     return x; 
 }
 /**
  * Le pone la coordenada X
  * @param x 
  */
 public void setX(float x) { 
         this.x = x;
 }
 /**
  * Obtiene la coordenada Y
  * @return 
  */
 public float getY() { 
     return y;
 }
 /**
  * Le pone la coordenada Y
  * @param y 
  */
 public void setY(float y) { 
     this.y = y; 
 }
 /**
  * Obtiene el radio
  * @return 
  */
 public float getRadio() { 
     return radio; 
 }
 /**
  * Le da un valor al radio
  * @param radio 
  */
 public void setRadio(float radio) { 
     this.radio = radio;
 }
 /**
  * Funcion para calcular el area
  * @return devuelve el valor del area
  */
 public float area() { 
     return (float)Math.PI*radio*radio;
 }
 /**
  * Imprime en pantalla
  */
 
 public void imprimir () {
 System.out.print(" x=" + x);
 System.out.print(" y=" + y);
 System.out.print(" r=" + radio);
 System.out.print(" A=" + area());
 }
}

