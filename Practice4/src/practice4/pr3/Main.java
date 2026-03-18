package practice4.pr3;

import practice4.pr3.app.App;
import practice4.pr3.game.*;
import practice4.pr3.phone.IPhone;

public class Main {
    public static void main(String[] args) {
        App app = new App();

        Game logic = new LogicGame();
        Game memory = new MemoryGame();

        app.getStatistics(logic);
        app.getStatistics(memory);

        IPhone phone = new IPhone();
        phone.sell();
        phone.plugIn();
    }
}