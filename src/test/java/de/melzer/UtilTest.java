package de.melzer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Tizian Melzer on 15.05.2018.
 */
public class UtilTest {
    @Test
    public void testIstErstesHalbjahr(){
        final int eingabe = 7;
        final boolean sollwert = true;
        assertTrue(Util.istErstesHalbjahr(eingabe));
    }
}
