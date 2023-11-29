package org.generation.italy;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;




public class distributoreBevande {
	Scanner  sc=new  Scanner(System.in);
	HashMap<String, Float> bevande = new HashMap<>();
    float credito;
    
    public void DistributoreBevande(HashMap<String, Float> bevande) {
    	this.bevande=bevande;
    	this.credito=0;
    }
    
    public void inserisciMoneta(float moneta) {
    credito=credito+moneta;
    System.out.println("il  credito attuale e:"+credito);
    }
    
    public void erogaBevanda(String nomeBevanda)   {
    	float  prezzoBevanda;
    	if(bevande.containsKey(nomeBevanda)) 
    	{
    		prezzoBevanda=(bevande.get(nomeBevanda));
    		if(prezzoBevanda<=credito) 
    		{
    			credito=credito-prezzoBevanda;
    			System.out.println("bevanda  erogata, il credito   disponibile e:"+credito);
    		}
    		else 
    		{
    			System.out.println("credito non sufficente");
    		}
    	}
    	else
    	{
    			System.out.println("bevanda   non disponibile");
    	}
    }
    	
    }

