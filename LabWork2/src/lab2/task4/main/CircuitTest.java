package lab2.task4.main;

import lab2.task4.connections.Parallel;
import lab2.task4.connections.Series;
import lab2.task4.model.Resistor;
import lab2.task4.system.Circuit;

public class CircuitTest {
    public static void main(String[] args) {
        Circuit r1 = new Resistor(7.0);
        Circuit r2 = new Resistor(10.0);
        Circuit r3 = new Resistor(6.0);
        Circuit r4 = new Resistor(4.0);
        Circuit c1 = new Parallel(r1, r2);
        Circuit c2 = new Series(r3, r4);
        Circuit circuit = new Parallel(c1, c2);
        double R = circuit.getResistance();

        circuit.applyPotentialDiff(220);

        System.out.println(c1.getResistance());
        System.out.println(c2.getResistance());
        System.out.println(R);

        System.out.println(circuit.getCurrent());
        System.out.println(circuit.getPower());
        System.out.println(r1.getPower());
    }
}
