public class ManualBuilder implements IPcBuilder {

    // Interně si postupně skládáme text (manuál) jako řetězec.
    // StringBuilder je efektivní, protože se text často rozšiřuje.
    private StringBuilder sb;

    @Override
    public void reset() {
        // Začátek nového manuálu – reset je důležitý, aby se nelepily staré hodnoty.
        sb = new StringBuilder("== PC MANUÁL ==\n");
    }

    @Override
    public void setCpu(String cpu) {
        // Krok builderu: místo ukládání do objektu Pc zapisujeme do textu.
        sb.append("CPU: ").append(cpu).append("\n");
    }

    @Override
    public void setRamGb(int ramGb) {
        // Další krok: přidání informace o RAM do manuálu.
        sb.append("RAM: ").append(ramGb).append(" GB\n");
    }

    @Override
    public void setSsdGb(int ssdGb) {
        // Další krok: přidání informace o SSD do manuálu.
        sb.append("SSD: ").append(ssdGb).append(" GB\n");
    }

    // Výsledek builderu: vrátíme "produkt" PcManual, který obsahuje hotový text.
    // getResult() se typicky volá až po tom, co Director provede všechny kroky.
    public PcManual getResult() {
        PcManual m = new PcManual();
        m.text = sb.toString();
        return m;
    }
}
