/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Vista {

    public String pedirFigura() {
        String respuesta;
        do {
            respuesta = JOptionPane.showInputDialog("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
            if (!"square".equalsIgnoreCase(respuesta) || !"circle".equalsIgnoreCase(respuesta) || !"triangle".equalsIgnoreCase(respuesta) || !"rectangle".equalsIgnoreCase(respuesta)) {
                JOptionPane.showMessageDialog(null, "Error, no valido.");
            }
        } while (!"square".equalsIgnoreCase(respuesta) || !"circle".equalsIgnoreCase(respuesta) || !"triangle".equalsIgnoreCase(respuesta) || !"rectangle".equalsIgnoreCase(respuesta));
        return respuesta;
    }

    public float calcAreaCuadrado(Cuadrado c) {
        c = new Cuadrado();
        float lado = Float.parseFloat(JOptionPane.showInputDialog("What is the side length?"));
        c.setLado(lado);
        float area = lado * lado;
        c.setArea(area);
        return area;
    }

    public float calcAreaRectangulo(Rectangulo r) {
        r = new Rectangulo();
        float alto = Float.parseFloat(JOptionPane.showInputDialog("what is the rectangles width?"));
        float largo = Float.parseFloat(JOptionPane.showInputDialog("what is the rectangles height?"));
        r.setAlto(alto);
        r.setLargo(largo);
        float area = alto * largo;
        r.setArea(area);
        return area;
    }

    public float calcAreaTriangulo(Triangulo t) {
        t = new Triangulo();
        float base = Float.parseFloat(JOptionPane.showInputDialog("What is the base length of the triangle?"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("What is the height of the triangle?"));
        t.setBase(base);
        t.setAltura(altura);
        float area = (float) (0.5 * base * altura);
        t.setArea(area);
        return area;
    }

    public float calcAreaCirculo(Circulo c) {
        c = new Circulo();
        float radio = Float.parseFloat(JOptionPane.showInputDialog("What is the radius of the circle?"));
        c.setRadio(radio);
        float area = (float) (Math.PI * (radio * radio));
        c.setArea(area);
        return area;
    }
}
