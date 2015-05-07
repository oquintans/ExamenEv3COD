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
    
}
