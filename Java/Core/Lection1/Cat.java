package Java.Core.Lection1;

public class Cat {

    public void getRun(){
        Track Track = new Track();
        if( Track.getLightTrack() == 500 ){
            System.out.println("Кот  небежит!");
        }else {
            System.out.println("Кот бежит!");
        }
    }

    public void getJump(){
        Wall Wall = new Wall();
        if(Wall.getHigWall() == 2){
            System.out.println("Кот непрыгнул!");
        }else {
            System.out.println("Кот прыгнул!");
        }
    }
}
