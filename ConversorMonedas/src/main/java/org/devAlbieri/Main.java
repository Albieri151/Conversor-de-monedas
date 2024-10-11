package org.devAlbieri;


import org.devAlbieri.cambiosMonetarios.CambiosMonetarios;
import org.devAlbieri.solicitudesApi.solicitudJson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su moneda: ");
        var monedaPoseida = sc.next();

        System.out.println("Ingrese la moneda de comparar");
        var monedaConsultada = sc.next();

        solicitudJson.Consulta(monedaPoseida,monedaConsultada);

    }
}
