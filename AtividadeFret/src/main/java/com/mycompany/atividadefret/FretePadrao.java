/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadefret;

/**
 *
 * @author João Igor
 */
public class FretePadrao extends Frete{
  
    public FretePadrao(double distanciaEmKm, double valorPorKm){
        super(distanciaEmKm, valorPorKm);
    }

    //fazendo a sobrecrita do método calcularFrete 
    @Override
    public double calcularFrete() {
        // O cálculo do FretePadrao é realizado com a seguinte fórmula: distancia * valorPorKm;        
        double total = super.getDistanciaEmKm() * super.getValorPorKm();
       
        return total;
    }
         
}
 