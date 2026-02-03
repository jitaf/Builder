public class PcBuilder implements IPcBuilder {

    // Rozestavěný produkt, který builder postupně „plní“ hodnotami.
    // Po dokončení kroků (typicky volaných Directorem) ho vrátíme v getResult().
    private Pc pc;

    @Override
    public void reset() {
        // Začátek nového sestavování: vytvoříme nový prázdný Pc objekt.
        // reset je důležitý, aby se nepoužíval starý objekt z předchozí stavby.
        pc = new Pc();
    }

    @Override
    public void setCpu(String cpu) {
        // Krok builderu: nastavujeme CPU v objektu Pc.
        pc.cpu = cpu;
    }

    @Override
    public void setRamGb(int ramGb) {
        // Krok builderu: nastavujeme velikost RAM v GB.
        pc.ramGb = ramGb;
    }

    @Override
    public void setSsdGb(int ssdGb) {
        // Krok builderu: nastavujeme velikost SSD v GB.
        pc.ssdGb = ssdGb;
    }

    // Vrácení výsledku sestavování.
    // getResult() se volá až po tom, co byly zavolány všechny kroky (setCpu, setRamGb, ...).
    public Pc getResult() {
        return pc;
    }
}
