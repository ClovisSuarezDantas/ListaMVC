package model;

public class Pessoa {
    private String nome;
    private String endereco;
    private int anoNascimento;
    private boolean fezAniversario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public boolean isFezAniversario() {
        return fezAniversario;
    }

    public void setFezAniversario(boolean fezAniversario) {
        this.fezAniversario = fezAniversario;
    }

    public int getIdade() {
        int idadeAtual = java.time.Year.now().getValue() - anoNascimento;
        if (!fezAniversario) {
            idadeAtual--;
        }
        return idadeAtual;
    }
}
