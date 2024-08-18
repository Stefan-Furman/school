package kdl2023;

public class FreeStyle extends ShortProgram {
	private int position;

	public static final int QUALIFY = 100;

	public static double highest = 0;

	public FreeStyle(int positionSP, int positionFS, String fullName, String nation, double points) {
		super(positionSP, fullName, nation, points);

		position = positionFS;
		
		
		if (points > highest) highest = points;
	}

	public double getChangedPoints() {
		double changed = super.getPoints() - QUALIFY;

		return Math.round(changed * 100) / 100.0;
	}

	@Override
	public String toString() {
		return position + ") " + super.getSurname() + ", " + super.getName() + " (" + super.getNation() + "): "
				+ getChangedPoints() + " points for freestyle.";
	}

}
