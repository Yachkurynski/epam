package calendar.dateFormats;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.TimeZone;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class ZZTimeOffsetTest {
  Calendar calendar;
  String rightFormat;
  String wrongFormat;
  ZZTimeOffset offset;

  @Before
  public void setUp() throws Exception {
    calendar = Calendar.getInstance();
    calendar.setTimeZone(TimeZone.getTimeZone("Europe/Minsk"));
    rightFormat = "zz";
    wrongFormat = "aa";
    offset = new ZZTimeOffset();
  }

  @Test
  public void testPositiveGetFormatedDate() throws Exception {
    String actual = offset.getFormatedDate(rightFormat, calendar);
    assertEquals("03", actual);
  }

  @Test
  public void testNegativeGetFormatedDate() throws Exception {
    String actual = offset.getFormatedDate(wrongFormat, calendar);
    assertEquals(wrongFormat, actual);
  }
}