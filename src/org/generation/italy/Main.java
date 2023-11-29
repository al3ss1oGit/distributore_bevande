package org.generation.italy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, Float> elencoBevande = new HashMap<>();
		elencoBevande.put("aranciata",3f );
		elencoBevande.put("acqua",1f );
		elencoBevande.put("the",1.5f );
		
		distributoreBevande distributore= new distributoreBevande();
		Scanner  sc=new  Scanner(System.in);
		System.out.println("selezionare bevanda");
		
	}

}
