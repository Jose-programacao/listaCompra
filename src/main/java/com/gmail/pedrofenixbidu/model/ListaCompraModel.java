package com.gmail.pedrofenixbidu.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Lista_de_Produto")
public class ListaCompraModel implements Serializable {
	private static final long serialVersionUID = 1L;
//
//

/*ESSE É O PLADÃO 

	!eu estou lascada
	?eu tenho que estudar mais


*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idProduto;
	@Column(name = "Nome do Estabelecimento")
	private String nomeEstabelecimento;
	@Column(name = "Local da Compra")
	private String nomeLocalCompra;
	@Column(name = "Descrição do Produto")
	private String descricaoProduto;
	@Column(name = "Quantidade do Produto")
	private int quantidadeProduto;
	@Column(name = "Valor Produto")
	private BigDecimal valorProduto;
	@Column(name = "Valor total ")
	private BigDecimal valorTotalProduto;
	@Column(name = "Valor a Pagar")
	private BigDecimal valorTotalPagar;

	public UUID getIdProduct() {
		return idProduto;
	}

	public void setIdProduct(UUID idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}

	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}

	public String getNomeLocalCompra() {
		return nomeLocalCompra;
	}

	public void setNomeLocalCompra(String nomeLocalCompra) {
		this.nomeLocalCompra = nomeLocalCompra;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public BigDecimal getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}

	public BigDecimal getValorTotalProduto() {
		return valorTotalProduto;
	}

	public void setValorTotalProduto(BigDecimal valorTotalProduto) {
		this.valorTotalProduto = valorTotalProduto;
	}

	public BigDecimal getValorTotalPagar() {
		return valorTotalPagar;
	}

	public void setValorTotalPagar(BigDecimal valorTotalPagar) {
		this.valorTotalPagar = valorTotalPagar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}