// Write a program to count how many numbers between 1 and 100 are divisible by 6.
public class forloop6 {
    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<=100;i++){
            if(i%6==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
