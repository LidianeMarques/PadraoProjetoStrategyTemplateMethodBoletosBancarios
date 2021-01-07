/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.padraoprojetostrategytemplatemethodboletosbancarios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Lidiane
 */
public class LeituraRetornoBancoBradesco extends ProcessarBoletos {

    @Override
    protected Boleto processarLinhaArquivo(String[] dadosBoleto) {

        Boleto boleto = new Boleto();

        boleto.setId(Integer.parseInt(dadosBoleto[0]));
        boleto.setCodBanco(dadosBoleto[1]);
        boleto.setAgencia(dadosBoleto[2]);
        boleto.setContaCliente(dadosBoleto[3]);
        boleto.setDataVencimento(LocalDate.parse(dadosBoleto[4], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        boleto.setDataPagamento(LocalDateTime.parse(dadosBoleto[5], DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        boleto.setCpfCliente(dadosBoleto[6].substring(0, 3) + "."
                + dadosBoleto[6].substring(3, 6) + "."
                + dadosBoleto[6].substring(6, 9) + "-"
                + dadosBoleto[6].substring(9, 11));
        boleto.setValor(Double.parseDouble(dadosBoleto[7]));
        boleto.setMulta(Double.parseDouble(dadosBoleto[8]));
        boleto.setJuros(Double.parseDouble(dadosBoleto[9]));

        System.out.println(""
                + "BANCO BRADESCO" + "\n"
                + "Id do boleto: " + boleto.getId() + "\n"
                + "Cód banco onde o boleto foi pago: " + boleto.getCodBanco() + "\n"
                + "Agência onde o boleto foi pago: " + boleto.getAgencia() + "\n"
                + "Conta do cliente: " + boleto.getContaCliente() + "\n"
                + "Data vencimento: " + boleto.getDataVencimento() + "\n"
                + "Data/hora pagamento: " + boleto.getDataPagamento() + "\n"
                + "CPF do cliente (com . e -); " + boleto.getCpfCliente() + "\n"
                + "Valor do boleto: " + boleto.getValor() + "\n"
                + "Multa por atraso: " + boleto.getMulta() + "\n"
                + "Juros no formato: " + boleto.getJuros() + "\n");

        return boleto;
    }
}
