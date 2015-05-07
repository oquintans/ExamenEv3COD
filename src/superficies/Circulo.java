package superficies;

/**
 * Clase modelo para instanciar circulos
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
     * @return radio
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
