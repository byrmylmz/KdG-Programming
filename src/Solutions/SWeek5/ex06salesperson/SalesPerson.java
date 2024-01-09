package Solutions.SWeek5.ex06salesperson;

public class SalesPerson {
    private String name;
    private double revenue;

    public SalesPerson(String name, double revenue) {
        this.name = name;
        this.revenue = revenue;
    }

    public boolean hasMoreRevenueThan(SalesPerson other) {
        return revenue > other.getRevenue();
    }

    public double getRevenue() {
        return revenue;
    }

    public String getName() {
        return name;
    }
}