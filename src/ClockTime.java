public class ClockTime {
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;

    public void setSeconds() {
        this.seconds += 1;
        if (getSeconds() >=60){
            seconds =0;
            minutes +=1;
        }
    }
    public void setMinutes() {
        if (getMinutes() >=60){
            minutes =0;
            this.hours +=1;
        }
    }
    public void setHours() {
        if (getHours()>=24){
        this.hours =0;}
    }
    public void setFlightTime(){
        setSeconds();
        setMinutes();
        setHours();
    }
    public int getSeconds() {return seconds;}
    public int getMinutes() {return minutes;}
    public int getHours() {return hours;}
}
