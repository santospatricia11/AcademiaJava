package entity;

public class Roupa extends ProdutoBase{
    private String tamanho;
    private String cor;


    public Roupa(String tipo, String nome, double preco, int quantidade, String tamanho, String cor) {
        super(tipo, nome, preco, quantidade);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public Roupa(String tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String exibirDetalhes() {
        return "Tipo: " + getTipo() +
                "\nNome: " + getNome() +
                "\nPreço: " + getPreco() +
                "\nQuantidade: " + getQuantidade() +
                "\nTamanho: " + tamanho +
                "\nCor: " + cor;
    }
}
