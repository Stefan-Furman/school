package com.itbulls.furman.oop.examples.learner;

public class Learner {
	private String fullName;
	private int term1;
	private int term2;
	private int term3;

	public Learner() {
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setTerm1(int term1) {
		this.term1 = term1;
	}

	public void setTerm2(int term2) {
		this.term2 = term2;
	}

	public void setTerm3(int term3) {
		this.term3 = term3;
	}

	@Override
	public String toString() {
		return "Learner [fullName=" + fullName + ", term1=" + term1 + ", term2=" + term2 + ", term3=" + term3
				+ ", average=" + getAverage() + ", highest mark=" + getHighestMark() + ", term with highest mark="
				+ getHighestTerm() + "]";
	}

	public double getAverage() {
		return (term1 + term2 + term3) / 3;
	}

	public int getHighestMark() {
		int highest = term1;

		if (term2 > highest) {
			highest = term2;
		}

		if (term3 > highest) {
			highest = term3;
		}

		return highest;
	}

	public String getHighestTerm() {
		if (term1 == getHighestMark()) {
			return "term 1";
		}

		if (term2 == getHighestMark()) {
			return "term 2";
		}

		if (term3 == getHighestMark()) {
			return "term 3";
		}

		return "";
	}
}
