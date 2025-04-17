package ifsc.poo;

public class Lampada {

    private boolean ligada = false;

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