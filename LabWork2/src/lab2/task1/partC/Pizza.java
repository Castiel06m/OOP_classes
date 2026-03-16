package lab2.task1.partC;

public class Pizza extends Food{
    private String topping;

    public Pizza(String name, int calories, String topping) {
        super(name,calories);
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }
    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return super.toString() + "Pizza{" + "topping=" + topping + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Pizza p = (Pizza) obj;
        return java.util.Objects.equals(topping, p.topping);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), topping);
    }
}
