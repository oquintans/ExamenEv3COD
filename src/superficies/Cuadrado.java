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
public class Cuadrado {

    //Valor del lado del cuadrado
    private float lado;
    //Area del cuadrado
    private float area;

    public Cuadrado() {
    }

    public Cuadrado(float lado, float area) {
        this.lado = lado;
        this.area = area;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    
}
