/*
 Desenvolva, usando a UML (diagrama de classe), uma classe que modele um objeto
paralelepípedo em conformidade com o paradigma orientado a objeto. Posteriormente
implemente esta classe. A classe deverá ter as seguintes características: altura, largura,
comprimento, calcular volume e calcular área. O cálculo do volume (altura * comprimento *
largura) e o cálculo da área ( 2.0 * (altura * largura + altura * comprimento + largura *
comprimento)).
 */
package classes;

public class Paralelepipedo {

    private double altura = 0;
    private double largura = 0;
    private double comprimento = 0;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double GetComprimento(){
        return comprimento;
    }
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }
    public double calculaAreaParalelepipedo (){
        return ( 2.0 * (altura * largura + altura * comprimento + largura *
comprimento));
    }
    public double calculaVolumeParalelepipedo(){
        return (altura * comprimento * largura); 
    }
    @Override
    public String toString(){
        return String.format("%s: %.2f\n%s: %.2f","A área do paralelepipedo é:", calculaAreaParalelepipedo()
        ,"O Volume do paralelepipedo é:", calculaVolumeParalelepipedo());
    }
    

}
