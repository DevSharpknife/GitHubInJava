import java.util.ArrayList;

public class Repo {

    private String name;
    private String description;
    private RepoType repoType;
    private ArrayList<Commit> commits;

    public Repo(String name, String description, RepoType repoType) {
        this.name = name;
        this.description = description;
        this.repoType = repoType;
        this.commits = new ArrayList<Commit>();
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public RepoType getRepoType() {
        return this.repoType;
    }

    public int commitCount() {
        return this.commits.size();
    }

    public void addCommit(Commit newCommit) {
        this.commits.add(newCommit);
    }

    public Commit getCommitById(String searchId) {
        for (Commit commit : commits) {
            if (commit.getUniqueId().equals(searchId)) {
                return commit;
            }
        }
        return null;
    }
}
