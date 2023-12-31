public class SystemLogs {

    public void DashPanel(double a_speed,int a_seconds, int a_minute, double a_altitude,int a_mass, int a_fuel, float a_Angle,Rocket a_Rocket,ClockTime a_time){
        a_Rocket.calculate(a_Rocket);
        a_time.setFlightTime();
        String upperPanel = "V Speed: " + String.format("%.0f",Math.abs(a_speed)) +"   Real-Time: " + a_minute +"m "+ a_seconds+"s";
        String middlePanel = "Fuel: " + a_fuel + "      Mass: " + a_mass;
        String lowerPanel = "Altitude: " + String.format("%.0f",a_altitude) + "         Angle: " + a_Angle+"°";//degree symbol is alt+0176
        System.out.println("------------------------------");
        System.out.println(upperPanel);
        System.out.println(middlePanel);
        System.out.println(lowerPanel);
    }
}
