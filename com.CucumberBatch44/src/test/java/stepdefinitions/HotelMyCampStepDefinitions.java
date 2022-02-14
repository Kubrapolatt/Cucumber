package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HotelMyCampStepDefinitions {

    HMCPage hmcPage=new HMCPage();

    @Given("login linkine tıklar")
    public void login_linkine_tıklar() {
    hmcPage.mainPageLoginLink.click();

    }
    @Then("kullanıcı adı olarak {string} girer")
    public void kullanıcı_adı_olarak_girer(String kullanıcıTipi) {
    hmcPage.userNameTextBox.sendKeys(ConfigReader.getProperty(kullanıcıTipi));

    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String passwordTürü) {
    hmcPage.passwordTextBox.sendKeys(ConfigReader.getProperty(passwordTürü));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
    hmcPage.loginButonu.click();
    }
    @Then("başarılı olarak giriş yapıldığını test eder")
    public void başarılı_olarak_giriş_yapıldığını_test_eder() {
        Assert.assertTrue(hmcPage.başarılıGirişYazısıElementi.isDisplayed());
    }

    @And("giriş yapılamadığını test eder")
    public void girişYapılamadığınıTestEder() {
        Assert.assertTrue(hmcPage.girişYapılamadıYazısıElementi.isDisplayed());
    }


    @Then("scenario outline'dan kullanıcı adı olarak {string} yazar")
    public void scenarioOutlineDanKullanıcıAdıOlarakYazar(String username) {
        hmcPage.userNameTextBox.sendKeys(username);
    }

    @And("scenario outline'dan şifre olarak  {string} yazar")
    public void scenarioOutlineDanŞifreOlarakYazar(String password) {
        hmcPage.passwordTextBox.sendKeys(password);
    }
}
