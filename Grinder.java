package feb11.task;

public class Grinder {
    static boolean grind;
    static boolean turns(){
        if(grind){
            grind=false;
            System.out.println("grinder is running");
        }
        else{
            System.out.println("grinder is not running");
            grind=true;
        }
        return grind;
    }
}
