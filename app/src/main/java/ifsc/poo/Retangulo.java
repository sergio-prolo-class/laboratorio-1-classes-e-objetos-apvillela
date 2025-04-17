package ifsc.poo;

public class Retangulo {
    private float largura;
    private float altura;
    private float area;
    private float perimetro;

    public static Retangulo maiorRetangulo;
    public static Retangulo menorRetangulo;

    public Retangulo(float altura, float largura) {
        setAltura(altura);
        setLargura(largura);

        if (maiorRetangulo == null || this.getArea() > maiorRetangulo.getArea()) {
            maiorRetangulo = this;
        }
        if (menorRetangulo == null || this.getPerimetro() < menorRetangulo.getPerimetro()) {
            menorRetangulo = this;
        }
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getArea() {
        float area = (this.altura * this.largura);
        return area;
    }

    public float getPerimetro() {
        float perimetro = ((2 * this.altura) + (2 * this.largura));
        return perimetro;
    }

}