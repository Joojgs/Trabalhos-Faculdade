package loja;

import java.math.BigInteger;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Loja loja = new Loja();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
        	System.out.println("\n----------------------------------------");
            System.out.println("--- Sistema de Gerenciamento da Loja ---");
            System.out.println("----------------------------------------");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Produto");
            System.out.println("3 - Iniciar Venda");
            System.out.println("4 - Adicionar Produtos ao Carrinho");
            System.out.println("5 - Exibir Conteúdo do Carrinho");
            System.out.println("6 - Fechar Venda");
            System.out.println("0 - Sair");
            System.out.println("----------------------------------------");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
    
            switch (opcao) {
            case 1:
                System.out.print("Nome do cliente: ");
                String nomeCliente = scanner.nextLine();
                System.out.print("CPF do cliente: ");
                BigInteger cpf = new BigInteger(scanner.nextLine());
                Cliente cliente = new Cliente(nomeCliente, cpf);
                loja.cadastrarCliente(cliente);
                System.out.println("Cliente cadastrado com sucesso!");
                break;
            case 2:
                System.out.print("Código do produto: ");
                int codigoProduto = scanner.nextInt();
                System.out.print("Valor do produto: ");
                double valorProduto = scanner.nextDouble();
                Produto produto = new Produto(codigoProduto, valorProduto);
                loja.cadastrarProduto(produto);
                System.out.println("Produto cadastrado com sucesso!");
                break;
            case 3:
                System.out.print("Nome do cliente para a venda: ");
                String nomeClienteVenda = scanner.nextLine();
                if (loja.iniciarVenda(nomeClienteVenda)) {
                    System.out.println("Venda iniciada com sucesso!");
                } else {
                    System.out.println("Cliente não encontrado!");
                }
                break;
            case 4:
                System.out.print("Código do produto: ");
                int codigo = scanner.nextInt();
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();
                System.out.print("Desconto (%): ");
                double desconto = scanner.nextDouble();
                if (loja.adicionarProduto(codigo, quantidade, desconto)) {
                    System.out.println("Produto adicionado ao carrinho com sucesso!");
                } else {
                    System.out.println("Erro ao adicionar produto! Verifique o código ou inicie uma venda.");
                }
                break;
            case 5:
                CarrinhoDeCompras carrinho = loja.getVendaEmAndamento();
                if (carrinho != null) {
                    System.out.println(carrinho);
                } else {
                    System.out.println("Nenhuma venda em andamento!");
                }
                break;
            case 6:
                double total = loja.fecharVenda();
                if (total > 0) {
                    System.out.printf("Venda finalizada! Total: R$%.2f\n", total);
                } else {
                    System.out.println("Nenhuma venda em andamento para finalizar!");
                }
                break;
            case 0:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
        }
    } while (opcao != 0);

      scanner.close();
    }
}