/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.padraoprojetostrategytemplatemethodboletosbancarios;

import java.util.List;

/**
 *
 * @author Lidiane
 */
public interface LeituraRetorno {
    
    public List<Boleto> lerArquivo(String nomeArquivo);
}
