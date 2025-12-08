package Arrayspart1;

public class arrayupdation {
    // function to update the array 
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={23,24,25};
        update(marks);

        //verify to check .updated or not
        for(int i=0;i<marks.length;i++){
            System.out.print(" "+marks[i]);
        }
    }
}
