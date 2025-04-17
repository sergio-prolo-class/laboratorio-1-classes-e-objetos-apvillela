package ifsc.poo;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio ou nulo");
        }
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public void felizAniversario() {
        idade++;
    }

}