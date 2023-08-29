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
    private int power = 0;
    private float angle = 0;
    private int r_mass = 85000;//new
    private double vSpeed = 0;
    double acceleration = (getPower()-objWorld.getMarsGravity());
    private int hSpeed = 0;
    private double distance = objWorld.getAltitude();
    private double time = 0;
    private int fuel = 0;//new

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
                    setRocketFuel();
                    /*--------------------------------------------------------------------
                    setRocketMass();//this is for setting the rockets weight in Kilograms.
                    setVSpeed();//this the velocity of the rocket after the calculation.
                    setDistance();//this is the rate of descent of the rocket.
                    setNewSpeed();//this is to get new speed of the descent rate of the rocket.
                    ----------------------------------------------------------------------*/
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
                power = in.nextInt();
                if (power >= 0 & power <= 1000) {
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
       /* while (invalidMass) {
            try {
                System.out.println("Set Rockets Mass (kg): ");
                r_mass = in.nextInt();
                invalidMass = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numeric values.");
                in.nextLine();
            }
        }*/
    }
    public void setRocketFuel() {
        while (invalidMass) {
            try {
                System.out.println("Set Rockets fuel oxygen (L): ");
                int fuelOxygen = in.nextInt();
                System.out.println("Set Rockets fuel hydrogen (L): ");
                int fuelHydrogen = in.nextInt();
                fuel = (fuelOxygen + fuelHydrogen)/2;
                invalidMass = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numeric values.");
                in.nextLine();
            }
        }
    }//new
    public void calculate_FuelAndMass(){
        switch (getPower()) {
            case 4:
                this.fuel -= 4;
            case 3:
                this.fuel -= 3;
            case 2:
                this.fuel -= 2;
            case 1:
                this.fuel -= 1;
            case 0:
                this.fuel -=0;
        }
    }//new
    public void setHSpeed(){
    }

    public void setVSpeed(){
        objTime.setFlightTime();
        double v2Speed = (acceleration * objTime.getSeconds());//modified
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
    public double getDistance() {return this.distance;}
    public int getR_mass() {return r_mass;}//new
    public int getFuel() {return this.fuel;}
    public void calculate(Rocket rocket){
        rocket.setVSpeed();
        rocket.setDistance();
        calculate_FuelAndMass();//new
    }

}
