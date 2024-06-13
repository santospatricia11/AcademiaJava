package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alimento extends ProdutoBase{
    private Date dataValidade;

    public Alimento(String tipo, String nome, double preco, int quantidade) {
        super(tipo, nome, preco, quantidade);
    }

    public Alimento(String alimento, String arroz, double v, int i, Date date) {
    }



    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String exibirDetalhes() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataValidadeFormatada = (dataValidade != null) ? sdf.format(dataValidade) : "N/A";

        return "Tipo: " + getTipo() +
                "\nNome: " + getNome() +
                "\nPreço: " + getPreco() +
                "\nQuantidade: " + getQuantidade() +
                "\nData de Validade: " + dataValidadeFormatada;
    }
}
