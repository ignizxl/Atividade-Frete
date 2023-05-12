/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividadefret;

/**
 *
 * @author João Igor
 */
public class Principal {

    public static void main(String[] args) {
       
        CadastroFrete cadastrando = new CadastroFrete();

        Frete frete01 = new FreteExpresso(1,2);
        Frete frete02 = new FretePadrao(10, 20);
        Frete frete03 = new FreteSuperExpresso(10,30);
        
        cadastrando.adicionarFrete(frete01);
        cadastrando.adicionarFrete(frete02);
        cadastrando.adicionarFrete(frete03);
        
        System.out.println(frete01.toString());
        
        System.out.println("O valor total dos Fretes: " + cadastrando.valorTotal());

        
    }
}
