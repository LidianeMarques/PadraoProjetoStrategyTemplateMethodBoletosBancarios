/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.padraoprojetostrategytemplatemethodboletosbancarios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Lidiane
 */
public class LeituraRetornoBancoBrasil extends ProcessarBoletos {

    @Override
    protected Boleto processarLinhaArquivo(String[] dadosBoleto) {

        Boleto boleto = new Boleto();
        
        boleto.setId(Integer.parseInt(dadosBoleto[0]));
        boleto.setCodBanco(dadosBoleto[1]);
        boleto.setDataVencimento(LocalDate.parse(dadosBoleto[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        boleto.setDataPagamento(LocalDate.parse(dadosBoleto[3], DateTimeFormatter.ofPattern("dd/MM/yyyy")).atTime(0, 0, 0));
        boleto.setCpfCliente(dadosBoleto[4]);
        boleto.setValor(Double.parseDouble(dadosBoleto[5]));
        boleto.setMulta(Double.parseDouble(dadosBoleto[6]));
        boleto.setJuros(Double.parseDouble(dadosBoleto[7]));
        
        System.out.println("BANCO DO BRASIL" + "\n"
                + "Id do boleto: " + boleto.getId() + "\n"
                + "Cód banco onde o boleto foi pago: " + boleto.getCodBanco() + "\n"
                + "Data vencimento: " + boleto.getDataVencimento() + "\n"
                + "Data/hora pagamento: " + boleto.getDataPagamento() + "\n"
                + "CPF do cliente (sem . e -); " + boleto.getCpfCliente() + "\n"
                + "Valor do boleto: " + boleto.getValor() + "\n"
                + "Multa por atraso: " + boleto.getMulta() + "\n"
                + "Juros no formato: " + boleto.getJuros() + "\n");

        return boleto;
    }

}
