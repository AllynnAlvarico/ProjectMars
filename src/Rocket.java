import java.util.InputMismatchException;
import java.util.Scanner;

public class Rocket {
    World objWorld = new World();

    Scanner in = new Scanner(System.in);
    boolean invalidPower = true;
    boolean invalidAngle = true;
    boolean loopInput = true;
    private int power = 0;
    private float angle = 0;
    private int hSpeed = 0;
    private double vSpeed = 0;
    private double distance = objWorld.getAltitude();
    private int time = 0;
    private int fuel = 500;
    public Rocket(){
    setPowerAndAngle();
    }
    public void setPowerAndAngle(){
        while(loopInput){
            try {
                    invalidPower = true;
                    invalidAngle = true;
                    setPower();
                    setAngle();
                    setVSpeed();
                    setDistance();
                    loopInput = false;
            }catch (InputMismatchException e){
                //the "InputMismatchException" is that whenever the user inputs other than numeric then it will
                //execute this block of code and the //in.nextLine(); is that it will keep looping till the user enters
                //the numeric values
                System.out.println("Invalid input! Please enter numeric values.");
                in.nextLine();
            }
        }
    }
    public void setPower(){
        while (invalidPower) {
            try {
                System.out.println("Set power(0-4): ");
                power = in.nextInt();
                if (power >= 0 & power <= 4) {
                    invalidPower = false;
                }
                else {
                    System.out.println("Invalid power input"+ System.lineSeparator());
                }
            }
            catch (InputMismatchException e){
            System.out.println("Invalid input! Please enter numeric values.");
            in.nextLine();
            }
        }
    }
    public void setAngle() {
        while (invalidAngle) {
            try {
                System.out.println("Set Angle(-90 to 90): ");
                angle = in.nextFloat();
                if (angle >= -90 & angle <= 90) {
                    invalidAngle = false;
                } else {
                    System.out.println("Invalid angle input" + System.lineSeparator());
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numeric values.");
                in.nextLine();
            }
        }
    }
    public void sethSpeed(int a_hSpeed){this.hSpeed = a_hSpeed;}
    public void setVSpeed(){
        vSpeed -= getPower() + objWorld.getGravity();
    }
    public void setDistance(){
        distance -= getVSpeed();
    }
    public int getPower(){return this.power;}
    public float getAngle() {return this.angle;}
    public int getHSpeed() {return this.hSpeed;}
    public double getVSpeed() {return this.vSpeed;}
    public double getDistance() {return this.distance;}
    public int getFuel() {return this.fuel;}
}
