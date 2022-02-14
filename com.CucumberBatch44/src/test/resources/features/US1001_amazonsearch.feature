Feature: US1001_amazon_search

  @amazon
  Scenario: TC01_Amazon Search Testi

    Given kullanıcı amazon sayfasına gider
    And iPhone için arama yapar
    Then sonuçların iPhone içerdiğini test eder

    Given kullanıcı amazon sayfasına gider
    And tea pot için arama yapar
    Then sonuçların tea pot içerdiğini test eder

    Given kullanıcı amazon sayfasına gider
    And flower için arama yapar
    Then sonuçların flower içerdigini test eder