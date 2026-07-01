// write a java program to print product of 1st 5 natural numbers
public class whileloop3 {
    public static void main(String[] args) {
        int n=1,product=1;
        while (n<=5) {
            product=product*n;
            n++;
        }
        System.out.println(product);
    }
}
