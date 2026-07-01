// write a java program to print sum of 1st 5 natural numbers
public class whileloop2 {
    public static void main(String[] args) {
        int n=1;
        int sum=0;
        while (n<=5) {
            sum+=n;
            n++;

        }
        System.out.println(sum);
    }
}
