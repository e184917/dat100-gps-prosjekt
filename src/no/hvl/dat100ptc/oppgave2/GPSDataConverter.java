package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSDataConverter {

	
	private static int TIME_STARTINDEX = 11; 

	public static int toSeconds(String timestr) {
		
		int secs;
		int hr, min, sec;
		
		// TODO
		//throw new UnsupportedOperationException(TODO.method());
		hr = Integer.parseInt(timestr.substring(TIME_STARTINDEX,13));
		min = Integer.parseInt(timestr.substring(14,16));
		sec = Integer.parseInt(timestr.substring(17,19));
		
		secs = hr*60*60 + min*60 + sec;
		
		return secs;
		
	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

		GPSPoint gpspoint;

		// TODO 
		//throw new UnsupportedOperationException(TODO.method());
		gpspoint = new GPSPoint(0, 0.0, 0.0, 0.0);
		gpspoint.setTime(toSeconds(timeStr));
		gpspoint.setLatitude(Double.parseDouble(latitudeStr));
		gpspoint.setLongitude(Double.parseDouble(longitudeStr));
		gpspoint.setElevation(Double.parseDouble(elevationStr));
		
		return gpspoint;
		
	}
	
}
