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
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Lista_de_Produto")
public class ListaCompraModel implements Serializable {
	private static final long serialVersionUID = 1L;

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
}