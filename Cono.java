public class Cono {
 private Circuloo base;
 private float altura;
 private String color;
 /**
 * Constructor que crea e inicializa un cono a partir de sus parámetros
 *
 * @param cX coordenada X del centro del cono a crear
 * @param cY coordenada Y del centro del cono a crear
 * @param r radio del cono a crear
 * @param h altura del cono a crear
 * @param color color del cono a crear
 */
 public Cono (float cX, float cY, float r, float h, String color) { // constructor
 this.base = new Circuloo(cX, cY, r);
 this.altura = h;
 this.color = color;
 }
 /**
 * Obtiene la base
 * @return base
 */
 public Circuloo getBase() {
 return base;
 }
 /**
  * Le pone un valor a la base
  * @param base 
  */
 public void setBase(Circuloo base) {
 this.base = base;
 }
 /**
  *  Obtiene la altura
  * @return altura
  */
 public float getAltura() {
 return altura;
 }
 /**
  * Le pone un valor a la altura
  * @param altura 
  */
 public void setAltura(float altura) {
 this.altura = altura;
 }
 /**
  * Obtiene el color
  * @return color
  */
 public String getColor() {
 return color;
 }
 /**
  * Le pone un color
  * @param color 
  */
 public void setColor(String color) {
 this.color = color;
 }
 /**
  * Imprime en pantalla
  */
 public void imprimir () {
 base.imprimir(); 
 System.out.println(" h=" + altura + " c=" + color);
 }
}
