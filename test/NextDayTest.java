import Rikkei.academy.NextDay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayTest {
    @Test
     void nextDay(){
        int day =1 ;
        int month = 1;
        int year = 2001;
        String expected = 2 + "/" + 1 + "/" + 2018;

        String result = NextDay.newDay(day,month,year);
        assertEquals(expected,result);
    }
}
