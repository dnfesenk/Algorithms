You would like to restore some previously stashed work to a new branch. How can you do that?

- [ ] Add the stashed commits to the current commit, then create a new branch.
- [ ] Use git branch <stash hash>.
- [ ] Use git checkout -b.
- [x] Run git stash branch <branch name>.

---

You have changed your mind about adding broccoli to your project. How should you remove it?

```
Untracked files:
  (use "git add <file>..." to include in what will be committed)
  broccoli
```

- [ ] git remove .
- [ ] git remove broccoli
- [ ] git clean
- [x] git clean -f

---

What is the difference between using the git stash and git stash pop commands?

- [ ] git stash saves changes to multiple branches, while git stash pop removes a commit from the repo history.
- [ ] git stash removes a commit from the repo history, while git stash pop saves changes to multiple branches.
- [ ] git stash removes the most recent commit, while git stash pop saves current changes.
- [x] git stash creates a stash entry, while git stash pop places a saved state from the stash list onto the working directory.

---

How can you display a list of files added or modified in a specific commit?

- [ ] Run git commit --info with the commit hash.
- [ ] Access the commit stash data with git stash.
- [x] Use the diff-tree command with the commit hash.
- [ ] Find the commit in the remote repository, as that's the only place where that kind of information is stored.

---

You find that your project has a tag and branch both named pushnotifications, which causes confusion when trying to print out a given reference. How can you specify which branch you want to look at?

- [ ] Use git show refs/head/push-notifications.
- [ ] Use git show refs/push-notifications.
- [ ] Use git show push-notifications.
- [x] Use git show head/refs/push-notifications.

---

Your team lead needs a list of all commits that will be moved before you perform a rebase. Which command can you use to access that information? Choose

- [x] git rebase -i
- [ ] git rebase -all
- [ ] git rebase -verbose
- [ ] git rebase -log

---

Which statement is true of the git push command?

- [x] By default, a push doesn't send tags to the remote repository.
- [ ] Tags are pushed to the remote repository with their respective commits.
- [ ] Commits can be tagged only when they are created.
- [ ] Only annotated tags are automatically pushed to the remote repository with a commit.

---

What command creates a new branch from the currently checked-out branch?

- [ ] git -b checkout <nameOfBranch>
- [ ] git branch
- [x] git checkout -b <nameOfBranch>
- [ ] git checkout <nameOfBranch>

---

What commands would you use to force an overwrite of your local files with the master branch?

- [ ] git pull -u origin master | git reset --hard master
- [ ] git pull origin master | git reset --hard origin/myCurrentBranch
- [x] git fetch --all | git reset --hard origin/master
- [ ] git pull --all | git reset --hard origin/master

---

How does Git internally manage branches?

- [x] by creating a pointer to the most recent snapshot/commit for the branch
- [ ] by creating a data dictionary of code changes
- [ ] by creating a data array of branches in the same repository
- [ ] by creating a debug log that stores repository changes

---

How would you create a custom shortcut or command across your Git environment?

- [ ] Use the git custom-key command.
- [ ] Run git hotfix with the shortcut name.
- [x] Create an alias using the git config command.
- [ ] Assign a shortcut or command using git options file.

---

You stashed three sets of changes but cannot remember the contents of the first stash entry. What command would you use to see the details of the changes in the first of the three stash entries?

- [ ] git stash show -p
- [x] git stash show -p stash@{2}
- [ ] git stash show -p stash@{1}
- [ ] git stash list

---

After starting to merge a feature branch into your master branch, you encounter a merge conflict and decide you do not want to perform the merge. How can you stop the merge and restore to the pre-merge state?

- [ ] Use git merge --undo.
- [x] Use git merge --abort.
- [ ] Use git restore -p.
- [ ] Use git merge -u.

---

After modifying some existing files in a repository, you decide to discard the changes. What command can you use?

- [ ] git clean
- [ ] git checkout .
- [x] git restore
- [ ] git undo

---

What is the difference between git branch -d and git branch -D?

- [ ] -D deletes the current commit head, while -d deletes the entire branch.
- [ ] -D deletes the local branch, while -d deletes the branch regardless of push and merge status.
- [ ] -d deletes the current commit head, while -D deletes the entire branch.
- [x] -d deletes the local branch, while -D deletes the local branch regardless of push and merge status.
