    // *
//    ***
//   *****
//  *******
// *********

public class pattern5 {
    public static void main(String[] args) {
        int n=5,space=4,star=1;
        for(int i=1;i<=n;i++){
            // space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            // star
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            star+=2;
            space--;
            System.out.println();
        }
    }
    
}
