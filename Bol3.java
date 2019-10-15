/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol3;

/**
 *
 * @author clagosuarez
 */
public class Bol3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//  A) Crea un obxecto, de tipo consume, utilizando o constructor sen parámetros
        Consumo primerObxecto = new Consumo();
//  B) Dalle a litros o valor 50 e a prezo da gasolina 1.57
        primerObxecto.setLitros(50);
        primerObxecto.setMed(1.57f);
//  C) Crea un obxecto, tipo consumo, utilizando o contructor con todos os parámetros    
        Consumo segundoObxecto = new Consumo(20, 30, 75, 1.24f);
//  D) Visualiza, a  través do 2º obxecto, o consumo medio
        System.out.println("El consumo medio es de " + Math.round(segundoObxecto.consumoMedio()) + "l/100km");
//  E) Varia o valor dos litros consumidos do 2º obxecto
        segundoObxecto.setLitros(10);
//  F) Visualiza a velocidade media do 2º obxecto
        System.out.println("La velocidad media " + Math.round(segundoObxecto.getTempo()) + "km/min");
    }
    
}
