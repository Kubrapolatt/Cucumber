@hero
Feature: US1010 Herokuapp sayfasında add butonu testi

  Scenario: TC15 Sonradan görünen elemanlar çalışmalı

  Given kullanıcı "HerokuappAddElementUrl" sayfasına gider
  When Add Element butonuna basar
  Then Delete butonu görünceye kadar bekler
  And Delete butonunun göründüğnü test eder
  Then Delete butonuna basarak butonu siler
  And sayfayı kapatır
