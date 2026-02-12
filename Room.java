package feb11.task;

public class Room {
    static boolean door;
    static boolean openClose(){
        if(door){
            door=false;
            System.out.println("door is open");
        }
        else {
            System.out.println("door is close");
        }
        return door;
    }
}
