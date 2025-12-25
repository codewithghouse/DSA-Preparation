package sortings;



public class countingsort {
     //function to implement counting sortings
     public static void counting_sort(int numbers[]){
          //first loop -> for finding the largest element in the array
          int largest = Integer.MIN_VALUE;
          for(int i=0;i<numbers.length;i++){
               largest= Math.max(largest, numbers[i]);

          }
          System.out.println("the largest number in the array is "+largest);
          //making the counting array
          int  count[] = new int[largest+1];//counting array size declare
          for(int i=0;i<numbers.length;i++){
               count[numbers[i]]++;
               //har element kitne baar ara origal array me usku store karre ham log
          }
          //sorting ka part jisme ham counting array pe loop chalare
          int j=0;
          for(int i=0;i<count.length;i++){
                while (count[i]>0) {
                    numbers[j]=i;
                j++;
                count[i]--;
                }
          }


     }
     public static void main(String[] args) {
          int numbers[]={1,4,1,3,2,4,3,7};
          //function call
          counting_sort(numbers);
          //printing the array
          for(int i=0;i<numbers.length;i++){
               System.out.print(numbers[i]+" ");
          }
     }
}