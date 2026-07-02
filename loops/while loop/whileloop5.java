// write jav program to finf factorail of given number
public class whileloop5 {
    public static void main(String[] args) {
        int n=1;
        int fact=1;
        while (n<=5) {
            fact*=n;
            n++;
        }
        System.out.println(fact);
    }
}
