import java.util.Arrays;
public class BrokenSequence {
	public int findMissingNumber(String sequence) {	
    
    if (sequence.matches("[0-9 ]+")){
    
    String [] s = sequence.split(" ");
    int [] a  = new int [s.length];
    
    for(int i=0; i<s.length;i++){a[i]=Integer.parseInt(s[i]);}
    
    Arrays.sort(a);
    
    int minvalue = 1;
    
  
    for(int j=0;j<a.length;j++){
        
        if (a[j]!=minvalue){
            return minvalue;
        }
        
        if(minvalue==a[s.length-1]){
        return 0;
        }   
        
        minvalue++;
    }
    
    }
    
    if (sequence.equals(" ") || sequence.equals("")) {
    	return 0;
    }

    return 1; 
    } 

    
    public static void main (String[] args){
      System.out.println(new BrokenSequence().findMissingNumber("1 2 3 5"));
      System.out.println("------------------------------");
      System.out.println(new BrokenSequence().findMissingNumber("1 3"));
      System.out.println("------------------------------");
      System.out.println(new BrokenSequence().findMissingNumber(""));
      System.out.println("------------------------------");
      System.out.println(new BrokenSequence().findMissingNumber("2 1 4 3 a"));
      System.out.println("------------------------------");
      System.out.println(new BrokenSequence().findMissingNumber("1 3 2 4 5"));
    }
    
    
}




