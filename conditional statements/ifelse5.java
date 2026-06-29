// write a java progarm to check whether the given year is leap year or not
public class ifelse5 {
    public static void main(String[] args) {
        long year=2000;
        if ((year%4==0&&year%100!=0)||year%400==0){
            System.out.println(year+" is leap year");
        }
        else{
            System.out.println(year+" is not leap year");

        }
    }
}
