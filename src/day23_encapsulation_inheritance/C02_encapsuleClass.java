package day23_encapsulation_inheritance;

public class C02_encapsuleClass {
    private int salesAmount;
    private int totalSalesAmount;
    String strDefault;
    protected String strProtected;
    public String strPublic;

    public void setSalesAmount(int salesAmount) {
      this.salesAmount=salesAmount;
      totalSalesAmount+=salesAmount;
    }

    public int getTotalSalesAmount() {
        return totalSalesAmount;

    }
}

