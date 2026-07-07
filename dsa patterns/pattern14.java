//    *    *
//   **    **
//  **********
// ************
//  **********
//   **    **
//    *    *
public class pattern14 {
    public static void main(String[] args) {
        int star=1,space=3,n=7;
        for(int i=1;i<=n;i++){
            // left
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            // middle
            for(int l=1;l<=4;l++){
                if(i<3||i>5){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            // right
            for(int m=1;m<=star;m++){
                System.out.print("*");
            }
            if(i<4){
                star++;
                space--;
            }
            else{
                star--;
                space++;
            }
            System.out.println();
        }
    }
    
}