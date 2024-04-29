package br.com.papait.bruno.Api.de.envio.de.emails.dto;

import lombok.Builder;

@Builder
public record EmailDTO(
    String emailTo,
    String nome
) {
}
