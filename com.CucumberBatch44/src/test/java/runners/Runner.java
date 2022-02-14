package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //Bu class'ın cucumber ile beraber çalışmasını sağlıyor.


@CucumberOptions(
        plugin={"html:target\\cucumber-reports.html"},
        features ="src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@Webuni",
        dryRun =false
)

public class Runner {
    //Runner class'ının body'sine hiçbir kod yazmıyoruz
    //Bu class için önemli olan kullanacağımız 2 adet notasyon

    //dryRun = false yazıldığında belirlenen tag'la etiketlenen
    //tüm senaryoları sırasıyla çalıştırır.

    //dryRun = true yazıldığında kodları hiç çalıştırmadan eksik stepler olup olmadığını
    //kontrol eder ve varsa bize eksik stepleri rapor eder.

    // features ve glue olarak spesifik bir class veya feature dosyasini degil
    // tum klasor ve package'i sectik
    // dolayisiyla stepdefinitions package'i icerisinde hangi class'da olursa olsun
    // isimize yarayan bir stepdefition varsa rahatlikla kullanabiliriz


}
