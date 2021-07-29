package Java.Core.Lection1;

public class Robot {

    public void getRun(){
        Track Track = new Track();
        if( Track.getLightTrack() > 0 ){
            System.out.println("Робот  бежит!");
        }else {
            System.out.println("Робот небежит!");
        }
    }

    public void getJump(){
        Wall Wall = new Wall();
        if(Wall.getHigWall() > 0){
            System.out.println("Робот прыгнул!");
        }else {
            System.out.println("Робот непрыгнул!");
        }
    }
}
