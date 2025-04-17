package ifsc.poo;

public class Navio {

    // TODO ver se nao ta mt redundante para facilitar o resto

    private String nome; // atualizar no futuro pra fazer uma matriz com [P,5] char e tamanho
    private char tipo;
    private int tamanho;
    private int linha;
    private int coluna;
    private boolean orientacaoVertical; // true eh vertical, false é horizontal
    private boolean[] posicoesAtingidas;

    public Navio(String nome, char tipo, int tamanho, int linha, int coluna, boolean orientacaoVertical) {
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.linha = linha;
        this.coluna = coluna;
        this.orientacaoVertical = orientacaoVertical;
        this.posicoesAtingidas = new boolean[tamanho];
    }

    public int calcularPosicao(int linha, int coluna) {
        if (orientacaoVertical) {
            if (coluna == this.coluna && linha >= this.linha && linha < this.linha + tamanho) {
                return linha - this.linha;
            }
        } else {
            if (linha == this.linha && coluna >= this.coluna && coluna < this.coluna + tamanho) {
                return coluna - this.coluna;
            }
        }
        return -1;
    }

    public boolean verificarAtingido(int linha, int coluna) {
        int posicao = calcularPosicao(linha, coluna);
        if (posicao >= 0 && posicao < tamanho) {
            return posicoesAtingidas[posicao];
        }
        return false;
    }

    public boolean marcarAtingido(int linha, int coluna) {
        int posicao = calcularPosicao(linha, coluna);
        if (posicao >= 0 && posicao < tamanho && !posicoesAtingidas[posicao]) {
            posicoesAtingidas[posicao] = true;
            return true;
        }
        return false;
    }

    public boolean verificarAfundado() {
        for (boolean atingido : posicoesAtingidas) { // verifica todas as posições do
            if (!atingido) {// //////////////////////// do Array posicoesAtingidas
                return false;// /////////////////////// se todas forem true, if !atingido não dispara
            } ////////////////////////////////////////// retorna true e o navio ta afundado
        }
        return true;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public char getTipo() {
        return tipo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public boolean isOrientacaoVertical() {
        return orientacaoVertical;
    }
}
