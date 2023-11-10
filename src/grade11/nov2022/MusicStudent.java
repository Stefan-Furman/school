package grade11.nov2022;

public class MusicStudent {
	protected String name;
	protected String status;
	protected String instrument;
	
	public static final String STATUS_RED = "High danger";
	public static final String STATUS_YELLOW = "Moderate danger";
	public static final String STATUS_GREEN = "No danger";
	
	
	public MusicStudent(String n, int s, String i) {
		name = n;
		instrument = i;
		
		if (s == 3) status = STATUS_RED;
		else if (s == 2) status = STATUS_YELLOW;
		else if (s == 1) status = STATUS_GREEN;
	}


	public String getStatus() {
		return status;
	}


	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}


	@Override
	public String toString() {
		return "\t" + name + " plays the " + instrument + " - status: " + status;
	}
	
	
}
