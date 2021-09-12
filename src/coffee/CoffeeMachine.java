package coffee;

import java.util.Scanner;

public class CoffeeMachine {
    private Boolean pay(Integer banknoteNominal){
        if(banknoteNominal == 5 || banknoteNominal == 10){
            return true;
        }
        return false;
    }

    private String choose(Integer option){
        if(option == 1){
            return "Coffee";
        } else if(option == 2){
            return "Cappuccino";
        }
        return "Incorrect option";
    }

    private void showInfo(String message){
        System.out.println(message);
    }

    private String done(String coffeeType){
        return coffeeType;
    }

    public void prepare(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please insert banknote");
        String banknote = myObj.nextLine();  // Read user input
        System.out.println("Banknote: " + banknote);  // Output user input
        if(this.pay(5)){
            System.out.println("Please choose option: Americano, Cappuccino, Latte");
            String option = myObj.nextLine();  // Read user input
            System.out.println("Please choose how many grams of sugar: 10, 20, 30");
            String add = myObj.nextLine();  // Read user input
            System.out.println("You choose is " +option);  // Output user input
            this.showInfo("Preparing " + option);
            this.showInfo("Done!");
        } else {
            this.showInfo("Please insert correct banknote");
        }
    }
}