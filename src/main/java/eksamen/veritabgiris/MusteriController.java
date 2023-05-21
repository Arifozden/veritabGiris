package eksamen.veritabgiris;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MusteriController {
    //veritabanina kayit olacagi icin arrayi siliyoruz
    // private final List<Musteri> tumMusteriler=new ArrayList<>();

    @Autowired
    private MusteriRepository rep;

    @PostMapping("/kayit")
    public void musteriKayit(Musteri girMusteri){
        rep.musteriKayit(girMusteri);
    }

    @GetMapping("/hepsiniGetir")
    public List<Musteri>hepsiniGetir(){
        return rep.tumMusterileriGetir();
    }

    @GetMapping("/hepsiniSil")
    public void hepsiniSil(){
        rep.tumMusterileriSil();
    }
}
