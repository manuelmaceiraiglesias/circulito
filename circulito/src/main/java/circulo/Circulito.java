package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulo
 * @author profesor
 */
/**Esta es la clase Circulito con sus atributos */
public class Circulito {
    private static final double LIMITERADIO = 0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;
/**Estos son los construcotres */
    public Circulito() {
    }

    /**
     *
     * @param valorX de la coordenada del eje X
     * @param valorY de la coordenda del eje Y
     * @param valorRadio del circulo
     */
    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }





    

/**@return esto obtiene el diametro del circulo*/
    public double obtenerDiametro() {
        return radio * 2;
    }
/**@return esto obtiene la longitud del circulo*/
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }
/**@return esto obtiene el area del circulo*/
    public double obtenerAreaCirculo() {
        return Math.PI * radio * radio;
    }

    @Override
    /**@return esto no se lo que hace*/
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     *
     * @param trasladarX esto cambia la posicion relativa
     * @param trasladarY esto cambia la posicion relativa
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        coordenadaX=coordenadaX + 5;
        coordenadaY=coordenadaY + 5;
    }

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = (radio < LIMITERADIO ? LIMITERADIO : radio);
        /** limiteradio establece coordenadas mayores que (0,0), en la refactorizacion lo ignoro */
    }
}
