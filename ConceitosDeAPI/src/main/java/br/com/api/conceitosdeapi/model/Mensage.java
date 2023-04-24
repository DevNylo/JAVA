package br.com.api.conceitosdeapi.model;

import org.springframework.stereotype.Component;

@Component
public class Mensage {

    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
