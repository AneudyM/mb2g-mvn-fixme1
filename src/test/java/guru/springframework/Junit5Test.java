package guru.springframework;

import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Created by jt on 2018-12-15.
 */
public class Junit5Test {

    @Test
    void someFauxTest() {
        assertEquals("foo", "foo");
    }
}
