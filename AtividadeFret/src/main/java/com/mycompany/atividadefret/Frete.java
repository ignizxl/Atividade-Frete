/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadefret;

/**
 *
 * @author João Igor
 */
public abstract class Frete implements Fretavel {
    //atributos
    private double distanciaEmKm;
    private double valorPorKm;
    
    //método construdo
    public Frete(double distanciaEmKm, double valorPorKm) {
        this.distanciaEmKm = distanciaEmKm;
        this.valorPorKm = valorPorKm;
    }
    
    //métodos de acesso
    public double getDistanciaEmKm() {
        return distanciaEmKm;
    }

    public double getValorPorKm() {
        return valorPorKm;
    }
   
}
