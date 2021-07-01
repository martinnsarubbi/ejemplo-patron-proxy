package com.adoo.com;

import java.util.ArrayList;
import java.util.List;

public class ProxyBanco implements Banco {
    private BancoReal banco = new BancoReal();
    private static List<String> clientesProhibidos;


    static {
         clientesProhibidos =  new ArrayList<>();
         clientesProhibidos.add("xXcs");
         clientesProhibidos.add("me@me");
         clientesProhibidos.add("@xmil.com");
    }

    @Override
    public void sacarPlata(String nombreCliente) throws Exception {
        if (clientesProhibidos.contains(nombreCliente.toLowerCase())) {
            throw new Exception(nombreCliente + " Acceso denegado!");
        }

        banco.sacarPlata(nombreCliente);
    }
}
