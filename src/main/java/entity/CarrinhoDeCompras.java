package entity;

import exception.ProdutoInvalidoException;
import exception.ProdutoNaoEncontradoException;
import interfaces.Produto;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {
        private List<Produto> itens;

    public CarrinhoDeCompras() {
        this.itens = itens;
    }


    public void adicionarItem(ProdutoBase produto) throws ProdutoInvalidoException{
        if (produto == null || produto.getNome() == null || produto.getNome().isEmpty() || produto.getPreco() <= 0 || produto.getQuantidade() <= 0) {
            throw new ProdutoInvalidoException("Produto inválido: " + produto);
        }
        this.itens.add(produto);
    }


    public void removerItem(ProdutoBase produto) throws ProdutoNaoEncontradoException {
        boolean removed = this.itens.removeIf(p -> p.getNome().equals(produto.getNome()) && p.getQuantidade() == produto.getQuantidade());
        if (!removed) {
            throw new ProdutoNaoEncontradoException("Produto não encontrado: " + produto);
        }
    }

    public void listarItens() {
        for (Produto item : itens) {
            itens.add(item);
            System.out.println(item.exibirDetalhes());
            System.out.println("-------------------");
        }
    }



    public double calcularTotal() throws Exception {
        double total = 0;
        for (Produto item : itens) {
            if (item.getPreco() < 0 || item.getQuantidade() < 0) {
                throw new Exception("Erro no cálculo: preço ou quantidade negativa");
            }
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void gerarArquivoTexto(String nomeArquivo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            writer.write("Item:\tQtd:\tNome:\t\tPreço:\tSubTotal:\n");
            int itemNum = 1;
            for (Produto item : itens) {
                double subtotal = item.getPreco() * item.getQuantidade();
                writer.write(itemNum + "\t" + item.getQuantidade() + "\t" + item.getNome() + "\t" + item.getPreco() + "\t" + subtotal + "\n");
                itemNum++;
            }
            writer.write("Total:\t" + calcularTotal() + "\n");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
