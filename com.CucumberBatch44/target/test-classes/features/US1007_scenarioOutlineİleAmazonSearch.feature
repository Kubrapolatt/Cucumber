Feature: US1007 Scenario Outline ile Amazon Search

  Scenario Outline: TC12 amazonda bir listedeki tüm elementleri arama

    Given kullanıcı "AmazonUrl" sayfasına gider
    Then "<aranacakEleman>" için arama yapar
    And sonuçların "<aranacakEleman>" içerdiğini test eder
    Then sayfayı kapatır


    Examples:
    |aranacakEleman|
       |Apple|
      |Java|
      |Samsung|
      |nutella|
     |armut|