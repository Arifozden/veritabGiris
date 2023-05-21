package eksamen.veritabgiris;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MusteriRepository {
    @Autowired
    private JdbcTemplate db;

    public void musteriKayit(Musteri girMusteri){
        String sql="INSERT INTO Musteri (ad,adres) VALUES (?,?)";
        db.update(sql, girMusteri.getAd(),girMusteri.getAdres());
    }

    public List<Musteri> tumMusterileriGetir(){
        String sql="SELECT * FROM Musteri";
        List<Musteri>tumMusteriler=db.query(sql,new BeanPropertyRowMapper(Musteri.class));
        return tumMusteriler;
    }

    public void tumMusterileriSil(){
        String sql="DELETE FROM Musteri";
        db.update(sql);
    }
}
