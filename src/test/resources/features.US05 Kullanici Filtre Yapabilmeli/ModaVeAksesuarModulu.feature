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

  Scenario Outline: TC02 | Moda/Aksesuar modülu gorulebilmeli ve Markalar filtresi uygulanabilmeli ve silinebilmeli.
    Then "<Marka Filtereleri>" filtre secilir.
    When Filtrenin "<Marka Filtereleri>" oldugu dogrulanir.
    Then Marka Filtereleri sonucu cikan urun listesi dogrulanir.
    Then Secilen filtre temzilenir.
    Then  "<Marka Filtereleri>" marka filtresinin temizlendigi dogrulanir.
    And Web sayfasi kapatilir.
    Examples:
      | Marka Filtereleri |
      | Eklips            |
      | Penti             |
      | Marie Claire      |
      | Aqua di Polo      |
      | Ritüel Box        |
      | Peddon            |
      | Pierre Keys       |
      | Nascita           |
      | Gratis            |
      | Getwell           |
      | Nearsis           |
      | Pink Ginger       |