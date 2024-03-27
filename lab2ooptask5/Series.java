package lab2ooptask5;

public class Series extends Circuit {
	Circuit c1;
	Circuit c2;
	public Series() {
		
	}

	public Series(Circuit c1, Circuit c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public double getResistance() {
		return c1.getResistance() + c2.getResistance();
	}

	@Override
	public double getPotentialDiff() {
		return super.getPotentialDiffInSeries();
		}

	@Override
	public void applyPotentialDiff(double V) {
		c1.applyPotentialDiff(V);
		c2.applyPotentialDiff(V);
	}
	
}
