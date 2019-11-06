package controller.menu;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import model.Amostra;

public class gerenciaArquivo {

	public static void main(String[] args) throws IOException {
		Amostra novaAmostra = null; //novaAmostra
		Reader reader = Files.newBufferedReader(Paths.get("amostra.csv"));
		CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
		List<String[]> dados = csvReader.readAll(); //recebo todos os dados
		ArrayList<Double> dadosAmostra; //dadosDaNovaAmostra
		for (int i = 0; i < dados.size(); i++) {
			for (int j = 0; j < args.length; j++) {
				
			}
		}
		for (String[] dado : )
				dadosAmostra.add(dado);
			novaAmostra = new Amostra(dados[0], dados[1], dadosAmostra);
	}
	System.out.println(novaAmostra.toString());
	
	 Reader reader = Files.newBufferedReader(Paths.get("nome-do-arquivo.csv"));
	    CSVReader csvReader = new CSVReaderBuilder(reader)
	                            .withSkipLines(1)//para o caso do CSV ter cabeçalho.
	                            .build();

	    List<String[]> linhas = csvReader.readAll();
	    for (String[] linha : linhas)
	        for (String[] coluna : linha)
	            System.out.print(coluna + " # ");
	        System.out.println();
}