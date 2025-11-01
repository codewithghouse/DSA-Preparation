package loops;

public class sqpattern {
    public static void main(String[] args) {
        // 4*4 ka matrix hai yahan pe
        // 2 loop chalanan hoga yahaan pe ek for ros and ek for columns 

        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
