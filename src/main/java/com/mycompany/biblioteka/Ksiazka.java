/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteka;

/**
 *
 * @author TeKa
 */
public class Ksiazka {
    String nazwa;
    String autor;
    Integer wiekMinimalny;
    String klientImie;
    String klientNazwisko;
    Integer klientWiek;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getWiekMinimalny() {
        return wiekMinimalny;
    }

    public void setWiekMinimalny(Integer wiekMinimalny) {
        this.wiekMinimalny = wiekMinimalny;
    }

    public String getKlientImie() {
        return klientImie;
    }

    public void setKlientImie(String klientImie) {
        this.klientImie = klientImie;
    }

    public String getKlientNazwisko() {
        return klientNazwisko;
    }

    public void setKlientNazwisko(String klientNazwisko) {
        this.klientNazwisko = klientNazwisko;
    }

    public Integer getKlientWiek() {
        return klientWiek;
    }

    public void setKlientWiek(Integer klientWiek) {
        this.klientWiek = klientWiek;
    }
    
    
    @Override
    public String toString() {
        return "Nazwa: " + nazwa + ", autor: " + autor + ", wiek minimalny: " + wiekMinimalny + ".\n Dane klienta: Imie: " + klientImie + ", nazwisko: " + klientNazwisko + ", wiek: " + klientWiek;
    }
}
