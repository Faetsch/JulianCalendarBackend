package book.jakarta8.julian;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple Julian
 */
public class AppTest 
{

    @Test
    public void julianConvertTest()
    {
        Julian j = new Julian();
        String s = j.convert("2000-01-01-12-00-00");
        assertEquals(s, "2451545.0");
    }
}
