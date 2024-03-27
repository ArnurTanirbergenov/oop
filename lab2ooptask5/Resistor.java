package lab2ooptask5;

public class Resistor extends Circuit {
	
	double R;
	
	private double pottentialDifference;
	
	public Resistor() {
		
	}
	
	public Resistor(double R) {
		this.R = R;
	}
	@Override
	public double getResistance() {
		return R;
	}

	@Override
	public double getPotentialDiff() {
		return pottentialDifference;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.pottentialDifference = V;
	}
	
}
