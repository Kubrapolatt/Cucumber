Feature: US1006 Neagtive Login Testi

  Scenario: TC09 yanlış username,doğru şifre ile giriş yapılamaz.
    Given kullanıcı "HMCUrl" sayfasına gider
    And login linkine tıklar
    Then kullanıcı adı olarak "HMCWrongUsername" girer
    And password olarak "HMCValidPassword" girer
    Then login butonuna basar
    And giriş yapılamadığını test eder
    Then sayfayı kapatır

  Scenario: TC10 doğru username,yanlış password ile giriş yapılamaz
    Given kullanıcı "HMCUrl" sayfasına gider
    And login linkine tıklar
    Then kullanıcı adı olarak "HMCValidUsername" girer
    And password olarak "HMCWrongPassword" girer
    Then login butonuna basar
    And giriş yapılamadığını test eder
    Then sayfayı kapatır

  Scenario: TC11 yanlış username,yanlış şifre ile giriş yapılamaz
    Given kullanıcı "HMCUrl" sayfasına gider
    And login linkine tıklar
    Then kullanıcı adı olarak "HMCWrongUsername" girer
    And password olarak "HMCWrongPassword" girer
    Then login butonuna basar
    And giriş yapılamadığını test eder
    Then sayfayı kapatır
