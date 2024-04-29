package br.com.papait.bruno.Api.de.envio.de.emails.service;

import br.com.papait.bruno.Api.de.envio.de.emails.dto.EmailDTO;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
@RequiredArgsConstructor
public class EmailService {

  private final JavaMailSender javaMailSender;

  public void sendEmail(final EmailDTO emailDTO) {
    try {
      var mimeMessage = this.javaMailSender.createMimeMessage();
      var helper = new MimeMessageHelper(mimeMessage, true);
      helper.setFrom("noreply@getnada.com");
      helper.setSubject("Developers");
      helper.setTo(emailDTO.emailTo());

      var template = this.loadTemplate();
      template = template.replace("#{nome}", emailDTO.nome());
      helper.setText(template, true);
      javaMailSender.send(mimeMessage);
    } catch (MessagingException | IOException e) {
      e.printStackTrace();
    }

  }

  public String loadTemplate() throws IOException {
    var resourceTemplate = new ClassPathResource("template-email.html");

    return new String(resourceTemplate.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
  }
}
