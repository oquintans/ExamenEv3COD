/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

/**
 * Clase modelo para instanciar cuadrados
 * @author oquintansocampo
 */
public class Cuadrado {

    //Valor del lado del cuadrado
    private float lado;
    //Area del cuadrado
    private float area;

    /**
     *
     */
    public Cuadrado() {
    }

    /**
     *
     * @param lado
     * @param area
     */
    public Cuadrado(float lado, float area) {
        this.lado = lado;
        this.area = area;
    }

    /**
     *
     * @return lado
     */
    public float getLado() {
        return lado;
    }

    /**
     *
     * @param lado
     */
    public void setLado(float lado) {
        this.lado = lado;
    }

    /**
     *
     * @return area
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
