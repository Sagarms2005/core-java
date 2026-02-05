package feb3.task;

import java.util.Scanner;

public class TeaShop {
    public static void main(String[] args) {

        String[] menu = {
                "1)Ginger Tea",
                "2)Masala Chai",
                "3)Lemon Tea",
                "4)Green Tea",
                "5)Black Tea",
                "6)Honey Lemon Tea",
                "7)Filter Coffee",
                "8)Black Coffee",
                "9)Cold Coffee",
                "10)Badam Milk",
                "11)Marie Gold",
                "12)Rusk",
                "13)Bun Maska",
                "14)Veg Puff",
                "15)Egg Puff",
                "16)Samosa",
                "17)Onion Pakoda",
                "18)Vada Pav",
                "19)Chocolate Cookie"
        };

        System.out.println("Total items in Tea Shop: " + menu.length);
        System.out.println("our items are");
        int k=0;
        while(k<menu.length){
            System.out.print(menu[k]);
            k++;
        }
        System.out.println();
        System.out.println("enter the no what ever u want");
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        System.out.println("here is u item->"+menu[n-1]);
    }
}