package com.gmail.pedrofenixbidu.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ListaCompraRecordDto(@NotBlank String nomeEstabelecimento, @NotBlank String nomeLocalCompra,
		@NotBlank String descricaoProduto, @NotNull int quantidadeProduto, @NotNull BigDecimal valorProduto,
		BigDecimal valorTotalProduto, BigDecimal valorTotalPagar) {

}
