public class Director {

    // "Recept" na kancelářské PC.
    // Director NEvytváří produkt přímo (nedělá new Pc()), jen určuje pořadí kroků.
    // To, co se reálně vytvoří (Pc / PcManual / JSON...), záleží na konkrétní implementaci PcBuilder.
    public void buildOfficePc(PcBuilder b) {

        // Začneme od čistého stavu (builder si připraví nový "rozestavěný" produkt).
        b.reset();

        // Kroky sestavení – nastavujeme vlastnosti podle receptu.
        b.setCpu("i3");
        b.setRamGb(8);
        b.setSsdGb(256);

        // Pozn.: Director obvykle nevolá getResult(); to dělá až klient po dokončení receptu.
    }

    // "Recept" na herní PC – stejný postup kroků, jen jiné hodnoty.
    public void buildGamingPc(PcBuilder b) {

        // Opět začneme od prázdného stavu.
        b.reset();

        // Nastavení parametrů pro herní konfiguraci.
        b.setCpu("i7");
        b.setRamGb(32);
        b.setSsdGb(1000);
    }
}
