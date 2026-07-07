// *******
// *** ***
// **   **
// *     *
public class pattern16 {
    public static void main(String[] args) {
        int star=3,space=1,n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if(i==1){
                System.out.print("*");
            }
            if(i>1){
                for(int k=1;k<=space;k++){
                    System.out.print(" ");
                }
            }
            for(int l=1;l<=star;l++){
                System.out.print("*");
            }
            if(i>1){
                star--;
                space+=2;
            }
            System.out.println();
        }
    }
    
}
