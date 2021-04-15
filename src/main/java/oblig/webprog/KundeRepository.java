package oblig.webprog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KundeRepository {
    @Autowired
    private JdbcTemplate db;

    public void lagreBillett(Kunde kunde){
        String sql= "INSERT INTO Kunde(navn, etternavn, epost, telefonnr, antall, film) VALUES(?,?,?,?,?,?)";
        db.update(sql,kunde.getNavn(),kunde.getEtternavn(),kunde.getEpost(),kunde.getTelefonnr(),kunde.getAntall(),kunde.getFilm());
    }
    public List<Kunde> hentAlleBilletter(){
        String sql = "SELECT * FROM Kunde ORDER BY etternavn ASC ";
        List<Kunde> allekunder= db.query(sql, new BeanPropertyRowMapper<>(Kunde.class));
        return allekunder;
    }
    public void slettAlleBilletter(){
        String sql= "DELETE FROM Kunde";
        db.update(sql);
    }
}
