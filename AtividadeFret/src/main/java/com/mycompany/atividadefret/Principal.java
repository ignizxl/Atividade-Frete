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
       
        CadastroFrete cadastroFrete = new CadastroFrete();

        Frete f1 = new FreteExpresso(1,2);
        Frete f2 = new FretePadrao(10, 20);
        Frete f3 = new FreteSuperExpresso(10,30);

        
    }
}
