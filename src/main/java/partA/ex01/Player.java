package partA.ex01;

public class Player {
    //Fields
    public String name;
    public double height;
    public int yearsInLeague;

    //Constructor
    public Player(String name, double height, int yearsInLeague){
        this.name = name;
        this.height = height;
        this.yearsInLeague = yearsInLeague;
    }

    //Methods
    public void think(){
        System.out.println("I will win.");
    }
    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Years in League: " +yearsInLeague);
    }
}
