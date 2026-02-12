package feb11.task;

public class Mobile {
    static boolean isChharging;
    static boolean charge(){
        if(isChharging){
            isChharging=false;
            System.out.println("mobile is charging");
        }
        else {
            System.out.println("mobile is not charging");
            isChharging=true;
        }
        return isChharging;
    }
}
