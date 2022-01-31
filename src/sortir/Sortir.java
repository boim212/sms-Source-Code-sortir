package sortir;

import java.util.Scanner;

public class Sortir {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2, bil3, bil4, temp;
        temp = 0;
        
        System.out.println("Tugas Program Sorting 4");
        System.out.println("-----------------------");
        System.out.print  ("Bilangan ke-1 = ");
        bil1 = sc.nextInt();
        System.out.print  ("Bilangan ke-2 = ");
        bil2 = sc.nextInt();
        System.out.print  ("Bilangan ke-3 = ");
        bil3 = sc.nextInt();
        System.out.print  ("Bilangan ke-4 = ");
        bil4 = sc.nextInt();
        
        
        
        do {
                if (bil1 > bil2){
                    temp = bil1;
                    bil1 = bil2;
                    bil2 = temp;
                }
                else if (bil2 > bil3){
                    temp = bil2;
                    bil2 = bil3;
                    bil3 = temp;
                }
                else if(bil3 > bil4){
                    temp = bil3;
                    bil3 = bil4;
                    bil4 = temp;
                }
            
        }while(bil1 > bil2 || bil2 > bil3 || bil3 > bil4);
        System.out.println(bil1 + " " + bil2 + " " + bil3 + " " + bil4);
    }
}
            