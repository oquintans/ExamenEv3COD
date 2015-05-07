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
public class Triangulo {
    
    //Base del Triángulo
    private float base;
    //Altura del Triángulo
    private float altura;
    //Area del Triángulo
    private float area;

    /**
     *
     */
    public Triangulo() {
    }

    /**
     *
     * @param base
     * @param altura
     * @param area
     */
    public Triangulo(float base, float altura, float area) {
        this.base = base;
        this.altura = altura;
        this.area = area;
    }

    /**
     *
     * @return
     */
    public float getBase() {
        return base;
    }

    /**
     *
     * @param base
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     *
     * @return
     */
    public float getAltura() {
        return altura;
    }

    /**
     *
     * @param altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
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
