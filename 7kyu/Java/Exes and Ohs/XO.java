public class XO {
  
  public static boolean getXO (String str) {
    int count_x=0;
   // int count_X=0;
   int count_o=0;
   // int count_O=0;

  str = str.toLowerCase();
    // Good Luck!!
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='x'){count_x++;}
      //if(str.charAt(i)=='X'){count_X++;}
       if(str.charAt(i)=='o'){count_o++;}
       //if(str.charAt(i)=='O'){count_O++;}
    } 
    System.out.println(count_x +" " + count_o);
     
    if(count_x==0 && count_o==0 ){
        return true;    
    }
    if(count_x==count_o){return true;}
    
  
return false;
}

 
}