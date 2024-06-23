/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteka;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TeKa
 */
public class Biblioteka {

    private static List<Ksiazka> ksiazki = new ArrayList<>();
    private static List<GraPlanszowa> gryPlanszowe = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu: (napisz 1, 2, 3, 4 lub 5): \n1. Dodanie nowego wypożyczenia \n2. Wyświetlenie listy wypożyczeń. \n3. Wygenerowanie raportu. \n4. Zapis do pliku. \n5. Zakończenie programu. \nWybierz:");
        Boolean koniec = false;
        while (!koniec) {
            Integer outputWybor = scanner.nextInt();
            scanner.nextLine();
            switch (outputWybor) {
                case 1:
                    System.out.println("Chcesz dodać wypożyczenie książki (1) czy gry planszowej (2)?");
                    Integer outputWyborKsiazkaGra = scanner.nextInt();
                    scanner.nextLine();
                    if (outputWyborKsiazkaGra == 1) {
                        Scanner scannerDaneKsiazka = new Scanner(System.in);

                        System.out.println("Podaj nazwę książki:");
                        String nazwaKsiazka = scannerDaneKsiazka.nextLine();
                        System.out.println("Podaj autora:");
                        String autorKsiazka = scannerDaneKsiazka.nextLine();
                        System.out.println("Podaj wiek minimalny:");
                        String wiekMinKsiazka2 = scannerDaneKsiazka.nextLine();
                        Integer wiekMinKsiazka = Integer.valueOf(wiekMinKsiazka2);
                        System.out.println("Podaj imie klienta:");
                        String klientImieKsiazka = scannerDaneKsiazka.nextLine();
                        System.out.println("Podaj nazwisko klienta:");
                        String klientNazwiskoKsiazka = scannerDaneKsiazka.nextLine();
                        System.out.println("Podaj wiek klienta:");
                        String klientWiekKsiazka2 = scannerDaneKsiazka.nextLine();
                        Integer klientWiekKsiazka = Integer.valueOf(klientWiekKsiazka2);

                        Ksiazka ksiazka = new Ksiazka();

                        if (wiekMinKsiazka > klientWiekKsiazka) {
                            System.out.println("Uwaga! Minimalny wiek jest większy niż wiek klienta. Kontynuować? (tak / nie)");

                            String czyKontynuowac = scanner.nextLine();
                            if (czyKontynuowac.equals("nie")) {
                                System.out.println("Anulowano wypozyczenie. Powrót do menu. Co chcesz teraz zrobić:");
                                continue;
                            }
                        }

                        ksiazka.setNazwa(nazwaKsiazka);
                        ksiazka.setAutor(autorKsiazka);
                        ksiazka.setWiekMinimalny(wiekMinKsiazka);
                        ksiazka.setKlientImie(klientImieKsiazka);
                        ksiazka.setKlientNazwisko(klientNazwiskoKsiazka);
                        ksiazka.setKlientWiek(klientWiekKsiazka);

                        ksiazki.add(ksiazka);

                        System.out.println(ksiazka);
                        System.out.println("Zapisano wypożyczenie. Powrót do menu. Co chcesz teraz zrobić:");
                    } else if (outputWyborKsiazkaGra == 2) {
                        Scanner scannerDaneGraPlanszowa = new Scanner(System.in);

                        System.out.println("Podaj nazwę gry planszowej:");
                        String nazwaGraPlanszowa = scannerDaneGraPlanszowa.nextLine();
                        System.out.println("Podaj wiek minimalny:");
                        String wiekMinGraPlanszowa2 = scannerDaneGraPlanszowa.nextLine();
                        Integer wiekMinGraPlanszowa = Integer.valueOf(wiekMinGraPlanszowa2);
                        System.out.println("Podaj wiek maksymalny:");
                        String wiekMaxGraPlanszowa2 = scannerDaneGraPlanszowa.nextLine();
                        Integer wiekMaxGraPlanszowa = Integer.valueOf(wiekMaxGraPlanszowa2);
                        System.out.println("Podaj imie klienta:");
                        String klientImieGraPlanszowa = scannerDaneGraPlanszowa.nextLine();
                        System.out.println("Podaj nazwisko klienta:");
                        String klientNazwiskoGraPlanszowa = scannerDaneGraPlanszowa.nextLine();
                        System.out.println("Podaj wiek klienta:");
                        String klientWiekKsiazka2 = scannerDaneGraPlanszowa.nextLine();
                        Integer klientWiekGraPlanszowa = Integer.valueOf(klientWiekKsiazka2);

                        GraPlanszowa graPlanszowa = new GraPlanszowa();
                        String czyKontynuowac = "";
                        if (wiekMinGraPlanszowa > klientWiekGraPlanszowa) {
                            System.out.println("Uwaga! Minimalny wiek jest większy niż wiek klienta. Kontynuować? (tak / nie)");
                            czyKontynuowac = scanner.nextLine();
                        }
                        if (wiekMaxGraPlanszowa < klientWiekGraPlanszowa) {
                            System.out.println("Uwaga! Maksymalny wiek jest mniejszy niż wiek klienta. Kontynuować? (tak / nie)");
                            czyKontynuowac = scanner.nextLine();
                        }

                        if (czyKontynuowac.equals("nie")) {
                            System.out.println("Anulowano wypozyczenie. Powrót do menu. Co chcesz teraz zrobić:");
                            continue;
                        }

                        graPlanszowa.setNazwa(nazwaGraPlanszowa);
                        graPlanszowa.setWiekMinimalny(wiekMinGraPlanszowa);
                        graPlanszowa.setWiekMaksymalny(wiekMaxGraPlanszowa);
                        graPlanszowa.setKlientImie(klientImieGraPlanszowa);
                        graPlanszowa.setKlientNazwisko(klientNazwiskoGraPlanszowa);
                        graPlanszowa.setKlientWiek(klientWiekGraPlanszowa);

                        gryPlanszowe.add(graPlanszowa);

                        System.out.println(graPlanszowa);
                        System.out.println("Zapisano wypożyczenie. Powrót do menu. Co chcesz teraz zrobić:");
                    } else {
                        System.out.println("Błędny wybór. \nPowrót do menu. Co chcesz teraz zrobić:");
                    }
                    break;
                case 2:
                    System.out.println("Wyświetlenie listy wypożyczeń.");
                    for (Ksiazka ksiazka : ksiazki) {
                        System.out.println(ksiazka);
                    }

                    for (GraPlanszowa graPlanszowa : gryPlanszowe) {
                        System.out.println(graPlanszowa);
                    }
                    break;
                case 3:
                    System.out.println("Wygenerowanie raportu.");
                    
                    System.out.println("Wypozyczonych ksiązek:");
                    
                    // liczenie rekordów w klasie
                    int recordCountKsiazki = ksiazki.size();
                    System.out.println(recordCountKsiazki);
                    
                    System.out.println("Wypozyczonych gier planszowych:");
                    int recordCountGry = gryPlanszowe.size();
                    System.out.println(recordCountGry);
                    
                    // Liczba wypożyczeń ze względu na wiek klientów
                    int dzieciKsiazki = 0, mlodziezKsiazki = 0, dorosliKsiazki = 0;
                    for (Ksiazka ksiazka : ksiazki) {
                        if (ksiazka.getKlientWiek() <= 10) {
                            dzieciKsiazki++;
                        } else if (ksiazka.getKlientWiek() <= 17) {
                            mlodziezKsiazki++;
                        } else {
                            dorosliKsiazki++;
                        }
                    }

                    int dzieciGry = 0, mlodziezGry = 0, dorosliGry = 0;
                    for (GraPlanszowa graPlanszowa : gryPlanszowe) {
                        if (graPlanszowa.getKlientWiek() <= 10) {
                            dzieciGry++;
                        } else if (graPlanszowa.getKlientWiek() <= 17) {
                            mlodziezGry++;
                        } else {
                            dorosliGry++;
                        }
                    }

                    System.out.println("Książki:");
                    System.out.println("Dzieci (do 10 lat): " + dzieciKsiazki);
                    System.out.println("Młodzież (11-17 lat): " + mlodziezKsiazki);
                    System.out.println("Dorośli (18+): " + dorosliKsiazki);

                    System.out.println("Gry Planszowe:");
                    System.out.println("Dzieci (do 10 lat): " + dzieciGry);
                    System.out.println("Młodzież (11-17 lat): " + mlodziezGry);
                    System.out.println("Dorośli (18+): " + dorosliGry);
                    
                    System.out.println("\nPowrót do menu. Co chcesz teraz zrobić:");
                    break;
                case 4:
                    System.out.println("Zapis do pliku.");
                    
                    System.out.println("Podaj nazwę do pliku wyjściowego:");
                    String outputFilePath = "src\\main\\java\\com\\mycompany\\biblioteka\\" + scanner.nextLine();
                    try (FileWriter writer = new FileWriter(outputFilePath)) {
                        writer.write("Lista wypożyczeń:\n\n");

                        writer.write("Książki:\n");
                        for (Ksiazka ksiazka : ksiazki) {
                            writer.write(ksiazka.toString() + "\n");
                        }
                        writer.write("\nGry Planszowe:\n");
                        for (GraPlanszowa graPlanszowa : gryPlanszowe) {
                            writer.write(graPlanszowa.toString() + "\n");
                        }
                        System.out.println("Zapisano do pliku.");
                        
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    
                    break;
                case 5:
                    System.out.println("Zakończenie programu.");
                    koniec = true;
                    break;
                default:
                    System.out.println("Błędny wybór.");
                    break;
            }
        }
    }
}