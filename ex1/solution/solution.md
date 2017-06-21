# Solution
1. Click `new Item` on the Dashboard
2. Enter the name `build` into the item name field
3. Enter https://github.com/TheFutureStartsNow/jenkinsWorkshop.git to Github Project -> Project URL
4. select `Git` in Source Management and enter `https://github.com/TheFutureStartsNow/jenkinsWorkshop.git` into the 
repository URL
5. Specify a branch for this exercise `ex1` to only check out this branch and not the complete repository
6. Add a build step to invoke Gradle
7. Select `use gradle wrapper` and enter `build` in the `Tasks` field
8. Click `Apply` and `Save`
9. Click on `Build now`
10. Check if everything went fine in the Console Output