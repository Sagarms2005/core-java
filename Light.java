package feb11.task;
public class Light {
    static boolean bulb;
    static boolean onOrOFF(){
        if(bulb){
            bulb=false;
            System.out.println("bulb  is on");
        }
        else {
            bulb=true;
            System.out.println("bulb is off");
        }
        return bulb;
    }

}
