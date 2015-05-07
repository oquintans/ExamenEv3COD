package superficies;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oquintansocampo
 */
public class Circulo {
    
    //Valor del radio del circulo
    private float radio;
    //Area del circulo
    private float area;

    /**
     *
     */
    public Circulo() {
    }

    /**
     *
     * @param radio
     * @param area
     */
    public Circulo(float radio, float area) {
        this.radio = radio;
        this.area = area;
    }

    /**
     *
     * @return
     */
    public float getRadio() {
        return radio;
    }

    /**
     *
     * @param radio
     */
    public void setRadio(float radio) {
        this.radio = radio;
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
