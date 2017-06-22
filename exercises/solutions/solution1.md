# Solution
### Building a freestyle project
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

### Testing a freestyle project
1. Perform the same steps as in `Testing a freestyle project`
2. Enter the task name `test` for the gradle wrapper
3. Within the `Build Triggers` section select `Build after other projects are built` and enter `build`
4. Run the `build` Project again and check in the `console output` if the `test`project was executed as well
