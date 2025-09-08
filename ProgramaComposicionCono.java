/**
/Clase que contiene el metodo main como punto de entrada del programa
*/
public class ProgramaComposicionCono {
 //Metodo que recibe un objeto y lo muestra por pantalla
 private static void imprimir(Object datos) {
 System.out.println(datos);
  }
  //Metodo principal que se ejcuta al iniciar el programa
  public static void main(String[] args) {
  //Se crea un objeto de la clase Random para generar numeros aleatorios
  java.util.Random aleatorio = new java.util.Random();
    // Bucle que se ejecuta cinco veces
    for (int i = 1; i <= 5; i++) {
      // Generar un número aleatorio para el radio
      int radio = aleatorio.nextInt(9) + 1;
    // Crear un nuevo objeto Cono con coordenadas (0,0), radio aleatorio, altura i, y color "Azul"
   Cono cono = new Cono(0, 0, radio, i, "Rosa");
  // Llamar al método imprimir en el objeto Cono para imprimir sus atributos
 cono.imprimir();
    }
  }
}
  