public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    String s = str.toLowerCase();
    for(int i=0; i<s.length();i++){
      switch(s.charAt(i)){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            vowelsCount++;
            break;
        default :
          //do nothing
        }

      }
    return vowelsCount;
  }

}