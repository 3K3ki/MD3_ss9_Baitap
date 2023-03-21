import Rikkei.academy.nextDay;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
     void nextDay(){
        int day =1 ;
        int month = 1;
        int year = 2001;
        String expected = 2 + "/" + 1 + "/" + 2018;

        String result = nextDay.newDay(day,month,year);
        assertEquals(expected,result);
    }
}
