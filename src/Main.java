import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        GUI GUI = new GUI();
//        GUI.windowTable();

        Scanner inp = new Scanner(System.in);
        int num1;

        Rocket objRocket = new Rocket();
        SystemLogs SysLogs = new SystemLogs();
        ClockTime time = new ClockTime();
        SimConditions sims = new SimConditions();


        while((objRocket.getDistance()) > 0) {
            SysLogs.DashPanel(objRocket.getVSpeed(),time.getSeconds(),time.getMinutes(),objRocket.getDistance(),objRocket.getR_mass() ,objRocket.getFuel(), objRocket.getAngle(),objRocket,time);
        }
        SysLogs.DashPanel(objRocket.getVSpeed(),time.getSeconds(),time.getMinutes(),objRocket.getDistance(),objRocket.getR_mass(),objRocket.getFuel(),objRocket.getAngle(),objRocket,time);
        sims.landingCondition((int)objRocket.getVSpeed());
//        System.out.println("Rocket has landed");


    System.out.println("Enter first number: ");
    num1 = inp.nextInt();

    num1 = num1 + 10;

    System.out.println("result: " + num1);

    }
}