package lab2.task4.system;

public abstract class Circuit {
    public abstract double getResistance(); // это R
    public abstract double getPotentialDiff();  // это наша V
    public abstract void applyPotentialDiff(double V);
    public double getPower(){
        return Math.pow(getPotentialDiff(), 2) / getResistance(); // P = V^2 / R
    }

    public double getCurrent(){
        return getPotentialDiff() /  getResistance();  // I = V / R
    }
}
