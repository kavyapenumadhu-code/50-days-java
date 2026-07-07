// *     *
// **   **
// *** ***
// *******
public class pattern15 {
    public static void main(String[] args) {
        int star=1,space=5,n=4;
        for(int i=1;i<=n;i++){
            // left
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            // middle
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            if(i==4){
                System.out.print("*");
            }
            // right
             for(int l=1;l<=star;l++){
                System.out.print("*");
            }
            if(i<3){
                star++;
            }
            space-=2;
            System.out.println();
        }
    }
}
