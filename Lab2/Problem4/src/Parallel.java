public class Parallel extends Circuit {
    private Circuit circuit1, circuit2;
    private  double potentialDifference;

    public Parallel(Circuit circuit1, Circuit circuit2) {
        this.circuit1 = circuit1;
        this.circuit2 = circuit2;
    }

    @Override
    public double getResistance() {
        double R1 = circuit1.getResistance();
        double R2 = circuit2.getResistance();
        return 1.0 / (1.0 / R1 + 1.0 / R2);
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    public void applyPotentialDiff(double V){
        this.potentialDifference = V;
        circuit1.applyPotentialDiff(V);
        circuit2.applyPotentialDiff(V);
    }
}
