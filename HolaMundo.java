/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 *
 * @author Gonzalo Iván Chaparro Barese
 */
public class HolaMundo {
  public static void main(String[] args) {
    String naranja = "\033[33m";
    String azul = "\033[34m";
    System.out.println(naranja "¡Hola" + azul + " mundo!");
  }
}
