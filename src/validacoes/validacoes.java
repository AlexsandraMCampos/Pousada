/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validacoes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class validacoes {
// validação da data para os dias atuais

    public static boolean validarData(String dataValidacao) {
        if (dataValidacao == null || dataValidacao.isEmpty()) {
            return false;
        }
        if (!dataValidacao.matches("\\d{2}/\\d{2}/d{4}")) {
            return false;
        }
        try {

            DateTimeFormatter estilo = DateTimeFormatter.ofPattern("dd/mm/yyyy");
            estilo.withResolverStyle(ResolverStyle.STRICT);
            DateTimeFormatter estiloSQL = DateTimeFormatter.ofPattern("yyyy-mm-dd");
            LocalDate diaAtual = LocalDate.now();
            LocalDate data = LocalDate.parse(dataValidacao, estilo);
            String dataSQL = data.format(estilo);
            LocalDate diaEntrada = LocalDate.parse(dataSQL, estiloSQL);

            if (!diaEntrada.isBefore(diaAtual)) {
                return false;
            }
            return true;

        } catch (DateTimeParseException e) {
            return false;
        }
    }
// converte a data para o formato SQL

    public static String converterDataSQL(String dataFormatada) {

        DateTimeFormatter estilo = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        DateTimeFormatter estiloSQL = DateTimeFormatter.ofPattern("yyyy-mm-dd");

        try {
            LocalDate data = LocalDate.parse(dataFormatada, estilo);
            return data.format(estiloSQL);

        } catch (DateTimeParseException e) {
            return null;

        }
    }

    // converter a data para o formato Brasil
    public static String converterDataBrasil(String dataSQL) {
        DateTimeFormatter estilo = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        DateTimeFormatter estiloSQL = DateTimeFormatter.ofPattern("yyyy-mm-dd");

        try {
            LocalDate dataBrasil = LocalDate.parse(dataSQL, estiloSQL);
            return dataBrasil.format(estilo);

        } catch (DateTimeParseException e) {
            return null;
        }
    }
    
    
}
