package feb11.task;

public class Mouse {
    static boolean works;
    static boolean onOrOff(){
        if(works){
            System.out.println("mouse is works");
            works=false;
        }
        else{
            System.out.println("mouse is not works");
        }

        return works;
    }
}
