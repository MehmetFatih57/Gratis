Feature: TC001
  Scenario: Kullanıcı herhangi bir kategoride seçeceği bir üründe maximum sayi da alisveris yapabilmeli
    Given kullanici "url" sayfasina properties ile git
    Then kullanici anaSayfaya gittigini dogrula
    When Istedigi bir kategori basligina gelir
    And kullanici 2 saniye bekle
    When Acilan kategori listesinde istedigi bir kategoriye tiklar
    Then Istedigi kategoride oldugunu dogrular
    When Kullanici bulundugu kategoriden bir urun secer
    And kullanici 2 saniye bekle
    Then Sectigi urunun bilgilerininin gorunurlugunu dogrular
    And Kullanici bir urunden maximum sayiya ulasana kadar sepete ekler
    Then Kullanici maximum sayida urun ekledigini dogrular
    And kullanici 2 saniye bekle
    And Sayfayi kapatir