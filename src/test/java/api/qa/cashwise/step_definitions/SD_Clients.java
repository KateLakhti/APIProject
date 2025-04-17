package api.qa.cashwise.step_definitions;

import api.qa.cashwise.endpoints.EP_Clients;
import io.cucumber.java.en.Then;

public class SD_Clients {

    EP_Clients epClients = new EP_Clients();

    @Then("User validates {string},{string}, {string}, and {string} from end-point")
    public void user_validates_and_from_end_point(String expectedCompanyName, String nameTag, String tagCompanyName, String expectedEmail) {
        epClients.validateCreateClientsData(expectedCompanyName, nameTag, tagCompanyName, expectedEmail);
    }

    @Then("User validates {string},{string}, {string}, and {string} from end-point Get")
    public void user_validates_and_from_end_point_get(String expectedCompanyName, String nameTag, String tagCompanyName, String expectedEmail) {
        epClients.validateGetClientInformation(expectedCompanyName, nameTag, tagCompanyName, expectedEmail);
    }

    @Then("User validates {string},{string}, {string}, and {string} from end-point Put")
    public void user_validates_and_from_end_point_put(String expectedCompanyName, String nameTag, String tagCompanyName, String expectedEmail) {
        epClients.validateUpdateClientsData(expectedCompanyName, nameTag, tagCompanyName, expectedEmail);
    }
    @Then("User validates {string},{string}, {string}, and {string} Delete")
    public void user_validates_and_delete(String expectedCompanyName, String nameTag, String tagCompanyName, String expectedEmail) {
        epClients.validateDeleteClient(expectedCompanyName, nameTag, tagCompanyName, expectedEmail);
    }

    @Then("User validates {string} and {string} grom end point Get")
    public void user_validates_and_grom_end_point_get(String message, String details) {
        epClients.validateGetClientInformationAfterDeletion(message, details);
    }
}