// Write a program to calculate the sum of squares of the first N natural numbers (1² + 2² + 3² + ... + N²).
public class forloop5 {
    public static void main(String[] args) {
        int sum=0;
        int n=10;
        for(int i=0;i<=n;i++){
            sum+=i*i;
        }
        System.out.println(sum);
    }
    
}
