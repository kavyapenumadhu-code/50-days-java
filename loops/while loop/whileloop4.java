// write a java program to find a sum of even numbers and odd numbers in given range
public class whileloop4 {
    public static void main(String[] args) {
        int m=1,n=10;
        int evensum=0,oddsum=0;
        while(m<=n){
            if (m%2==0) {
                evensum+=m;
                
            } else {
                oddsum+=m;
                
            }
            m++;
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
