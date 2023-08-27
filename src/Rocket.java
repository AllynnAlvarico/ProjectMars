import java.util.InputMismatchException;
import java.util.Scanner;

public class Rocket {
    World objWorld = new World();
    ClockTime objTime = new ClockTime();
    Scanner in = new Scanner(System.in);
    boolean invalidPower = true;
    boolean invalidAngle = true;
    boolean invalidMass = true;
    boolean loopInput = true;
    private byte power = 0;
    private float angle = 0;
    private int r_mass = 0;
    private double vSpeed = 0;
    private double v2Speed = 0;
    double acceleration = (getPower()-objWorld.getMarsGravity());
    private int hSpeed = 0;
    private double distance = objWorld.getAltitude();
    private double time = 0;
    private int fuel = 500;

    public Rocket(){
        setRocketParam();
    }
    public void setRocketParam(){
        while(loopInput){
            try {
                    invalidPower = true;
                    invalidAngle = true;
                    setPower();//this is setting the thrust power of the rocket engine.
                    setAngle();//this is the angle of the rocket -90 to 90.
                    setRocketMass();//this is for setting the rockets weight in Kilograms.
                    /*--------------------------------------------------------------------
                    setVSpeed();//this the velocity of the rocket after the calculation.
                    //setDistance();//this is the rate of descent of the rocket.
                    ----------------------------------------------------------------------*/
//                    setNewSpeed();//this is to get new speed of the descent rate of the rocket.
                    loopInput = false;
            }catch (InputMismatchException e){
                /*the "InputMismatchException" is that whenever the user inputs other than numeric then it will
                execute this block of code and the //in.nextLine(); is that it will keep looping till the user enters
                the numeric values*/
                System.out.println("Invalid input! Please enter numeric values.");
                in.nextLine();
            }
        }
    }
    public void setPower(){
        while (invalidPower) {
            try {
                System.out.println("Set power(0-4): ");
                power = in.nextByte();
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
    public void setRocketMass() {
        while (invalidMass) {
            try {
                System.out.println("Set Rockets Mass (kg): ");
                r_mass = in.nextInt();
                invalidMass = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numeric values.");
                in.nextLine();
            }
        }
    }
    public void setHSpeed(){
    }

    public void setVSpeed(){
        objTime.setFlightTime();
        v2Speed = (acceleration * objTime.getSeconds());
        vSpeed += v2Speed;
        //vSpeed = getPower() - objWorld.getEarthGravity();
    }
    public void setDistance(){
        this.distance += getVSpeed();
    }
    public int getPower(){return this.power;}
    public float getAngle(){return this.angle;}
    public float getRocketMass(){return this.r_mass;}
    public int getHSpeed(){return this.hSpeed;}
    public double getVSpeed(){return this.vSpeed;}
    public double getTime(){return time;}
    public double getDistance() {
        return this.distance;}
    public int getFuel() {return this.fuel;}
    public void calculate(Rocket rocket){
        rocket.setVSpeed();
        rocket.setDistance();
    }

}
