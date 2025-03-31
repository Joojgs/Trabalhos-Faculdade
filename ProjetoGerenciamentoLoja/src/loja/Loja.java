package loja;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	private List<Cliente> clientes;
    private List<Produto> estoque;
    private List<CarrinhoDeCompras> vendasFinalizadas;
    private CarrinhoDeCompras vendaEmAndamento;

    public Loja() {
        clientes = new ArrayList<>();
        estoque = new ArrayList<>();
        vendasFinalizadas = new ArrayList<>();
        vendaEmAndamento = null;
    }

    public void cadastrarCliente(Cliente novoCliente) {
        clientes.add(novoCliente);
    }
    public Cliente pesquisarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }

    public void cadastrarProduto(Produto novoProduto) {
        estoque.add(novoProduto);
    }

    public boolean iniciarVenda(String nomeCliente) {
        Cliente cliente = pesquisarCliente(nomeCliente);
        if (cliente != null) {
            vendaEmAndamento = new CarrinhoDeCompras(cliente);
            return true;
        }
        return false;
    }
    public boolean adicionarProduto(int codigo, int quantidade, double desconto) {
        if (vendaEmAndamento != null) {
            for (Produto produto : estoque) {
                if (produto.getCodigo() == codigo) {
                    return vendaEmAndamento.adicionarProduto(produto, quantidade, desconto);
                }
            }
        }
        return false;
    }

    public double fecharVenda() {
        if (vendaEmAndamento != null) {
            double total = vendaEmAndamento.obterValorTotal();
            vendasFinalizadas.add(vendaEmAndamento);
            vendaEmAndamento = null;
            return total;
        }
        return 0;
    }
    
    public CarrinhoDeCompras getVendaEmAndamento() {
        return vendaEmAndamento;
    }
}
