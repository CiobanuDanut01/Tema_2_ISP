// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Proiect_v2;

import java.util.ArrayList;
import java.util.List;

/************************************************************/
/**
 * 
 */
public class Departament {
	/**
	 *
	 */
	private String nume;
	/**
	 * 
	 */
	private String buget;
	/**
	 * 
	 */
	private Locatii locatieDepartament;
	private List<Persoana> angajati;//nu era
	/**
	 * 
	 */
	private int nrAngajati;
	private String numeProiect;
	/**
	 * 
	 */
	
	public Departament() {
		super();
		this.angajati = new ArrayList<>();
		nrAngajati = 0;
	}

	
	
	public Departament(String nume, String buget, Locatii locatieDepartament,String numeProiect) {
		this();
		this.nume = nume;
		this.buget = buget;
		this.locatieDepartament = locatieDepartament;
		this.numeProiect = numeProiect;
	}
	
	
	public void afisare() {
		System.out.println("Nume: "+nume);
		System.out.println("Proiect: "+ numeProiect);
		System.out.println("Buget: "+buget);
		System.out.println("Locatie: "+locatieDepartament);
		System.out.println("Numarul de angajati: " + nrAngajati);
		for (Persoana angajat : angajati) {
			angajat.afisare();
		}
		
	}

	/**
	 * 
	 */
	public void angajare(Persoana agent) {
		int ok = 0;
		if(angajati!=null) {
			for (Persoana persoana : angajati) {
				if(persoana.equals(agent)) {
					System.out.println("Acest angajat exista deja.");
					ok = 1;
				}
			}
			if(ok == 0) {
				angajati.add(agent);
				nrAngajati +=1;
			}
		}
	}

	/**
	 * 
	 * @param agent 
	 */
	public void concediere(Persoana agent) {
		if(angajati != null) {
			angajati.remove(angajati.stream().filter(e -> e.equals(agent)).findFirst().get());
			nrAngajati -= 1;
		}
	}

	
	
	public String getNumeProiect() {
		return numeProiect;
	}



	public void setNumeProiect(String numeProiect) {
		this.numeProiect = numeProiect;
	}



	/**
	 * 
	 * @param agent 
	 */
	public void atribuireProiect(Persoana agent) {
		System.out.println("Agentul " + agent.getNume() + " "+ agent.getPrenume()+" lucreaza la "+ numeProiect);
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getBuget() {
		return buget;
	}

	public void setBuget(String buget) {
		this.buget = buget;
	}

	public Locatii getLocatieDepartament() {
		return locatieDepartament;
	}

	public void setLocatieDepartament(Locatii locatieDepartament) {
		this.locatieDepartament = locatieDepartament;
	}

	public int getNrAngajati() {
		return nrAngajati;
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}
	
}
