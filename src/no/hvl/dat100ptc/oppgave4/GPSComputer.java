package no.hvl.dat100ptc.oppgave4;

import no.hvl.dat100ptc.oppgave1.GPSPoint;
import no.hvl.dat100ptc.oppgave2.GPSData;
import no.hvl.dat100ptc.oppgave2.GPSDataConverter;
import no.hvl.dat100ptc.oppgave2.GPSDataFileReader;
import no.hvl.dat100ptc.oppgave3.GPSUtils;

import no.hvl.dat100ptc.TODO;

public class GPSComputer {
	
	private GPSPoint[] gpspoints;
	
	public GPSComputer(String filename) {

		GPSData gpsdata = GPSDataFileReader.readGPSFile(filename);
		gpspoints = gpsdata.getGPSPoints();

	}

	public GPSComputer(GPSPoint[] gpspoints) {
		this.gpspoints = gpspoints;
	}
	
	public GPSPoint[] getGPSPoints() {
		return this.gpspoints;
	}
	
	public double totalDistance() {

		double distance = 0;

		//throw new UnsupportedOperationException(TODO.method());

		// TODO
		for (int i = 0; i < gpspoints.length-1; i++) {
			distance = distance + GPSUtils.distance(gpspoints[i], gpspoints[i+1]);

		}
		return distance;

	}

	public double totalElevation() {

		double elevation = 0;

		//throw new UnsupportedOperationException(TODO.method());
		
		// TODO
		for (int i = 0; i < gpspoints.length-1; i++) {
			if (gpspoints[i].getElevation() < gpspoints[i+1].getElevation()) {
				elevation += gpspoints[i+1].getElevation() - gpspoints[i].getElevation();
			}

		}
		return elevation;
		
	}

	public int totalTime() {

		//throw new UnsupportedOperationException(TODO.method());
		
		// TODO
		int time = 0;
		
		for (int i = 0; i < gpspoints.length-1; i++) {
			time += gpspoints[i].getTime();
		}
		System.out.println(gpspoints[0].toString());

		return time;
		
	}
		

	public double[] speeds() {

		double[] speeds = new double[gpspoints.length-1];
		for(int i = 0; i > gpspoints.length; i++) {
			double distance = GPSUtils.distance(gpspoints[i], gpspoints[i + 1]);
			double time = gpspoints[i + 1].getTime() - gpspoints[i].getTime();
	        speeds[i] = distance / time;
		}
		return speeds;
		
		// TODO throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public double maxSpeed() {
		
		double[] speeds = speeds();
	    return GPSUtils.findMax(speeds);
		
		// TODO throw new UnsupportedOperationException(TODO.method());
	
	}

	public double averageSpeed() {

		double average = 0;
		
		// TODO
		throw new UnsupportedOperationException(TODO.method());
		
	}


	// conversion factor m/s to miles per hour (mps)
	public static final double MS = 2.23;

	public double kcal(double weight, int secs, double speed) {
		
		double totalDistance = totalDistance(); // i meter
	    double totalTime = totalTime(); // i sekunder
	    double averageSpeed = (totalDistance / 1000) / (totalTime / 3600); // konverterer til km/t
	    return averageSpeed;

		// TODO  throw new UnsupportedOperationException(TODO.method());
		
	}

	public double totalKcal(double weight) {

		// TODO 
		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	private static double WEIGHT = 80.0;
	
	public void displayStatistics() {

		// TODO 
		throw new UnsupportedOperationException(TODO.method());
		
	}

}
