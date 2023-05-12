/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadefret;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Igor
 */
public class CadastroFrete {
    
    List<Frete> lista = new ArrayList<>();
    
    
    public void adicionarFrete(Frete frete){
        lista.add(frete);
 
    }
    
    public double valorTotal(){
        double total = 0;
        for (Frete frete: lista){
            
            total += frete.calcularFrete();
        }
        
        return total;
    }
        
    
    
}

    

