/* cucumber is for behavior driven framework
 * understanding of BDD - behavior driven developement
 * Framework
 * Integration of existing project
 * 
 * Approach for agile projects
 * Business requirement are in form of test case - dev, tester uses the same for their tasks
 * same document is used. So all will be in syn(BA, business, developes, testers)
 * standard template used by BA common for all members of prject
 * 
 * proper template - termnology - all devopement happen with behavior, pattern
 * 
 * Syntax of template of BRD
 * In order to(Achive something) --> Business outcome
 * As a role
 * I want to do these tasks
 * 
 * many scernarios for testers
 * 
 * template of test cases
 * Feature
 * Scenario
 * Given(what you need to have to perform action) -> pre requisites
 * When - what you are doing - steps of the task
 * Then - result
 * 
 * 
 * Advantages of BDD
 * standard template for forming the test cases
 * Each scenario reflect business value
 * Estimate test coverage on business scenarios
 * all are in sync because of single document
 * tag annotation to selenium, and then you will have the failed feature file
 * same test case file for manual and automation
 * 
 * Install natural plugin through eclipse market place
 * cucumber skeleton using maven
 * Add maven dependenvy for cucumber jars
 * 
 * 
 * Cucumber framework terminologies
 * Feature file - scenario, given, when, then
 * Step definition file as per scenario - implementation aautomation code
 * glue it to the feature file
 * Test runner - path of feature file, step file, junit test runner
 * Gherkin plugin
 * Stepdefination file generation
 * Test runner @RunWith(Cucumber.class)
 * @CucumberOptions(features="//abc/def/features//login.feature", glue="stepDefinations")
 * 
 * 
 * 
 */
public class cucumberTest {

}
