package pr3.delivery.model;

public class Engine {
    private String type;
    private double horsePower;

    public Engine(String type, double horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public String getEngineInfo() {
        return "Engine Type: " + type + ", HP: " + horsePower;
    }
}