package com.example.a72button;


import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class BottleDispenser {

    Bottle pepsiMax = new Bottle();
    Bottle bigPepsiMax = new Bottle();
    Bottle colaZero = new Bottle();
    Bottle bigColaZero = new Bottle();
    Bottle fantaZero = new Bottle();
    int i, choice;
    ArrayList<Bottle> bottles = new ArrayList<Bottle>();
    private double money = 0;
    private static BottleDispenser bd = new BottleDispenser();

    public static BottleDispenser getInstance(){
        return bd;
    }

    public BottleDispenser() {
        money = 0;
        bigPepsiMax.setName("Pepsi max").setManufacturer("Pepsi").setEnergy(0.9).setSize(1.5).setPrize(2.2);
        colaZero.setName("Coca-Cola Zero").setManufacturer("Coca-Cola").setEnergy(0.3).setSize(0.5).setPrize(2);
        bigColaZero.setName("Coca-Cola Zero").setManufacturer("Coca-Cola").setEnergy(0.9).setSize(1.5).setPrize(2.5);
        fantaZero.setName("Fanta Zero").setManufacturer("Fanta").setEnergy(0.3).setSize(0.5).setPrize(1.95);
        bottles.add(pepsiMax);
        bottles.add(bigPepsiMax);
        bottles.add(colaZero);
        bottles.add(bigColaZero);
        bottles.add(fantaZero);

    }

    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");

    }

    public void listBottles() {
        for(Bottle alkio : bottles) {
            i++;
            System.out.println(i+". Name: " + alkio.getName());
            System.out.println("\tSize: " + alkio.getSize()+"\tPrice: " + alkio.getPrize());
        }
        i=0;
    }


    public void buyBottle() {

        Scanner scan = new Scanner(System.in);
        if (money < 1) {
            System.out.println("Add money first!");
        }
        else if(bottles.isEmpty()){
            System.out.println("Uh oh ran outta bottles");

        }
        else {
            listBottles();
            System.out.print("Your choice: ");
            choice = scan.nextInt()-1;
            money = money - bottles.get(choice).getPrize();
            System.out.println("KACHUNK! "+bottles.get(choice).getName()+" came out of the dispenser!");
            bottles.remove(choice);
        }
    }



    public void returnMoney() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Klink klink. Money came out! You got " + formatter.format(money) + "€ back");
        money = 0;
    }

}