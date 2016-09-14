package co.grandcircus.tMartin.java.lab8;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Batter {
	private String name;
	ArrayList<Integer> atBatResults = new ArrayList<>(50);

	public Batter(String name, ArrayList<Integer> atBatResults) {
		this.name = name;
		this.atBatResults = atBatResults;
	}

	public String getBattingAvg() {
		int atLeastOne = 0;
		for (int a : atBatResults) {
			if (a > 0) {
				atLeastOne++;
			}
		}
		double value = (atLeastOne / (double) atBatResults.size());
		return formatNumber(value);
	}
	
	public String getSluggingPct(){
		int basesEarned = 0;
		for (int a : atBatResults) {
			if (a > 0) {
				basesEarned += a;
			}
		}
		double value = (basesEarned / (double) atBatResults.size());
		return formatNumber(value);
	}

	public String formatNumber(double value) {
		DecimalFormat df = new DecimalFormat("#.000");
		return df.format(value);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getAtBatResults() {
		return atBatResults;
	}

	public void setAtBatResults(ArrayList<Integer> atBatResults) {
		this.atBatResults = atBatResults;
	}

	@Override
	public String toString() {
		return "Name: " + name;
	}
	

}
