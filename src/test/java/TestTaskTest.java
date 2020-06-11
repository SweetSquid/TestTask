import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTaskTest {

    @Test
    public void testAllSequences() {
        assertEquals("2", TestTask.resolveIssue(2));
        assertEquals("5-6", TestTask.resolveIssue(56));
        assertEquals("2,4", TestTask.resolveIssue(24));
        assertEquals("1-3", TestTask.resolveIssue(123));
        assertEquals("1,3,5", TestTask.resolveIssue(135));
        assertEquals("1-2,5", TestTask.resolveIssue(125));
        assertEquals("1-3,6-7", TestTask.resolveIssue(12367));
        assertEquals("1,3-7", TestTask.resolveIssue(134567));
    }
}
