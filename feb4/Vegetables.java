package feb4;

public class Vegetables {
    public static void main(String[] args) {
        String []vegtables={"tomata","oninions","cucumber","patatos"};
        String tomato=vegtables[0];
        System.out.println("arrays size"+vegtables.length);
        System.out.println(tomato+" "+vegtables[1]);

        for(String vegtable:vegtables){
            System.out.println(vegtable);
        }


    }
}
