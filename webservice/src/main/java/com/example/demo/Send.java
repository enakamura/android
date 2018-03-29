package com.example.demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Classe para testar o webservice "test" da classe DemoController
 * Faz o envio de uma mensagem HTTP GET para o endpoint do webservice na URL http://0.0.0.0:5050/test
 * passando como parâmetro o token  
 * @author nakamura
 *
 */
public class Send {

	public static void main(String[] args) {
		Send send = new Send();
		try {
			send.sendMessage("token_abc123");
		} catch (IOException e) {
			System.out.println("Errou!");
			e.printStackTrace();
		}
	}
	
	public void sendMessage(String token) throws IOException{
		
		String rawUrl = "http://0.0.0.0:5050/test?token=%s";
		String newUrl = new String().format(rawUrl, token);
		
		System.out.println("rawUrl:"+rawUrl);
		System.out.println("newUrl:"+newUrl);
		
		URL url = new URL(newUrl);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("GET");
        
        int responseCode = httpURLConnection.getResponseCode();
        System.out.println("responseCode:"+responseCode);
	}
}
