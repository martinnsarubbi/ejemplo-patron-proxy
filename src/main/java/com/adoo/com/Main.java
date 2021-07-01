package com.adoo.com;

public class Main {

    public static void main(String[] args) {
	 Banco banco = new ProxyBanco();

        try {
            banco.sacarPlata("Paulo");
            banco.sacarPlata("me@me");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
