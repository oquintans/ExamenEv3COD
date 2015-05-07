package superficies;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Superficies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista v = new Vista();
        String fig;

        fig = v.pedirFigura();
        if (fig.equalsIgnoreCase("square")) {
            Cuadrado c = new Cuadrado();
            v.calcAreaCuadrado(c);
            JOptionPane.showMessageDialog(null, "The area for your square is: " + c.getArea());
        }

        if (fig.equalsIgnoreCase("rectangle")) {
            Rectangulo r = new Rectangulo();
            v.calcAreaRectangulo(r);
            JOptionPane.showMessageDialog(null, "The area for your rectangle is: " + r.getArea());
        }

        if (fig.equals("triangle")) {
            Triangulo t = new Triangulo();
            v.calcAreaTriangulo(t);
            JOptionPane.showMessageDialog(null, "The area for your triangle is: " + t.getArea());
        }

        if (fig.equals("circle")) {
            Circulo ci = new Circulo();
            v.calcAreaCirculo(ci);
            JOptionPane.showMessageDialog(null, "The area for your circle is: " + ci.getArea());
        }
    }
}
