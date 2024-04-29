package br.com.papait.bruno.Api.de.envio.de.emails.controller;

import br.com.papait.bruno.Api.de.envio.de.emails.dto.EmailDTO;
import br.com.papait.bruno.Api.de.envio.de.emails.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
@RequiredArgsConstructor
public class EmailController {

  private final EmailService emailService;

  @PostMapping("/send-email")
  public ResponseEntity<Void> enviarEmail(@RequestBody EmailDTO emailDTO) {
    this.emailService.sendEmail(emailDTO);
    return ResponseEntity.ok().build();
  }
}
