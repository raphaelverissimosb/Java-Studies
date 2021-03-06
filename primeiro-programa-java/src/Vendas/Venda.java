package Vendas;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private Long id;
	private String nomeCliente;
	private String descricaoVenda;
	private String enderecoEntrega;
	private Double valorTotal;
	
	private List<Produto> listaProduto = new ArrayList<Produto>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoVenda() {
		return descricaoVenda;
	}

	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double d) {
		this.valorTotal = d;
	}

	public List<Produto> getListaProduto() {
		return listaProduto;
	}

	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
	//Methods
	
	public void addProduto(Produto produto) {
		
		this.listaProduto.add(produto);
	}
	
	public double totalVenda() {
		double total = 0.0; 
		for(Produto produto : listaProduto) {
			total += produto.getValor().doubleValue();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", nomeCliente=" + nomeCliente + ", descricaoVenda=" + descricaoVenda
				+ ", enderecoEntrega=" + enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProduto="
				+ listaProduto + "]";
	}
	
	
	
	
	
}
