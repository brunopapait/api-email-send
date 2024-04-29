<h1 align="center">
  Api de envio de emails
</h1>

API de envio de email usando o Java Mail Sender com Mailtrap.

## Projeto criado a partir desse video 
#### https://www.youtube.com/watch?v=Tc6sBZpJazo&list=WL&index=5&t=1522s

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Web](https://docs.spring.io/spring-boot/docs/current/reference/html/web.html)
- [Lombok](https://projectlombok.org/)
- [JavaMailSender]([https://docs.aws.amazon.com/ses/latest/dg/Welcome.html](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/mail/javamail/JavaMailSender.html))
- [Mailtrap](https://mailtrap.io/)

## Como Executar
- Clonar repositório git.
- Instalar as dependências do projeto usando o maven.

- Crie uma conta no site do mailtrap
- Adicione as chaves de configuração do mailtrap no arquivo application.properties.
```
spring.mail.username=345345dfsdf (example key)
spring.mail.password=asdWWD324555 (example key)
```

- Executar a aplicação.

- Enviar uma email de teste usando o endpoint com o corpo da requisição em formato JSON:
- Podendo usar algum software para testar as requisições(Insomnia/Postman)
```
POST - http://localhost:8080/api/email/sendEmail

{
	"emailTo": "teste@getnada.com",
	"nome": "Maria Souza Pereira"
}
```

- Visualizar sua caixa de mensagem no MailTrap
