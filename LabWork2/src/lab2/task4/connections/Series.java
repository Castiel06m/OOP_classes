package lab2.task4.connections;

import lab2.task4.system.Circuit;

public class Series extends Circuit {
    private Circuit a;
    private Circuit b;

    public Series(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResistance() {
        return a.getResistance() + b.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return a.getPotentialDiff() + b.getPotentialDiff();
    }

//    V1 = V * (R1 / R_total)
    @Override
    public void applyPotentialDiff(double V) {
        double rTotal = getResistance();
        if(rTotal != 0){
            a.applyPotentialDiff(V * (a.getResistance() / rTotal));
            b.applyPotentialDiff(V * (b.getResistance() / rTotal));
        }
    }
}
