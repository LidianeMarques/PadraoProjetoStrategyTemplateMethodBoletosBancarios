/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.padraoprojetostrategytemplatemethodboletosbancarios;

/**
 *
 * @author Lidiane
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProcessarBoletos processador = new LeituraRetornoBancoBrasil();
        ProcessarBoletos processador2 = new LeituraRetornoBancoBradesco();
        String nomeArquivo = "banco-brasil-1.csv";
        String nomeArquivo2 = "bradesco-1.csv";
        processador.processar(nomeArquivo);
        
    }
    
}
