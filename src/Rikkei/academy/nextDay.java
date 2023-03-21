package Rikkei.academy;

public class nextDay {

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
            newYear = 0;
            return newDay + "/" + newMonth + "/" + newYear;
        }
        else if(day == 30 || day == 31){
            newDay = 1;
            newMonth = 0;
            newYear = year +1;
            return newDay + "/" + newMonth + "/" + newYear;
        }
        return newDay + "";
    }


}
