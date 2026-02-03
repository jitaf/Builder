//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Director obsahuje "recepty" (postupy sestavení) – například office PC, gaming PC...
        Director d = new Director();

        // 1) Builder, který skládá výsledek jako objekt Pc (data, se kterými může program dál pracovat).
        PcBuilder b1 = new PcBuilder();

        // Director provede kroky receptu a volá metody PcBuilder (reset, setCpu, setRamGb, setSsdGb).
        // To, jak se kroky provedou, určuje konkrétní implementace builderu (tady PcBuilder).
        d.buildGamingPc(b1);

        // Po dokončení receptu si vyzvedneme hotový produkt.
        Pc gaming = b1.getResult();

        // Vypíšeme objekt (toString ukáže CPU/RAM/SSD).
        System.out.println(gaming);

        // 2) Druhý builder, který používá stejné kroky, ale skládá výsledek jako textový manuál.
        ManualBuilder b2 = new ManualBuilder();

        // Stejný recept v Directoru -> stejná posloupnost kroků,
        // ale protože builder je jiný, výsledek bude jiný typ produktu (PcManual).
        d.buildGamingPc(b2);

        // Vyžádáme si hotový manuál.
        PcManual manual = b2.getResult();

        // Vypíšeme textový manuál.
        System.out.println(manual);
    }
}