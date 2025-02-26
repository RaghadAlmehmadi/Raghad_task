 1. Introduction
Version control is crucial for collaborative software development, allowing teams to track changes and manage code efficiently. GitHub provides tools to handle modifications across different branches, but conflicts can arise when multiple contributors edit the same part of a file. Merge conflicts occur when Git cannot automatically integrate changes due to overlapping modifications, requiring manual resolution. This report outlines how a conflict in `OrderManager.java` was introduced and resolved effectively.

 2. Project Architecture
- GitHub Repository: Stores project files, including `OrderManager.java`.
- Branching Strategy: Feature branches allow isolated development before merging into `main`.
- Development Workflow:
  - `main` branch: Stable code.
  - `feature-branch`: Used for updates before merging.
- IDE Used: Intellij IDEA for Git operations.

 3. GitHub Conflict Resolution Process
Step 1: Repository Setup and Branching
A repository was created on GitHub, and a feature branch was set up to make changes without affecting the main branch.

Step 2: Simulating a Merge Conflict
A merge conflict was introduced by modifying `OrderManager.java` in both the main and feature branches. Since both changes affected the same section of the file, Git could not automatically merge them.

Step 3: Resolving the Merge Conflic
The conflict was manually resolved by reviewing both versions, keeping necessary modifications, and removing conflict markers. The final version was committed to ensure a clean merge.

5. Conclusion
This project reinforced GitHub best practices, including branching strategies and conflict resolution, ensuring efficient team collaboration.

