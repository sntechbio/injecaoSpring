package com.algaworks.algafood.domain.service;

import lombok.Getter;
import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public interface EnvioEmailService {

    void enviar(Mensagem mensagem) throws IOException;

    @Getter
    @Builder
    class Mensagem {

        @Singular
        private Set<String> destinatarios;

        @NonNull
        private String assunto;

        private String corpo;

        @Singular("variavel")
        private Map<String, Object> variaveis;

    }
}
