package laboratory1;

public class Temperature {
    private double value;
    private char scale; 

    // empty
    public Temperature() {
        this.value = 0.0;
        this.scale = 'C';
    }

    // only for value
    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    // only for scale
    public Temperature(char scale) {
        this.value = 0.0;
        this.scale = scale;
    }

    // both ofc
    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getCelsius() {
        if (scale == 'C') return value;
        return 5 * (value - 32) / 9; 
    }

    public double getFahrenheit() {
        if (scale == 'F') return value;
        return (9 * (value / 5)) + 32; 
    }

    public char getScale() {
        return scale;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    // @Override
    // public double ToString(){

    // }
}