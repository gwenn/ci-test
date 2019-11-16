import org.junit.Test;

public class CiTest {
    @Test
    public void shouldLoadLibrary() {
        System.out.print("PATH=");
        System.out.println(System.getenv("PATH"));
        System.out.print("LD_LIBRARY_PATH=");
        System.out.println(System.getenv("LD_LIBRARY_PATH"));
        System.out.print("java.library.path=");
        System.out.println(System.getProperty("java.library.path"));
        System.loadLibrary("sqlite3");
    }
}
