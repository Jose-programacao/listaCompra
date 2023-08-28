package com.gmail.pedrofenixbidu.model;

import org.springframework.stereotype.Component;

@Component
public class ListaCompraMensagem {

    private String mensagem;
    

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
