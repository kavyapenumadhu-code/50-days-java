// write a java program to check whether a given character is character,digit,specail character
public class ifelse6 {
    public static void main(String[] args) {
        char ch='@';
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')){
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                System.out.println(ch+" is character ");
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    System.out.println(ch+" is vowel");
                }
                else{
                    System.out.println(ch+" is consonant");
                }
            }
            else{
                System.out.println(ch+" is number");
            }
        }
        else{
            System.out.println(ch+" is special character");
        }
    }
}
