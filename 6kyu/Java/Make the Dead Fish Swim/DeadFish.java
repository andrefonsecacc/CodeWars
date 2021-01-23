public class DeadFish {
    public static int[] parse(String data) {
        // Implement me! :)
      
      char someChar = 'o';
      int count = 0;
 
      for (int i = 0; i < data.length(); i++) {
      if (data.charAt(i) == someChar) {
        count++;
      }
    }
      
      
      int [] arr = new int [count]; 
      int total = 0;
      int j=0;
      for (int i=0; i<data.length() ; i++){

      if (data.charAt(i)=='i'){
          total++;
      }
      if (data.charAt(i)=='d'){
          total--;
      }
      if (data.charAt(i)=='s'){
          total=total*total;
      }
      if (data.charAt(i)=='o'){
          arr[j] = total;
          j++;
      }
        
    }
      return arr;
  }
}