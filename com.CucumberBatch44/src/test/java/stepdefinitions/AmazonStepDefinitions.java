package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPages=new AmazonPage();

    @Given("kullanıcı amazon sayfasına gider")
    public void kullanıcı_amazon_sayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl"));
    }

    @Given("iPhone için arama yapar")
    public void i_phone_için_arama_yapar() {
        amazonPages.aramaKutusu.sendKeys("iPhone", Keys.ENTER);
    }

    @Then("sonuçların iPhone içerdiğini test eder")
    public void sonuçlarin_ıphone_içerdiğini_test_eder() {
    String sonuçYazısıStr=amazonPages.sonuçYazısıElementi.getText();
        Assert.assertTrue(sonuçYazısıStr.contains("iPhone"));

    }

    @Given("tea pot için arama yapar")
    public void tea_pot_için_arama_yapar() {
        amazonPages.aramaKutusu.sendKeys("tea pot", Keys.ENTER);
    }

    @Then("sonuçların tea pot içerdiğini test eder")
    public void sonuçların_tea_pot_içerdiğini_test_eder() {
        String sonuçYazısıStr=amazonPages.sonuçYazısıElementi.getText();
        Assert.assertTrue(sonuçYazısıStr.contains("tea pot"));
    }

    @Given("flower için arama yapar")
    public void flower_için_arama_yapar() {
        amazonPages.aramaKutusu.sendKeys("flower", Keys.ENTER);
    }

    @Then("sonuçların flower içerdigini test eder")
    public void sonuçların_flower_içerdiğini_test_eder() {
        String sonuçYazısıStr=amazonPages.sonuçYazısıElementi.getText();
        Assert.assertTrue(sonuçYazısıStr.contains("flower"));

    }
    @Given("{string} için arama yapar")
    public void için_arama_yapar(String arananKelime) {
    amazonPages.aramaKutusu.sendKeys(arananKelime,Keys.ENTER);
    }
    @Then("sonuçların {string} içerdiğini test eder")
    public void sonuçların_içerdiğini_test_eder(String arananKelime) {
        String sonuçYazısıStr=amazonPages.sonuçYazısıElementi.getText();
        Assert.assertTrue(sonuçYazısıStr.contains(arananKelime));
    }

    @And("sayfayı kapatır")
    public void sayfayıKapatır() {
        Driver.closeDriver();
    }

    @Given("kullanıcı {string} sayfasına gider")
    public void kullanıcıSayfasınaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
}
