import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        GUI GUI = new GUI();
//        GUI.windowTable();

        Rocket objRocket = new Rocket();
        SystemLogs SysLogs = new SystemLogs();
        ClockTime time = new ClockTime();


        while((objRocket.getDistance()) > 0) {
            SysLogs.DashPanel(objRocket.getVSpeed(),time.getSeconds(),time.getMinutes(),objRocket.getDistance(),objRocket.getAngle(),objRocket,time);
        }
        SysLogs.DashPanel(objRocket.getVSpeed(),time.getSeconds(),time.getMinutes(),objRocket.getDistance(),objRocket.getAngle(),objRocket,time);
        System.out.println("Rocket has landed");




    }
}