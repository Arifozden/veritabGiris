$(function(){  // sayfa acilinca yuklenir
    hepsiniGetir();
});

function musteriKayit() {
    const musteri = {
        ad : $("#ad").val(),
        adres : $("#adres").val()
    };
    const url = "/kayit";
    $.post(url, musteri, function(sonuc){
        hepsiniGetir();
    });
    $("#ad").val(""); //tøm input-feltene
    $("#adres").val("");
};

function hepsiniGetir() {
    $.get( "/hepsiniGetir", function( data ) {
        bilgiDuzenle(data);
    });
};

function bilgiDuzenle(musteriler){
    var yaz = "<table class='table table-striped'>" +
        "<tr>" +
        "<th>Ad</th><th>Adres</th>" +
        "</tr>";
    for(const musteri of musteriler ){
        yaz+="<tr><td>"+musteri.ad+"</td><td>"+musteri.adres+"</td></tr>"
    }
    $("#musteriler").html(yaz);
}

function hepsiniSil() {
    $.get( "/hepsiniSil", function( data ) {
        hepsiniGetir();
    });
};