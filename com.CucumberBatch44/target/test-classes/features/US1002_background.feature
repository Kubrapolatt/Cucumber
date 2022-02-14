Feature: US1002 Background ile amazon search testi

  Background: amazon sayfasına gidiş
  Given kullanıcı amazon sayfasına gider
    #diyez ile yorum yazabiliriz


  Scenario: TC02_Amazon iPhone Search Testi
    And iPhone için arama yapar
    Then sonuçların iPhone içerdiğini test eder

  Scenario: TC03_Amazon tea pot Search Testi
    And tea pot için arama yapar
    Then sonuçların tea pot içerdiğini test eder


  Scenario: TC04_Amazon flower Search Testi
    And flower için arama yapar
    Then sonuçların flower içerdigini test eder