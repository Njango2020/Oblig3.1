package oblig.webprog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class KundeController {

    @Autowired
    private KundeRepository rep;

    @PostMapping("/lagre")
    public void lagre(Kunde billett){
        rep.lagreBillett(billett);
    }

    @GetMapping("/hentAlle")
    public List<Kunde> hentAlle(){
        return rep.hentAlleBilletter();
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        rep.slettAlleBilletter();
    }
}
