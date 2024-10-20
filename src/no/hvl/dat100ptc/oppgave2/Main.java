package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class Main {

	
	public static void main(String[] args) {

		// TODO
		GPSPoint gps0 = new GPSPoint(1, 2.0, 3.0, 4.0);
		GPSPoint gps1 = new GPSPoint(2, 3.0, 4.0, 5.0);
		
		GPSData gps = new GPSData(2);
		gps.insertGPS(gps0);
		gps.insertGPS(gps1);
		
		gps.print();
	}
}
