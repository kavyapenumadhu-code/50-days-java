// write a java program to check whether character is laphabet or not
public class ifelse3 {
    public static void main(String[] args) {
      char ch='@' ;
      if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
        System.out.println(ch+" is alphabet");
      }
      else{
        System.out.println(ch+" is not a alphabet");

      }
    }
}
