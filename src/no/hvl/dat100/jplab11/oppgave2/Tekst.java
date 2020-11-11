package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	protected String tekst;
//	protected int id;
//	protected String bruker;
//	protected String dato;
//	protected int likes;

	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this(id, bruker, dato,  0, tekst);

	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id, bruker, dato, likes);
//		this.id = id;
//		this.bruker = bruker;
//		this.dato = dato;
//		this.likes = likes;
		this.tekst = tekst;
	}
	
	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		//super.toString(), se hvor den må inn heller
		String str ="TEKST" + "\n" + super.toString() + tekst + "\n";
		return str;

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
