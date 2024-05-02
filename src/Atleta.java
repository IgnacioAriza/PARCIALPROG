import java.lang.Math;

public class Atleta extends Persona implements Contrato{
    private double altura;
    private int edad;
    private double peso;

    public Atleta(int dni, String nombre, double altura, int edad, double peso){
        super(dni, nombre);
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calculaIMC(double altura, double peso){
        return (peso/(altura*altura));
    }

    @Override
    public boolean hayPesoExtra(double imc){
        if (imc < 25){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public double tomarPulsaciones(){
        return ((Math.random()+1)*12);
    }
}
