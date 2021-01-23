public class FindOddCubes {
 
 public static int cubeOdd(int arr[]) {
 int sum_odd=0;
 for(int i=0; i<arr.length;i++){
   arr[i]=arr[i]*arr[i]*arr[i];
   if(arr[i]%2!=0){
   sum_odd+=arr[i];
   }
 }
 
 
   return sum_odd;
  }
}