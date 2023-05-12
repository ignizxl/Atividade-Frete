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
    
    private double distanciaEmKm;
    private double valorPorKm;

    public Frete(double distanciaEmKm, double valorPorKm) {
        this.distanciaEmKm = distanciaEmKm;
        this.valorPorKm = valorPorKm;
    }
    
    public double getDistanciaEmKm() {
        return distanciaEmKm;
    }

    public void setDistanciaEmKm(double distanciaEmKm) {
        this.distanciaEmKm = distanciaEmKm;
    }

    public double getValorPorKm() {
        return valorPorKm;
    }

    public void setValorPorKm(double valorPorKm) {
        this.valorPorKm = valorPorKm;
    }
    
    
    
}
