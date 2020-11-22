import java.util.HashMap;

public class GitHubAccount {

    private String name;
    private String username;
    private AccountType accountType;
    private HashMap<String, Repo> repos;

    public GitHubAccount(String name, String username) {
        this.name = name;
        this.username =  username;
        this.accountType = AccountType.FREE;
        this.repos = new HashMap<String, Repo>();
    }

    public String getName() {
        return this.name;
    }

    public String getUsername() {
        return this.username;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public int repoCount() {
        return this.repos.size();
    }

    public void addRepoToAccount(Repo newRepo) {
        this.repos.put(newRepo.getName(), newRepo);
    }

}
