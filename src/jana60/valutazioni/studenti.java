package jana60.valutazioni;

public class studenti {
	
	//attributi
	int id,percentualeAssenze,mediaVoti;
	 

	
	//costruttore
	studenti(int id, int percentualeAssenze, int mediaVoti) {
		this.id = id;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
		}
	
	//metodi
	boolean risulatoFinale () {
		boolean promozione = false;
		
		if (percentualeAssenze<25 && mediaVoti >=2) {
			promozione = true;
		}else if (percentualeAssenze<= 50 && mediaVoti >2) {
			promozione = true;
		}
		return promozione;
	}
}
