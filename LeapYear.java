public class LeapYear {
    public static void main(String[]args){
        isLeapYear(1601);

    }
    public static boolean isLeapYear(int year){
        if( year>=1 && year<=9999){
            if( (year %400==0)||(year%100 !=0 && year%4==0))
                System.out.println("it's LeapYear");
            else{
                System.out.println("it's not a Leapyear");
            }

        }
        else {
            System.out.println("enter year properly");
            return false;
        }

        return false;
    }
}