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
    
    //instanciando o arraylist 
    List<Frete> lista = new ArrayList<>();
    
    //criando um método adicionar frete que recebe como par^ametro que é do tipo Frete
    public void adicionarFrete(Frete frete){
        //depois adiciono o que foi passado na minha lista
        lista.add(frete);

    }
    //criando um me´tdo para calcular o valor total
    public double valorTotal(){
        //iniciando um acumulador 'total' que inicia valendo 0 e vai sendo incrementado a cada iteração do for each 
        double total = 0;
        //pra cada frete da lista, faça 
        for (Frete frete: lista){
            //calcula o frete do objeto e depois soma mais o total 
            total += frete.calcularFrete();
        }
        
        return total;
    }    
}

    

