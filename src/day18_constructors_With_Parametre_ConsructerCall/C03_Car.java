package day18_constructors_With_Parametre_ConsructerCall;
public class C03_Car {
    String brand= "not brand specified";
    String model = "not Model specified";
    int year=1900;
    int price;
    public C03_Car(int prrc,String brnd){
        price=prrc;
        brand=brnd;
    }
    public C03_Car(String brd){
        brand=brd;
        // fiyat=12000;
        // model="Civic";
        // yil=2000;
    }
    public C03_Car(){
    }
    public C03_Car(String marka, String model, int year, int price) {
        this.brand = marka;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    // marka ve model ile cons olusturalim
    public C03_Car(String brd, String model) {
        this.brand = brd;
        this.model = model;
    }
    @Override
    public String toString() {
        return "C03_Car{" +
                "marka='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + year +
                ", fiyat=" + price +
                '}';
    }
}
