package feb11.task;

public class Fan {
    static boolean turns;
    static boolean fan(){
        if(turns){
            System.out.println("fan is on");
        turns=false;}
        else {
            System.out.println("fan is off");
            turns=true;
        }
        return turns;
    }
}
