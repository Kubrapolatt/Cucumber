Feature: US1005 Positve Login Testi

  @hotel
  Scenario: TC08 Positive Login

    Given kullanıcı "HMCUrl" sayfasına gider
    And login linkine tıklar
    Then kullanıcı adı olarak "HMCValidUsername" girer
    And password olarak "HMCValidPassword" girer
    And login butonuna basar
    Then başarılı olarak giriş yapıldığını test eder
    And sayfayı kapatır