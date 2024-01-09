package Week5.Ex_05_06_SalePerson;

public class SalesPerson {

    private String name;
    private double revenue;

    public SalesPerson(String name, double revenue) {
        this.name = name;
        this.revenue = revenue;
    }

    public boolean hasMoreRevenueThan(SalesPerson other){

        return this.revenue>other.revenue;
    }

    public static String calculateTop(SalesPerson one, SalesPerson two, SalesPerson three) {
        double[] rev = new double[3];
        rev[0] = one.getRevenue();
        rev[1] = two.getRevenue();
        rev[2] = three.getRevenue();

        double max = rev[0];
        for (int i = 0; i < 2; i++) {
            if (max < rev[i]) {
                max = rev[i];
            }
        }

       return "olmadi";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }
}
