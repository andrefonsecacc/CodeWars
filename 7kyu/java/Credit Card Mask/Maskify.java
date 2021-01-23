public class Maskify {
    public static String maskify(String str) {
      StringBuilder str_mask = new StringBuilder(str);
      if((str.length())>4){
        for(int i=0;i<(str.length()-4);i++){
          str_mask.setCharAt(i, '#'); 
          }
        }
      return str_mask.toString();
    }
}