package eksamen.veritabgiris;

public class Musteri {
    private String ad;
    private String adres;

    public Musteri(String ad, String adres) {
        this.ad = ad;
        this.adres = adres;
    }

    public Musteri(){}

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
