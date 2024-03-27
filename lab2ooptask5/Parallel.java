package lab2ooptask5;

public class Parallel extends Circuit{
	Circuit c1;
	Circuit c2;
	public Parallel() {
		
	}

	public Parallel(Circuit c1, Circuit c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public double getResistance() {
		return 1.0/(1.0/c1.getResistance() + 1.0/c2.getResistance());
	}

	@Override
	public double getPotentialDiff() {
		return super.getPotentialDiffInParallel();
		}

	@Override
	public void applyPotentialDiff(double V) {
		c1.applyPotentialDiff(V);
		c2.applyPotentialDiff(V);
	}
	
}
