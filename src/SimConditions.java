public class SimConditions {

    int landSpeed = 40;
    int safeLand = 20;

    public void landingCondition(int verticalSpeed){
        if (Math.abs(verticalSpeed)<= landSpeed & Math.abs(verticalSpeed)> safeLand) {
            System.out.println("Rocket has landed");
        } else if (Math.abs(verticalSpeed) < safeLand) {
            System.out.println("Rocket landing was perfect");
        }else {
            System.out.println("Rocket landing has failed");
        }

    }





}
