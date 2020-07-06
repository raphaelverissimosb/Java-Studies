package Vendas;

public class ExecutarTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto produto1 = new Produto();
		produto1.setId(1234646464);
		produto1.setNome("Abobrinha");
		produto1.setValor(145.35);
		
		
		Venda venda = new Venda();
		
		venda.getListaProduto().add(produto1);
		
		
		venda.setDescricaoVenda("Prazo");
		venda.setEnderecoEntrega("Av 123 numero 456");
		venda.setId(10L);
		venda.setNomeCliente("Raphael Verissimo");
		venda.setValorTotal(100.52);
		
		System.out.println("Descricao da Venda:" + venda.getDescricaoVenda() + "e o total venda "+ venda.totalVenda());
		
		
		
	}

}
