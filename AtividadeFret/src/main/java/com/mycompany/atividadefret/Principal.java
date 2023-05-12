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
       
        // crio um objeto da classe CadastroFrete;
        CadastroFrete cadastrando = new CadastroFrete();

        Frete frete01 = new FreteExpresso(1,2);
        Frete frete02 = new FretePadrao(10, 20);
        Frete frete03 = new FreteSuperExpresso(10,30);
        //Adicionando vários objetos de fretes diferentes
        cadastrando.adicionarFrete(frete01); //expresso 
        cadastrando.adicionarFrete(frete02); //padrao
        cadastrando.adicionarFrete(frete03); //super expresso
       
        System.out.println("O valor total dos Fretes: " + cadastrando.valorTotal());
        
    }
}
