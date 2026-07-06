//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

public class pattern7 {
    public static void main(String[] args) {
        int n=9,space=4,star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            if(i<4){
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
            }
            System.out.println();
        }
    }
    
}
