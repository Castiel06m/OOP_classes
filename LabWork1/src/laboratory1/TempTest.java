package laboratory1;

public class TempTest {
    public static void main(String[] args) {
        Temperature tema1 = new Temperature();
        Temperature tema2 = new Temperature(2000, 'C');
        Temperature tema3 = new Temperature(273, 'F');
        Temperature tema4 = new Temperature(41.2, 'C');

        System.out.println(tema1.getCelsius());
        System.out.println(tema2.getCelsius());
        System.out.println(tema3.getFahrenheit());
        System.out.println(tema4.getFahrenheit());

        tema3.setBoth(100, 'F');
        System.out.println(tema3.getCelsius());


    }
}
