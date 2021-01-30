import java.util.LinkedList; 
public class DRoot {
  public static int digital_root(int n) {
    int total=0;
    LinkedList<Integer> stack = new LinkedList<Integer>();
    
      while (n > 0) {
      stack.push( n % 10 );
      n = n / 10;
      }
      

     for(Integer s : stack){
      total = total +s;
      }
        
      if(total>=10){  
       return digital_root(total);
     }
      
      return total;
 
    }
  }