Feature: TC002
  Scenario Outline: Kullanıcı favori ürünlerim kısmında listeleme / düzenleme ve silme işlemleri yapabilmeli
    Given kullanici "url" sayfasina properties ile git
    Then kullanici anaSayfaya gittigini dogrula
    When Giris Yap butonuna tikla
    And Açilan menüden Giris Yap secenegine tiklar
    And kullanici kayit bilgilerini girer "<email>","<Password>"
    And Giriş Yap butonuna tiklar
    When Istedigi bir kategori basligina gelir
    And Acilan kategori listesinde istedigi bir kategoriye tiklar
    Then Istedigi kategoride oldugunu dogrular
    And Kullanici sectigi urunu favori listesine ekler
    Then Acilan pencerede istek listesine isim verir
    And Gizlilik ayarlarindan ozel'in secili oldugunu dogrula
    When Ekle butonuna tikla
    And Listenin olusturulamadigini dogrula
    And Sayfayi kapatir
    Examples:
      | email                     | Password   |
      | lynkon.delroy@falkcia.com | Sss230628. |