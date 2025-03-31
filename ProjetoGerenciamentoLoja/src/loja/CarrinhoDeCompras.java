package loja;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	    private List<ItemCarrinho> itens;
	    private Cliente cliente;

	    public CarrinhoDeCompras(Cliente cliente) {
	        this.itens = new ArrayList<>();
	        this.cliente = cliente;
	    }

	    public boolean adicionarProduto(Produto produto, int quantidade, double desconto) {
	        ItemCarrinho item = new ItemCarrinho(produto, quantidade, desconto);
	        itens.add(item);
	        return true;
	    }

	    public double obterValorTotal() {
	        double total = 0;
	        for (ItemCarrinho item : itens) {
	            total += item.obterCusto();
	        }
	        return total;
	    }

	    public String toString() {
	        StringBuilder conteudo = new StringBuilder("Cliente: " + cliente.getNome() + "\nItens no carrinho:\n");
	        for (ItemCarrinho item : itens) {
	            conteudo.append(String.format("- Produto: %d, Quantidade: %d, Custo: R$%.2f\n",
	                    item.getProduto().getCodigo(), item.getQuantidade(), item.obterCusto()));
	        }
	        conteudo.append(String.format("Total: R$%.2f", obterValorTotal()));
	        return conteudo.toString();
	    }
	}
