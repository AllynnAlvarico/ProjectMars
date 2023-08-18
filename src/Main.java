import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Rocket objRocket = new Rocket();
        //ETA objE = new ETA();

        System.out.println(objRocket.getPower() + System.lineSeparator() + objRocket.getAngle());
        while(objRocket.getDistance()>0) {
            System.out.println("Rocket of descent rate per second: " + objRocket.getVSpeed());
            System.out.println("Rocket distance to ground: " + objRocket.getDistance());
        }

    }
}