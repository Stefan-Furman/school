package grade11.nov2022;

import java.util.Random;

public class ExamStudent extends MusicStudent {
	private String examBody;
	private int examNum;

	public ExamStudent(String name, int s, String i, String exBody) {
		super(name, s, i);
		examBody = exBody;
		setExamNum((int) exBody.charAt(0));

	}

	public void setExamNum(int a) {
		Random random = new Random();
		int randNum = random.nextInt(26) + 35; // or (int) (Math.random() * 26 + 35)

		examNum = a + randNum;
	}

	private double calcFee() {
		double totalFee = 0;

		if (examBody.equals("Trinity")) {
			totalFee = 1150 + 0.15 * 1150;
		} else if (examBody.equals("ABRSM")) {
			totalFee = 1350 + 0.15 * 1350;
		} else if (examBody.equals("IEB")) {
			totalFee = 1500 + 0.15 * 1500;
		} else if (examBody.equals("UNISA")) {
			totalFee = 860 + 0.15 * 860;
		}

		return totalFee;
	}

	private double conversion() {
		return calcFee() * 0.049;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tExamining body: " + examBody + "\tExam number: " + examNum
				+ "\n\tFee payable in Rands: R" + calcFee()
				+ (examBody.equals("Trinity") || examBody.equals("ABRSM")
						? "\n\tFee payable in pounds: " + conversion() + " pounds sterling"
						: "");
	}

}
