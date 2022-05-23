package it.polito.tdp.bar.model;

import java.time.Duration;

public class Event implements Comparable<Event> {
	
	
	/**
	 * dato che ci sono due tipi di eventi va fatto questo
	 * @author Francesca
	 *
	 */
	public enum EventType{
		ARRIVO_GRUPPO_CLIENTI,
		TAVOLO_LIBERATO
	}
	
	private EventType type;  //attributo del singolo evento
	private Duration time; //è un numero di minuti che parte da zero e va avanti, andava bene anche int
	private int nPersone;
	private Duration durata; //quanto stanno al tavolo
	private double tolleranza; 
	private Tavolo tavolo;
	
	
	public Event(EventType type, Duration time, int nPersone, Duration durata, double tolleranza, Tavolo tavolo) {
		super();
		this.type = type;
		this.time = time;
		this.nPersone = nPersone;
		this.durata = durata;
		this.tolleranza = tolleranza;
		this.tavolo = tavolo;
	}


	public EventType getType() {
		return type;
	}


	public Duration getTime() {
		return time;
	}


	public int getnPersone() {
		return nPersone;
	}


	public Duration getDurata() {
		return durata;
	}


	public double getTolleranza() {
		return tolleranza;
	}


	public Tavolo getTavolo() {
		return tavolo;
	}
	
	


	public void setType(EventType type) {
		this.type = type;
	}


	public void setTime(Duration time) {
		this.time = time;
	}


	public void setnPersone(int nPersone) {
		this.nPersone = nPersone;
	}


	public void setDurata(Duration durata) {
		this.durata = durata;
	}


	public void setTolleranza(double tolleranza) {
		this.tolleranza = tolleranza;
	}


	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}


	@Override
	public int compareTo(Event o) {
		return this.time.compareTo(o.getTime());
	}
	
	
	
	

}
