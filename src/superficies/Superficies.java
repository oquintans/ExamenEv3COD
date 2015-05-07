package superficies;

import javax.swing.JOptionPane;

public class Superficies {

    /**
     * Clase de ejecucion del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista v = new Vista();
        String fig;
        fig = v.pedirFigura();
        
        //Cuadrado
        if (fig.equalsIgnoreCase("square")) {
            Cuadrado c = new Cuadrado();
            v.calcAreaCuadrado(c);
            JOptionPane.showMessageDialog(null, "The area for your square is: " + c.getArea());
        } else {
            //Rectangulo
            if (fig.equalsIgnoreCase("rectangle")) {
                Rectangulo r = new Rectangulo();
                v.calcAreaRectangulo(r);
                JOptionPane.showMessageDialog(null, "The area for your rectangle is: " + r.getArea());
            } else {
                //Triangulo
                if (fig.equals("triangle")) {
                    Triangulo t = new Triangulo();
                    v.calcAreaTriangulo(t);
                    JOptionPane.showMessageDialog(null, "The area for your triangle is: " + t.getArea());
                } else {
                    //Circulo
                    if (fig.equals("circle")) {
                        Circulo ci = new Circulo();
                        v.calcAreaCirculo(ci);
                        JOptionPane.showMessageDialog(null, "The area for your circle is: " + ci.getArea());
                        //Ninguno de los anteriores
                    } else {
                        JOptionPane.showMessageDialog(null, fig + " no es una figura válida.");
                    }
                }
            }
        }
    }
}
