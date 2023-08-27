public class SystemLogs {

    public void DashPanel(double a_speed,int a_seconds, int a_minute, double a_altitude, float a_Angle,Rocket a_Rocket,ClockTime a_time){
        String upperPanel = "V Speed: " + Math.abs(a_speed) +"   Real-Time: " + a_minute +"m "+ a_seconds+"s";
        String lowerPanel = "Altitude: " + String.format("%.0f",a_altitude) + "         Angle: " + a_Angle+"°";//degree symbol is alt+0176
        a_Rocket.calculate(a_Rocket);
        a_time.setFlightTime();
        System.out.println("------------------------------");
        System.out.println(upperPanel);
        System.out.println(lowerPanel);
    }
}
