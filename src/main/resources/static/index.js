/*
function validerOglagreBestilling(){
    const navnOk = validerNavn($("#navn").val());
    const etternavnOk = validerEtterNavn($("#etternavn").val());
    const epostOk = validerEpost($("#epost").val());
    const telefonnrOk = validerTlf($("#telefonnr").val());
    const antallOk = validerAntall($("#antall").val());
    const filmOk = validerFilm($("#film").val());

    if (navnOk && etternavnOk && epostOk && telefonnrOk && antallOk && filmOk){
        bestilling();
    }


}

 */

function bestilling() {

    if ($("#navn").val().length < 1) {
        $("#error").html("" +
            "")


    } else if ($("#etternavn").val().length < 1) {
        $("#error2").html("")
    } else if ($("#epost").val().length < 1) {
        $("#error4").html("")
    } else if ($("#telefonnr").val().length < 1) {
        $("#error3").html("")
    } else if ($("#antall").val().length < 1) {
        $("#error1").html("")
    } else if ($("#film").val() == "" || $("#film").val() == "Velg Film") {
        $("#error5").html("Navn må fylles inn")
    } else {

        const kunde = {
            navn: $("#navn").val(),
            etternavn: $("#etternavn").val(),
            telefonnr: $("#telefonnr").val(),
            epost: $("#epost").val(),
            film: $("#film").val(),
            antall: $("#antall").val()

        };
        $.post("/lagre", kunde, function () {
            hentAlle()
        });


        // slette input
        $("#film").val("");
        $("#etternavn").val("");
        $("#telefonnr").val("");
        $("#navn").val("");
        $("#epost").val("");
        $("#antall").val("");
    }
}
    function hentAlle(){
        $.get("/hentAlle", function (billetter){
            formaterData(billetter)
        })
    }
    function formaterData(billetter){
        let ut = "<table class='table'><tr class='bg-light' style='color: black'><th>Film</th><th>Antall</th><th>Navn</th><th>Etternavn</th><th>Telefonnr</th><th>Epost</th></tr>";
        for (const kunde of billetter){
            ut += "<tr><td>" + kunde.film + "</td><td>" + kunde.antall + "</td><td>" + kunde.navn + "</td><td>" + kunde.etternavn +
                "</td><td>" + kunde.telefonnr + "</td><td>" + kunde.epost + "</td></tr>";
        }
        ut+="</table>"
        $("#resultat").html(ut);

    }
    function slettAlle(){
     $.get("/slettAlle", function (){
         hentAlle();
     });
    }