/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadefret;

/**
 *
 * @author João Igor
 */
public class FreteSuperExpresso extends Frete {

    public FreteSuperExpresso(double distanciaEmKm, double valorPorKm){
        super(distanciaEmKm, valorPorKm);
        
    }
  
    @Override
    public double calcularFrete(){
        //O cálculo do FreteSuperExpresso é realizado com a seguinte fórmula: (distancia * valorPorKm) + (nívelUrgencia * 100) + valorDoSeguro;
        //deixando os valores do seguro e nivel de urgencia já predifinidos 
        double seguro = 0.15;
        double nivelDeUrgencia = 10.0;
        double total = ((super.getDistanciaEmKm() * super.getValorPorKm()) + (seguro * nivelDeUrgencia)); 
        
        return total;
    }
}
