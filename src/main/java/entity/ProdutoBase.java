package entity;

public abstract class  ProdutoBase implements interfaces.Produto {

    private String tipo;
    private String nome;
    private double preco;
    private int quantidade;


    public ProdutoBase(String tipo, String nome, double preco, int quantidade) {
        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public ProdutoBase() {
    }

    @Override

    public abstract String exibirDetalhes() ;

    @Override
    public String getTipo() {
        return tipo;
    }
    public void setTipo() {
        this.tipo=tipo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setNome(String nome) {
       this.nome = nome;

    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;

    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade =quantidade;

    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }



}
