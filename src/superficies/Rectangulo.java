/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

/**
 *
 * @author oquintansocampo
 */
public class Rectangulo {
    
    //Altura del Rectangulo
    private float alto;
    //Ancho o Largo del Rectangulo
    private float largo;
    //Area del rectangulo
    private float area;

    /**
     *
     */
    public Rectangulo() {
    }

    /**
     *
     * @param alto
     * @param largo
     * @param area
     */
    public Rectangulo(float alto, float largo, float area) {
        this.alto = alto;
        this.largo = largo;
        this.area = area;
    }

    /**
     *
     * @return
     */
    public float getAlto() {
        return alto;
    }

    /**
     *
     * @param alto
     */
    public void setAlto(float alto) {
        this.alto = alto;
    }

    /**
     *
     * @return
     */
    public float getLargo() {
        return largo;
    }

    /**
     *
     * @param largo
     */
    public void setLargo(float largo) {
        this.largo = largo;
    }

    /**
     *
     * @return
     */
    public float getArea() {
        return area;
    }

    /**
     *
     * @param area
     */
    public void setArea(float area) {
        this.area = area;
    }

}
