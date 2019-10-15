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
public class Consumo {
    private double km;
    private double litros;
    private float vMed;
    private float pGas;
    
    public Consumo(){
    // si no recibe parametros
    }
    public Consumo(double km,double litros,float vMed,float pGas){
        this.km = km;
        this.litros= litros;
        this.vMed= vMed;
        this.pGas= pGas;    
    }
    public double getTempo(){
        double tiempo = km / vMed * 60;
        return tiempo;
    }
    public double consumoMedio(){
        double consumoM = km/litros*100;
        return consumoM;
    }
    public double consumoEuros(){
        double consumoP = pGas*litros/100;
        return consumoP;
    }
    public void setKms(double kms){
        km = kms;
    }
    public void setLitros(double litro){
        litros = litro;
    }
    public void setMed(float velMed){
        vMed = velMed;
    }
    public void setPGas(float preGas){
        pGas = preGas;
    }
}
