Feature: US1008 Scenario Outline kullanarak farklı değerlerle negative login testi

  @scenarioOutline
  Scenario Outline: TC13 farklı kullanıcı adı ve şifre

    Given kullanıcı "HMCUrl" sayfasına gider
    And login linkine tıklar
    Then scenario outline'dan kullanıcı adı olarak "<username>" yazar
    And scenario outline'dan şifre olarak  "<password>" yazar
    Then login butonuna basar
    And giriş yapılamadığını test eder


    Examples:
      |username|password|
      |MANAGER |MANAGER1|
      |manager |manager1|
      |MANager |MANager1|
      |Man ager|Man ager1!|