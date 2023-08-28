package com.gmail.pedrofenixbidu.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.pedrofenixbidu.dtos.ListaCompraRecordDto;
import com.gmail.pedrofenixbidu.model.ListaCompraMensagem;
import com.gmail.pedrofenixbidu.model.ListaCompraModel;
import com.gmail.pedrofenixbidu.repositories.ListaCompraRepositories;
import com.gmail.pedrofenixbidu.servico.ListaCompraServico;

import jakarta.validation.Valid;

@RestController
public class ListaCompraController {



	@Autowired
	ListaCompraMensagem listaCompraMensagem;
	
	

	@Autowired
	ListaCompraServico listaCompraServico;

	@Autowired
	ListaCompraRepositories listaCompraRepositories;

	// -----------------------------------------------------------------------------------------------------------------------
	@PostMapping("/compra")
	public ResponseEntity<ListaCompraModel> salvarCompra(@RequestBody @Valid ListaCompraRecordDto listaCompraRecordDto) {
		var listaCompraModel = new ListaCompraModel();
		BeanUtils.copyProperties(listaCompraRecordDto, listaCompraModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(listaCompraRepositories.save(listaCompraModel));

	}

	// ------------------------------------------------------------------------------------------------------------------------
	@GetMapping("/compra")
	public ResponseEntity<List<ListaCompraModel>> getAllcompra() {
		return ResponseEntity.status(HttpStatus.OK).body(listaCompraRepositories.findAll());

	}
		/*
		 * gfdgkg
		 !rgherii
		 &rgerhgerh
		 ^gerougheuo
		 ~herbgireb
		 ?ththhtrçio
		 
		 */
	// ---------------------------------------------------------------------------------------------------------------------------
	@GetMapping("/compra/{id}")
	public ResponseEntity<Object> getOnecompra(@PathVariable(value = "id") UUID id) {
		Optional<ListaCompraModel> productO = listaCompraRepositories.findById(id);
		if (productO.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(productO.get());
	}

	// -------------------------------------------------------------------------------------------------------------------------

	@PutMapping("/compra/{id}")
	public ResponseEntity<Object> updateCompra(@PathVariable(value = "id") UUID id,
			@RequestBody @Valid ListaCompraRecordDto listaCompraRecordDto) {

		Optional<ListaCompraModel> productO = listaCompraRepositories.findById(id);
		if (productO.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado. ");

		}
		var listaCompraModel = productO.get();
		BeanUtils.copyProperties(listaCompraRecordDto, listaCompraModel);

		return ResponseEntity.status(HttpStatus.OK).body(listaCompraRepositories.save(listaCompraModel));
	}

	// ----------------------------------------------------------------------------------------------------------------------
	@DeleteMapping("/compra/{id}")
	public ResponseEntity<Object> deleteCompra(@PathVariable(value = "id") UUID id) {
		Optional<ListaCompraModel> productO = listaCompraRepositories.findById(id);
		if (productO.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado. ");
		}
		listaCompraRepositories.delete(productO.get());
		return ResponseEntity.status(HttpStatus.OK).body("Produto deletado. ");
	}
}

