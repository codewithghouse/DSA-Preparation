package Arrayspart1;
//linear search code is here ,
//linear search works ,by searching a element one by one in the array
public class linearseach {

    //function to find index value using linear search 
    public static int linearsearch(int numbers[] , int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=10;
        int index = linearsearch(numbers, key);
        if(index==-1){
            System.out.println("the number doesnot exits");
        }else{
            System.out.println("the key is at index"+index);
        }
        
    }
    
}
