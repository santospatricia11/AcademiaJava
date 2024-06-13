package entity;

public class Eletronico extends ProdutoBase{

    private int garantiaMeses;




    public Eletronico(String tipo, String nome, double preco, int quantidade, int garantiaMeses) {
        super(tipo, nome, preco, quantidade);
        this.garantiaMeses = garantiaMeses;
    }

    public Eletronico(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String exibirDetalhes() {
        return "Tipo: " + getTipo() +
                "\nNome: " + getNome() +
                "\nPreço: " + getPreco() +
                "\nQuantidade: " + getQuantidade() +
                "\nGarantia: " + garantiaMeses + " meses";

    }
}
