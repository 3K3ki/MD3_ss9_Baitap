package Rikkei.academy;

public class NextDay {

    public static String newDay(int day , int month, int year) {
        int newDay=0;
        int newMonth=0;
        int newYear=0;
        if(day == 1){
            newDay = day+1;
            newMonth = month;
            newYear = year;
            return newDay + "/" + newMonth + "/" + newYear;
        }
        if( day == 30 || day== 28 || day== 29 ){
            newDay = 1;
            newMonth = month +1 ;
            newYear = year;
            return newDay + "/" + newMonth + "/" + newYear;
        }
        else if(day == 31 || month == 12){
            newDay = 1;
            newMonth = month;
            newYear = year +1;
            return newDay + "/" + newMonth + "/" + newYear;
        }
        return newDay + "";
    }


}
