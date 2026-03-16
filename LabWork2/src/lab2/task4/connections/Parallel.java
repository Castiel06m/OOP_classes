package lab2.task4.connections;

import lab2.task4.system.Circuit;

public class Parallel extends Circuit {

    private Circuit a;
    private Circuit b;

    public Parallel(Circuit a, Circuit b){
        this.a = a;
        this.b = b;
    }
//    R_total =  (R1 * R2) / (R1 + R2)
    @Override
    public double getResistance() {
        double r1 = a.getResistance();
        double r2 = b.getResistance();
        if(r1 + r2 == 0) return 0;
        return (r1 * r2) / (r1 + r2);
    }

    @Override
    public double getPotentialDiff() {
        return a.getPotentialDiff(); // везде одинаковое напряжение
    }

    @Override
    public void applyPotentialDiff(double V) {
        a.applyPotentialDiff(V);
        b.applyPotentialDiff(V);
    }
}
