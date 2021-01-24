import java.util.*;

public class Ordering {
  public String orderWord(String s){
    //your great code here:
  String invalid ="Invalid String!";

  if( s==null ||"".equals(s)){
      return invalid;
  }
        //String original = s.toLowerCase();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

    return sorted;
  }
}