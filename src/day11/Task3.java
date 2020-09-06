package day11;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.shuffle;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("AA", 2007);
        MusicBand musicBand2 = new MusicBand("BB", 1976);
        MusicBand musicBand3 = new MusicBand("CC", 1960);
        MusicBand musicBand4 = new MusicBand("DD", 2018);
        MusicBand musicBand5 = new MusicBand("EE", 2006);
        MusicBand musicBand6 = new MusicBand("FF", 2014);
        MusicBand musicBand7 = new MusicBand("GG", 1965);
        MusicBand musicBand8 = new MusicBand("HH", 1966);
        MusicBand musicBand9 = new MusicBand("II", 2008);
        MusicBand musicBand10 = new MusicBand("JJ", 2003);

        List <MusicBand> bands = new ArrayList<>();
        bands.add(musicBand1);
        bands.add(musicBand2);
        bands.add(musicBand3);
        bands.add(musicBand4);
        bands.add(musicBand5);
        bands.add(musicBand6);
        bands.add(musicBand7);
        bands.add(musicBand8);
        bands.add(musicBand9);
        bands.add(musicBand10);

        System.out.println(bands);

        shuffle(bands);
        System.out.println(bands);

        List <MusicBand> musicBandsAfter2000 = new ArrayList<>();

        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                musicBandsAfter2000.add(band);
            }
        }
        System.out.println(musicBandsAfter2000);
    }
}
