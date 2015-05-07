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

    public Circulo() {
    }

    public Circulo(float radio, float areaC) {
        this.radio = radio;
        this.area = areaC;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAreaC() {
        return area;
    }

    public void setAreaC(float areaC) {
        this.area = areaC;
    }

}
