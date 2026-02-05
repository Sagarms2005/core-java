package feb4;

public class Restuarant {
    public static void main(String[] args) {
        String name="empire";
        String owner="mahendra";
        String address="hassan";
        String [] branches={"shantigrama","kunigal","yediyur","mangaluru"};
        String Managers[]={"sagar","shashank","vaniyha","harini","sameeksha"};
        String []items={"chapathi","roti","palav","biryani"};
        System.out.println("the owner name is "+owner );
        System.out.println("the restuarant name is "+name);
        System.out.println("restaurant main branch address in "+address);
        System.out.println("no of branches "+branches.length);
        for(String branch:branches){
            System.out.println(branch);
        }
        System.out.println("no of managers avaible in this resturant"+Managers.length);
        for (String manager:Managers){
            System.out.println(manager);
        }
        System.out.println("item list");
        for (String item:items){
            System.out.println(item);
        }
    }
}
