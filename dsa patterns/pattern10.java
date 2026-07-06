// *********
//  *******
//   *****
//    ***
//     *
//    ***
//   *****
//  *******
// *********
public class pattern10 {
    public static void main(String[] args) {
        int n=9,space=0,star=9;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            if(i<5){
                star-=2;
                space++;
            }
            else{
                star+=2;
                space--;
            }
            System.out.println();
        }
    }
    
}
