import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepoTest {

    Repo repo;
    Commit commit1;
    Commit commit2;
    Commit commit3;

    @Before
    public void setUp() {
        repo = new Repo("Charles Dozsa", "A Succulent Chinese Meal", RepoType.PUBLIC);
        commit1 = new Commit("Initial Commit", "1234567890poiuytrewq");
        commit2 = new Commit("Additional Commit", "0987654321qwertyuiop");
        commit3 = new Commit("Final Commit", "asdfghjklm0192837465");
    }

    @Test
    public void hasName() {
        assertEquals("Charles Dozsa", repo.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("A Succulent Chinese Meal", repo.getDescription());
    }

    @Test
    public void hasRepoType() {
        assertEquals(RepoType.PUBLIC, repo.getRepoType());
    }

    @Test
    public void commitListStartsEmpty() {
        assertEquals(0, repo.commitCount());
    }

    @Test
    public void canAddCommit() {
        repo.addCommit(commit1);
        assertEquals(1, repo.commitCount());
    }

    @Test
    public void canGetCommitById() {
        repo.addCommit(commit2);
        repo.getCommitById()
        assertEquals();
    }
}
