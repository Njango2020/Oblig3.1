package oblig.webprog;

public class Kunde {
    private String navn;
    private String etternavn;
    private String epost;
    private String telefonnr;
    private String antall;
    private String film;

    public Kunde(String navn, String etternavn, String epost, String telefonnr, String antall, String film) {
        this.navn = navn;
        this.etternavn = etternavn;
        this.epost = epost;
        this.telefonnr = telefonnr;
        this.antall = antall;
        this.film = film;
    }
    public Kunde(){ }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getAntall() {
        return antall;
    }

    public void setAntall(String antall) {
        this.antall = antall;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }
}
