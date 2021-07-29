package Java.Core.Lection1;

public class Wall {

    private int higWall;

    public int getHigWall() {
        this.higWall = 2;
        return higWall;
    }

    public void jumpWall(){

        Human Human = new Human();
        Cat Cat = new Cat();
        Robot Robot = new Robot();
        Human.getJump();
        Cat.getJump();
        Robot.getJump();

    }
}
