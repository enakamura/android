Projeto para teste de notificação usando o Firebase Cloud Message

A classe __MyFirebaseInstanceIdService__ possui dois métodos para tratar o token.

O método __onTokenRefresh__ é executado sempre que um token novo é gerado. Ele escreve o token no log e executa o método __sendToken__

O método __sendToken__ faz o envio do token para um webservice na URL http://0.0.0.0:5050/test


