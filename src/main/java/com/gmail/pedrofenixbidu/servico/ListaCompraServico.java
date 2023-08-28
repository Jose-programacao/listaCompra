package com.gmail.pedrofenixbidu.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gmail.pedrofenixbidu.model.ListaCompraMensagem;
import com.gmail.pedrofenixbidu.model.ListaCompraModel;
import com.gmail.pedrofenixbidu.repositories.ListaCompraRepositories;

@Service
public class ListaCompraServico {
    
    @Autowired
    private ListaCompraMensagem listaCompraMensagem;

    @Autowired
    private ListaCompraRepositories acao;


    public ResponseEntity<?> cadastrar(ListaCompraModel obj){
        if(obj.getNomeEstabelecimento().equals("")){
            listaCompraMensagem.setMensagem("O nome tem que ser preenchido");
            return new ResponseEntity<>(listaCompraMensagem, HttpStatus.BAD_REQUEST);

        }else if(obj.getQuantidadeProduto()<=0){
            listaCompraMensagem.setMensagem("Informe a quantidade de produto");
            return new ResponseEntity<>(listaCompraMensagem, HttpStatus.BAD_REQUEST);

        }else{
            return new ResponseEntity<>(acao.save(obj), HttpStatus.CREATED);
        }


    }
    
}
