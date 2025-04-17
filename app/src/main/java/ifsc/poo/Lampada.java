package ifsc.poo;

public class Lampada {

    private boolean ligada = false;
    private int numeroDeLampadas = 0;

    public Lampada() {
        // construtor padrão
        this.ligada = false;
        numeroDeLampadas++;
    }

    // construtor caso passado um parametro ligado
    public Lampada(boolean ligada) {
        this.ligada = ligada;
        numeroDeLampadas++;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public boolean verEstado() {
        return ligada;
    }

}