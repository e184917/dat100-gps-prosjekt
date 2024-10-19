package no.hvl.dat100ptc.oppgave1;

import no.hvl.dat100ptc.TODO;

public class GPSPoint {

	// TODO - objektvariable
	private int time = 0;
	private double latitude = 0.0;
	private double longitude = 0.0;
	private double elevation = 0.0;
	
	public GPSPoint(int time, double latitude, double longitude, double elevation) {

		// TODO - konstruktur
		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation = elevation;

		//throw new UnsupportedOperationException(TODO.construtor("GPSPoint"));
		
	}

	// TODO - get/set metoder
	public int getTime() {
		
		return this.time;
		//throw new UnsupportedOperationException(TODO.method());
		
	}

	public void setTime(int time) {
		
		this.time = time;
		//throw new UnsupportedOperationException(TODO.method());
		
	}

	public double getLatitude() {
		
		return this.latitude;
		//throw new UnsupportedOperationException(TODO.method());
		
		
	}

	public void setLatitude(double latitude) {
		
		this.latitude = latitude;
		//throw new UnsupportedOperationException(TODO.method());
		
	}

	public double getLongitude() {
		
		return this.longitude;
		//throw new UnsupportedOperationException(TODO.method());
		
	}

	public void setLongitude(double longitude) {
		
		this.longitude = longitude;
		//throw new UnsupportedOperationException(TODO.method());
		
	}

	public double getElevation() {
		
		return this.elevation;
		//throw new UnsupportedOperationException(TODO.method());
		
	}

	public void setElevation(double elevation) {
		
		this.elevation = elevation;
		//throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public String toString() {
		
		String str;
		str = this.time + " (" + this.latitude + "," + this.longitude + ") " + this.elevation + "\n";
		
		return str;
		
		//throw new UnsupportedOperationException(TODO.method());

		// TODO
		
	}
}
