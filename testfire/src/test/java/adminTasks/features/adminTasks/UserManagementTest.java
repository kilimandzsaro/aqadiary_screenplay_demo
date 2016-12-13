package adminTasks.features.adminTasks;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/adminTasks/UserManagement.feature")
public class UserManagementTest {

}
