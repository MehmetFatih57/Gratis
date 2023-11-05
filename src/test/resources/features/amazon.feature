Feature: US01_Amazon_Task
  @Amazon_US_01
  Scenario: TC01_Amazon_Urun_Arama_Sepete_Ekleme

    Given Kullanici Amazon anasayfasina gider
    When Giris yap sekmesine tiklar
    Then Gecerli kullanici adini girer
    Then Devam et butonuna tiklar
    Then Gecerli password bilgisini girer
    Then Giris yap butonuna tiklar
    Then Kullanici arama kutusuna herhangi bir gecerli veri girisi yapar
    Then Kullanici arama sonuclarini fiyati dusukten yuksege siralar
    Then Kullanici fiyati en dusuk olan urune tiklar
    Then Kullanici urunu sepete ekler
    Then Kullanici urunun sepete eklendigini dogrular








