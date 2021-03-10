package programs;

public class remove_duplicate {

	 public static void main(String []args){
         int a[] = new int[]{1, 3, 4, 5, 6, 12, 13, 17, 19, 22, 23, 25, 27, 28, 28, 35, 36, 37, 39, 43, 46, 48, 54, 59, 62, 63, 65, 68, 68, 70, 70, 72, 79, 82, 83, 92, 92, 93, 95, 96, 96, 100};
         int b[] = new int[] {2, 2, 2, 2, 2};
         remove(b, 5);
  }
  
  public static int remove(int A[],int N){
     int size = N; 
     for(int x=1;x<N;x++){
         if(A[x-1]==A[x])
         size--;
     }      
     int result[] = new int[size];
     int count=0;
     result[count]=A[0];
     for(int x=1;x<N;x++){
         if(result[count]!=A[x]){
             count++;
             result[count]=A[x];
         }
     }
     for(int x=0;x<size;x++){
         System.out.print(result[x]+" ");
     }
     return size;
          
 }

}
