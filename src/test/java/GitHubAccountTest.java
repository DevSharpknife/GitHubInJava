import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GitHubAccountTest {

    GitHubAccount account1;
    Repo repo1;
    Repo repo2;

    @Before
    public void setUp() {
        account1 = new GitHubAccount("Dave", "DevSharpknife");
        repo1 = new Repo("GitHub Project", "Recreate rudimentary GitHub using Java", RepoType.PUBLIC);
    }

    @Test
    public void canGetName() {
        assertEquals("Dave", account1.getName());
    }

    @Test
    public void canGetUsername() {
        assertEquals("DevSharpknife", account1.getUsername());
    }

    @Test
    public void accountTypeStartsFree() {
        assertEquals(AccountType.FREE, account1.getAccountType());
    }

    @Test
    public void reposListStartsEmpty() {
        assertEquals(0, account1.repoCount());
    }

    @Test
    public void canAddRepoToAccount() {
        account1.addRepoToAccount(repo1);
        assertEquals(1, account1.repoCount());
    }

    @Test
    public void canGetRepoByName() {
        account1.addRepoToAccount(repo2);
        assertEquals(repo2, );
    }
}
