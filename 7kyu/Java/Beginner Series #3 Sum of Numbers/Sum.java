 public class Sum
  {
     public int GetSum(int a, int b)
     {
      int sum=0;      
      if(a==b){return a;}
      int minimo = Math.min(a,b);
      int maximo= Math.max(a,b);
      
     
      for(int i=minimo; i<=maximo;i++){
      sum+=i;

      }


      //Good luck!
      return sum;
     }
  }