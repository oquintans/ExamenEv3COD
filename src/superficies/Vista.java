/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import javax.swing.JOptionPane;

/**
 * Clase para pedir y calcular datos
 * N.A. todo los metodos de calcular devuelven el area calculada a parte de modificar los valores del objeto recibido. 
 * @author oquintansocampo
 */
public class Vista {

    /**
     * Metodo para pedir una figura
     * @return un String con la figura tecleada
     */
    public String pedirFigura() {
        String respuesta;
        respuesta = JOptionPane.showInputDialog("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        JOptionPane.showMessageDialog(null, "You said: " + respuesta);
        return respuesta;
    }

    /**
     * Metodo para pedir datos y calcular area del cuadrado
     * @param c objeto de la clase cuadrado
     * @return area del cuadrado
     */
    public float calcAreaCuadrado(Cuadrado c) {
        float lado = Float.parseFloat(JOptionPane.showInputDialog("What is the side length?"));
        c.setLado(lado);
        float area = lado * lado;
        c.setArea(area);
        return area;
    }

    /**
     * Metodo para pedir datos y calcular area del rectangulo
     * @param r objeto de la clase Rectangulo
     * @return area del rectangulo
     */
    public float calcAreaRectangulo(Rectangulo r) {
        float alto = Float.parseFloat(JOptionPane.showInputDialog("what is the rectangles width?"));
        float largo = Float.parseFloat(JOptionPane.showInputDialog("what is the rectangles height?"));
        r.setAlto(alto);
        r.setLargo(largo);
        float area = alto * largo;
        r.setArea(area);
        return area;
    }

    /**
     * Metodo para pedir datos y calcular area del triangulo
     * @param t objeto de la clase Triangulo
     * @return area del triangulo
     */
    public float calcAreaTriangulo(Triangulo t) {
        float base = Float.parseFloat(JOptionPane.showInputDialog("What is the base length of the triangle?"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("What is the height of the triangle?"));
        t.setBase(base);
        t.setAltura(altura);
        float area = (float) (0.5 * base * altura);
        t.setArea(area);
        return area;
    }

    /**
     * Metodo para pedir datos y calcular area del circulo
     * @param c objeto de la clase Circulo
     * @return area del circulo
     */
    public float calcAreaCirculo(Circulo c) {
        float radio = Float.parseFloat(JOptionPane.showInputDialog("What is the radius of the circle?"));
        c.setRadio(radio);
        float area = (float) (Math.PI * (radio * radio));
        c.setArea(area);
        return area;
    }
}
