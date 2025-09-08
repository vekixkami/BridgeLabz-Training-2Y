import java.util.Scanner;

public class CalendarDisplay{

    public static String getMonthName(int month){
        String[] months={
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
        };
        return months[month-1];
    }

    public static boolean isLeapYear(int year){
        if(year%400==0){
            return true;
        }else if(year%100==0){
            return false;
        }else if(year%4==0){
            return true;
        }else{
            return false;
        }
    }

    public static int getNumberOfDays(int month,int year){
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2 && isLeapYear(year)){
            return 29;
        }else{
            return days[month-1];
        }
    }

    public static int getFirstDay(int day,int month,int year){
        int y0=year-(14-month)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=month+12*((14-month)/12)-2;
        int d0=(day+x+(31*m0)/12)%7;
        return d0;
    }

    public static void displayCalendar(int month,int year){
        System.out.println("     "+getMonthName(month)+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay=getFirstDay(1,month,year);
        int numberOfDays=getNumberOfDays(month,year);

        for(int i=0;i<firstDay;i++){
            System.out.print("    ");
        }
        for(int day=1;day<=numberOfDays;day++){
            System.out.printf("%3d ",day);
            if(((day+firstDay)%7==0)||day==numberOfDays){
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month=sc.nextInt();
        System.out.print("Enter year: ");
        int year=sc.nextInt();

        displayCalendar(month,year);
    }
}
