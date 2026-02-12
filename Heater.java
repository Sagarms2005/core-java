package feb11.task;

public class Heater {
    public static boolean isHeated;
    public static boolean heat(){
        if(isHeated){
            isHeated=false;
            System.out.println("heater is heated");
        }
        else{
            isHeated=true;
        }
        return isHeated;
    }
}
