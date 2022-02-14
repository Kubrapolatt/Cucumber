package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ReusableMethods;

public class HerokuappStepDefinitions {

    HerokuappPage herokuappPage=new HerokuappPage();

    @When("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
     herokuappPage.addElementButonu.click();
    }
    @Then("Delete butonu görünceye kadar bekler")
    public void delete_butonu_görünceye_kadar_bekler() {
        ReusableMethods.waitForVisibility(herokuappPage.deleteButonu,20);
    }
    @Then("Delete butonunun göründüğnü test eder")
    public void delete_butonunun_göründüğnü_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButonu.isDisplayed());

    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
    herokuappPage.deleteButonu.click();
    }

}
