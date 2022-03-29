package tutorial.ch03.ssg_membership;

public class VIPCustomer extends Customer{
    public final double vip_pRate =0.05;
    public final double vip_discount = 0.2;
    double dRate;

    public VIPCustomer(int id, String name, String birth) {
        super(id, name, birth);
        pRate = vip_pRate;
        dRate = vip_discount;
    }
    @Override
    public void buy(int price) {
        double mypoice = (double) price * dRate;
        int checkPrice = price - (int) mypoice;
        if (isAvailable(checkPrice)) {
            money = money - price + (int) mypoice;
            double mypoint = (double) price * pRate;
            point += mypoint;
        }
    }
}
