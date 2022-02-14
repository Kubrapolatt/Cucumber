
@parametreliTest
Feature: US1003 parametre ile stepdefinition oluşturma

  Scenario: TC05_parametre_kullanımı

    Given kullanıcı amazon sayfasına gider
    And "Nutella" için arama yapar
    Then sonuçların "Nutella" içerdiğini test eder
    And sayfayı kapatır