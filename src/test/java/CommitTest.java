import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CommitTest {

    Commit commit;

    @Before
    public void setUp() {
        commit = new Commit("Initial Commit", "1234567890poiuytrewq");
    }

    @Test
    public void hasDescription() {
        assertEquals("Initial Commit", commit.getDescription());
    }

    @Test
    public void hasUniqueId() {
        assertEquals("1234567890poiuytrewq", commit.getUniqueId());
    }
}
