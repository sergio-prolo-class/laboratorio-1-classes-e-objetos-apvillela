package ifsc.poo;

public class Retangulo {
    private float largura;
    private float altura;

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getArea(){
        float area = (this.altura * this.largura);
        return area;
    }

    public float getPerimetro(){
        float perimetro = ((2*this.altura) + (2*this.largura));
        return perimetro;
    }
    
}