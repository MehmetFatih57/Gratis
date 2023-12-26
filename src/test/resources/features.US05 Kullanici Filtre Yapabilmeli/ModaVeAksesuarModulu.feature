@Tag
Feature: US_05: Kullanıcı Moda/Aksesuar modülünde herhangi  bir üründe filtreleme yapabilmeli.

  Background:
    Given Web sayfasina gidilir.
    When  Anasayfanin gorunurlugu dogrulanir.
    Then  Kullanici "email" "sifre" ile giris yapar.
    Then  Moda ve Aksesuar modulu acilir.
    When  Moda ve Aksesuar sayfasinin gorunurlugu dogrulanir.


  Scenario Outline: TC01 | Moda/Aksesuar modülu gorulebilmeli ve Alt kategoriler filtresi uygulanabilmeli ve silinebilmeli.
    Then "<Alt Kategori Filtreleri>" filtre secilir.
    When Filtrenin "<Alt Kategori Filtreleri>" oldugu dogrulanir.
    Then Filtre sonucu cikan urun listesi dogrulanir.
    Then Secilen filtre temzilenir.
    Then "<Alt Kategori Filtreleri>" kategori filtresinin temizlendigi dogrulanir.
    And Web sayfasi kapatilir.
    Examples:
      | Alt Kategori Filtreleri |
      | Bijuteri & Takılar      |
      | Toka                    |
      | Çanta                   |
      | Çorap                   |
      | Şemsiye                 |
      | Aksesuar                |
