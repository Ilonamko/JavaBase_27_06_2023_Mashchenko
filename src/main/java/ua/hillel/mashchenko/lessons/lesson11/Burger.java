package ua.hillel.mashchenko.lessons.lesson11;

public class Burger {

    String bun;
    String meat;
    String cheese;
    String veggies;
    String mayo;

    // Звичайний бургер
    public Burger(String bun, String meat, String cheese, String veggies, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = mayo;
        System.out.println("Classic burger: " + this.bun + " , " + this.meat + " , "
                + this.cheese + " , " + this.veggies + " , " + this.mayo);
    }

    public Burger(String bun, String meat, String cheese, String veggies) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        System.out.println("Diet burger: " + this.bun + " , " + this.meat + " , "
                + this.cheese + " , " + this.veggies);
    }

    public Burger(String bun, String meat1, String meat2, String cheese, String veggies, String mayo) {
        this.bun = bun;
        this.meat = meat1 + " and " + meat2;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = mayo;
        System.out.println("Burger with double meat: " + this.bun + " , " + this.meat + " , "
                + this.cheese + " , " + this.veggies + " , " + this.mayo);
    }

}
