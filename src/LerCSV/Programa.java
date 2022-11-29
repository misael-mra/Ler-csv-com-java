package LerCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		String localArquivo = "C:\\lendoArquivo\\csv.txt";
		
		List<Produto> lista = new ArrayList<Produto>();

		try (BufferedReader br = new BufferedReader(new FileReader(localArquivo))) {
			String linha = br.readLine(); // Leitura do cabeçalho
			linha = br.readLine(); // Leitura segunda linha antes de começar o while
			
			while (linha != null) {
				//System.out.println("linha");
				
				String [] v = linha.split(";"); // Analisa a String e recorta com o caractere informado
				String nome = v[0];
				Double preco = Double.parseDouble(v[1]);
				Integer quantidade = Integer.parseInt(v[2]); 
				
				linha = br.readLine();
				
			}
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
