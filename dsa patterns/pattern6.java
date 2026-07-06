// *********
//  *******
//   *****
//    ***
//     *

public class pattern6 {
    public static void main(String[] args) {
        int n=5,star=9,space=0;
        for(int i=1;i<=n;i++){
            // space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            // star
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            space++;
            star-=2;
            System.out.println();
        }
    }
}
