package Java.Core.Lection1;

public class Human {

    public void getRun(){
        Track Track = new Track();
        if( Track.getLightTrack() == 500 ){
            System.out.println("Человек  небежит!");
        }else {
            System.out.println("Человек бежит!");
        }

    }

    public void getJump(){
        Wall Wall = new Wall();
        if(Wall.getHigWall() == 2){
            System.out.println("Человек непрыгнул!");
        }else {
            System.out.println("Человек прыгнул!");
        }

    }

}
