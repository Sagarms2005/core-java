package feb11.task;

public class Mixer {
    static boolean mix;
    static boolean onOrOff(){
        if(mix){
            mix=false;
            System.out.println("mixer is on");
        }
        else {
            mix=true;
            System.out.println("mixer is off");
        }
        return mix;
    }
}
