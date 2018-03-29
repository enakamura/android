# Sobre

Projeto para teste de notificação usando o Firebase Cloud Message

__HelloWorldFireBase__: Projeto Android simples que utiliza o Firebase Cloud Message para receber notificaçes. Após gerar o token, faz uma chamada ao webservice para informar o token do aparelho.
__webservice__: Projeto java com webservice em Spring Boot que recebe o token gerado pela aplicação Android e exibe no terminal.

# Descrição dos projetos

## HelloWorldFireBase

* A classe __MyFirebaseInstanceIdService__ possui dois métodos para tratar o token.

* O método __onTokenRefresh__ é executado sempre que um token novo é gerado. Ele escreve o token no log e executa o método __sendToken__

* O método __sendToken__ faz o envio do token para um webservice na URL http://0.0.0.0:5050/test

## webservice

* Projeto java feito em spring boot para simular um webservice externo que deve receber o token do aparelho e armazenar em um banco.
* É importante armazenar o token junto com alguma informação do usurio para saber a quem pertence o token.
* Uma alternativa para armazenar a informaço de usuário é fazer a chamada ao webservice externo após o login no aplicativo. Na página inicial após o login pode ser feito uma chamada passando o ID do usuário e o token para o webservice.


