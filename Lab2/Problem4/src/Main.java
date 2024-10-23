public class Main {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);

        Circuit circuit = new Parallel(h, f);

        double R = circuit.getResistance();
        System.out.println("Equivalent Resistance of the Circuit: " + R + " Ohms");

        double V = 12.0;
        circuit.applyPotentialDiff(V);
        System.out.println("Potential Difference applied: " + V + " V");

        double power = circuit.getPower();
        double current = circuit.getCurrent();
        System.out.println("Total Power Dissipated: " + power + " W");
        System.out.println("Total Current: " + current + " A");
    }
}