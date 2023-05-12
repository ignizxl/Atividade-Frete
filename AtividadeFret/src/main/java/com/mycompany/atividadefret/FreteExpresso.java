/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadefret;


public class FreteExpresso extends Frete {
    
    
    public FreteExpresso(double distanciaEmKm, double valorPorKm){
        super(distanciaEmKm, valorPorKm);
        
    }

    @Override
    public double calcularFrete() {
        //O cálculo do FreteExpresso é realizado com a seguinte fórmula: (distancia * valorPorKm) + (nívelUrgencia * 100)
        //deixando o nivel de urgencia já predefinido 
        double nivelDeUrgencia = 9.0;
        double total = (super.getDistanciaEmKm() * super.getDistanciaEmKm()) + (nivelDeUrgencia * 100);
        return total;
    }
    
}
