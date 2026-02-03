public class Pc {
    protected String cpu; int ramGb; int ssdGb;
    @Override
    public String toString() {
        return "Pc{cpu=" + cpu + ", ram=" + ramGb + "GB, ssd=" + ssdGb + "GB}";
    }
}
