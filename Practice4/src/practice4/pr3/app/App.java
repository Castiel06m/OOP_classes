package practice4.pr3.app;

import practice4.pr3.game.Game;

public class App {
    public void getStatistics(Game g){
        System.out.println("Your Stats");
        g.a();
        g.b();
        g.c();
//        g.d(); ne mozhem, tak kak ne IGame
    }
}
