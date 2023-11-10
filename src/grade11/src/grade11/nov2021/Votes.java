package grade11.nov2021;

public class Votes {
	private int wardID;
	private String districtID;
	private int total;
	private int resultA;
	private int resultB;

	public Votes(String wID, String dID, int t, int rA, int rB) {
		setWardID(wID);
		districtID = dID;
		total = t;
		resultA = rA;
		resultB = rB;
	}

	public void setWardID(String wID) {
		String lastDigits = wID.substring(wID.length() - 2);

		wardID = Integer.parseInt(lastDigits);
	}

	@Override
	public String toString() {
		return wardID + "\t" + districtID + "\t" + total + "\t" + resultA
				+ "\t" + resultB;
	}
	
	

	public int calcA() {
		return (int) Math.round((double)resultA/total*100);
	}
	
	public int calcB() {
		return (int) Math.round((double)resultB/total*100);
	}

	public int getWardID() {
		return wardID;
	}

	public String getDistrictID() {
		return districtID;
	}

	public int getTotal() {
		return total;
	}

	public int getResultA() {
		return resultA;
	}

	public int getResultB() {
		return resultB;
	}

}
