import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
    @Test
    public static void testGetClassNumber() {
        int result = Main.getClassNumber();
        Assertions.assertTrue(result > 45, "class_number < 45");
    }
}
