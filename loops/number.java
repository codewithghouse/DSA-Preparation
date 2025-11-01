package loops;

public class number {
    public static void main(String[] args) {
        int a =1;
        while (a<10) {
         System.out.println("hello ghouse"+a);   
         a++;
         if (a==4) {
            System.out.println("the value of a is "+a);
            continue;
            
         }
        }
        System.out.println("printer numbers from 10");
    }
}
