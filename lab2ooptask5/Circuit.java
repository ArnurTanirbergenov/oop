package lab2ooptask5;

public abstract class Circuit {
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	
	protected double getPotentialDiffInSeries() {
		return getCurrent() * getPotentialDiff();
	}
	
	protected double getPotentialDiffInParallel() {
		return getPotentialDiff();
	}
	public double getPower() {
		return getPotentialDiff() * getPotentialDiff() /  getResistance();
	}
	
	public double getCurrent() {
		return getPotentialDiff() * getResistance();
	}
	
}
