package grade11.nov2021;

public class SpoiltVotes extends Votes {
	private int spoilt;
	public static final double FACTOR = 0.5;

	public SpoiltVotes(String wID, String dID, int t, int rA, int rB, int sVote) {
		super(wID, dID, t, rA, rB);
		spoilt = sVote;
	}

	public int calcSpoiltA() {
		int totalA = super.getResultA() + spoilt;

		return (int) Math.round((double) totalA / super.getTotal() * 100);
	}

	public int calcSpoiltB() {
		int totalB = super.getResultB() + spoilt;

		return (int) Math.round((double) totalB / super.getTotal() * 100);
	}

	private boolean helpDiff() {
		int difference = calcSpoiltA() - calcSpoiltB();
		
		return difference > FACTOR;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + spoilt + " " + (helpDiff() ? "irregular" : "no irregularities");
	}

}
