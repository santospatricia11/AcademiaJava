package entity;
import java.io.IOException;
import java.util.Date;
public class ProgramaPrincipal {


    public static void main(String[] args) {
        try {

            CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
            carrinho1.adicionarItem(new Eletronico("Eletrônico", "Celular", 2999.0, 3, 24));
            carrinho1.adicionarItem(new Roupa("Roupa", "Blusa", 89.99, 6, "M", "Azul"));
            carrinho1.adicionarItem(new Alimento("Alimento", "Arroz", 9.99, 4, new Date()));

            CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();
            carrinho2.adicionarItem(new Eletronico("Eletrônico", "Notebook", 4999.0, 2, 36));
            carrinho2.adicionarItem(new Roupa("Roupa", "Casaco", 199.99, 2, "L", "Preto"));

            System.out.println("Itens no primeiro carrinho:");
            carrinho1.listarItens();
            System.out.println("Total do primeiro carrinho: " + carrinho1.calcularTotal());
            carrinho1.gerarArquivoTexto("carrinho1.txt");

            System.out.println("Itens no segundo carrinho:");
            carrinho2.listarItens();
            System.out.println("Total do segundo carrinho: " + carrinho2.calcularTotal());
            carrinho2.gerarArquivoTexto("carrinho2.txt");

        } catch (IOException e) {
            System.err.println("Erro ao gerar o arquivo de texto: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }


}

