package com.adoo.com;

public class BancoReal implements Banco {
    @Override
    public void sacarPlata(String nombreCliente) throws Exception {
        System.out.println(nombreCliente + " está sacando plata del cajero..");
    }
}
