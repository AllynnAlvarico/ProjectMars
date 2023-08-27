public class World {
    double marsGravity = -3.711;
    double earthGravity = -9.8;
    int Y = 1000;
    int X = 6999;

    public double getMarsGravity(){
        return this.marsGravity;
    }
    public double getEarthGravity(){return this.earthGravity;
    }
    public double getAltitude(){
        return this.Y;
    }
}
