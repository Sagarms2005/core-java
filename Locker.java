package feb11.task;

public class Locker {
    static boolean lock;
    static  boolean locker(){
        if(lock){
            lock=false;
            System.out.println("locker is locked");
        }
        else {
            lock=true;
            System.out.println("locker is not locked");
        }
        return lock;
    }
}
