/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.padraoprojetostrategytemplatemethodboletosbancarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lidiane
 */
public abstract class ProcessarBoletos {

    public final List<Boleto> processar(String nomeArquivo) {

        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(nomeArquivo));
            String linha = "";
            String csvDivisor = ";";
            List<Boleto> listaBoletos = new ArrayList<Boleto>();

            while ((linha = reader.readLine()) != null) {
                String[] dadosBoleto = linha.split(csvDivisor);
                Boleto boleto = processarLinhaArquivo(dadosBoleto);
                listaBoletos.add(boleto);
                System.out.println(boleto);
            }
            return listaBoletos;

        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    protected abstract Boleto processarLinhaArquivo(String[] dadosBoleto);

}
