package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] tabell;
	private int nesteledige = 0;
	
	public Blogg() {
		tabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		tabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledige;
	}
	
	public Innlegg[] getSamling() {
		return tabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteledige; i++) {
			if (innlegg.erLik(tabell[i])) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		if (finnInnlegg(innlegg) != -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean ledigPlass() {
		if (nesteledige < tabell.length) {
				return true;
			} else {
				return false;
			}
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean idEksisterer = false;
		int innleggId = innlegg.getId();
		
			for (Innlegg i : tabell) {
				if (i != null) {
					if (i.getId() == innleggId) {
						idEksisterer = true;
					}
				}
			}
			if (!idEksisterer) {
				tabell[nesteledige] = innlegg;
				nesteledige++;
				return true;
			} else {
				return false;
			}
	}
	
	public String toString() {
		String str = nesteledige + "\n";
		for (int i = 0; i < nesteledige; i++) {
			if (tabell[i] != null) {
			str += tabell[i].toString();
			}
		}
		return str;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}