package lab2.task1.partC;

public class Food {
    private String name;
    private int calories;

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Food food = (Food) obj;
        return calories == food.calories && java.util.Objects.equals(name, food.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, calories);
    }

    @Override
    public String toString() {
        return "Food{" + "name=" + name + ", calories=" + calories + '}';
    }
}
