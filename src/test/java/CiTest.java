import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CiTest {
    @Test
    public void shouldLoadLibrary() {
        System.loadLibrary("sqlite3");
    }
}
