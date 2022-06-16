package jana60.valutazioni;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//scanner
		Scanner scan = new Scanner(System.in);
		
		studenti[] valutazioniStudenti = new studenti[2];
		int ragazziPromossi = 0;
		for(int i=0; i < valutazioniStudenti.length; i++) 
		{
			System.out.println("inserisci le assenze dello studente: ");
			int percentualeAssenze = scan.nextInt();
			System.out.println("inserisci la media dei voti dello studente: ");
			int mediaVoti = scan.nextInt();
			valutazioniStudenti[i]= new studenti(i+1,percentualeAssenze,mediaVoti);
		
			
			
			if (valutazioniStudenti[i].risulatoFinale()) 
			{
				System.out.println("lo studente: " +valutazioniStudenti[i].id + " è stato promosso");
				 ragazziPromossi++;
			}else 
			{
				System.out.println("lo studente: " +valutazioniStudenti[i].id + " è stato bocciatto");
			}
			
			
		}
		System.out.println("i ragazzi promossi sono " + ragazziPromossi);
	}

}
