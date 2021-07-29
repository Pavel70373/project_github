package Java.Core.Lection1;

public class Track {

    private int lightTrack = 500;

    public int getLightTrack() {
        return lightTrack;
    }

    public void runTrack(){

        Human Human = new Human();
        Cat Cat = new Cat();
        Robot Robot = new Robot();
        Human.getRun();
        Cat.getRun();
        Robot.getRun();

    }

}
