import sun.util.resources.cldr.en.CalendarData_en_SG;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;

public class Greenhouse {
    public static void main(String[] args) {
        Greenhouse Greenhouse = new Greenhouse();
        Plants Plants = new Plants();


    }
//main method
public Greenhouse() {
    System.out.println("Hello World! Good luck on your exam");
    Greenhouse();
    randomReplant();
    veggieOfTheDay();
    countFlowers();
    changeTemperature();
    starTriangle();
    perimeterTriangle();



}
public void Greenhouse() {

    System.out.println(" Welcome to Daud's Greenhouse! It is tomatoes that we are watering  right now. We have 20 Flowers");

}
public void randomReplant(){
    int randomInt =  (int) (Math.random() * 15);

    if (randomInt == 0 || randomInt == 1) {
        System.out.println();
    }

        if (randomInt == 2|| randomInt == 3) {
            System.out.println("we are planting 15 Flowers");}

            if (randomInt == 4 || randomInt == 5) {
                System.out.println("we are plantimg 5 flowers");}
                if (randomInt == 6 || randomInt == 7) {
                    System.out.println("we are planting 12 flowers");}
                    if (randomInt == 8 || randomInt == 9) {
                        System.out.println("we are planting 20 flowers");}
                        if (randomInt == 10 || randomInt == 11) {
                            System.out.println("We are planting 18 flowers");}
                            if (randomInt == 12 || randomInt == 13) {
                                System.out.println("we are planting 18 flowers");
                            }
                                if (randomInt == 14 || randomInt == 15) {
                                    System.out.println("we are planting 12 flowers");
                            }
                        }

    public void veggieOfTheDay() {
        randomReplant();
        int randomInt =  (int) (Math.random() * 15);
        if (randomInt == 4 || randomInt == 5) {
            System.out.println("Today choosen veggie is tomato");}}

    public void countFlowers() {
        for (int i = 2; i <= 6; i++) {
              System.out.println(i);
}
        for (int i = 20; i <= 110; i+=30) {
              System.out.println(i);}

        for (int i = 8; i >= 0; i--) {
           System.out.print(i +", ");

    }}
    public void changeTemperature() {

        System.out.println();
}


public void starTriangle(){

    System.out.println('*');
    System.out.println("* *");
    System.out.println("* * *");
    System.out.println("* * * *");
    System.out.println("* * * * *");
    System.out.println();
    }

public void perimeterTriangle(){
    System.out.println("-");
    System.out.println("- -");
    System.out.println("- * -");
    System.out.println("- * * -");
    System.out.println("- * * * -");
    System.out.println("- * * * * * -");
    System.out.println("- - - - - - - -");

}}




























