package midterm.man;

import java.util.Vector;

public class Manager {

    private Vector<String> team;
    private int bonus;

    public Manager(){
        this.bonus = 0;
    }

    public Manager(Vector<String> team, int bonus){
        this.team = team;
        this.bonus = bonus;
    }

    public void printTeam(){
        for(String t : team){
            System.out.println(t);
        }
    }

    public void setBonus(int a){
        bonus+=a;
    }
}
