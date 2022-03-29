package tutorial.ch03.ssg_membership;

public class Main {
    public static void main(String[] args) {
        Customer jisu = new Customer(1,"지수","1995-01-03");
        VIPCustomer jeny = new VIPCustomer(2,"제니","1996-01-16");
       VIPCustomer rose = new VIPCustomer(3,"로제","1997-02-11");
       Customer lisa = new Customer(4,"리사","1997-03-27");

        //블랙핑크 쇼핑 시나리오
        //TODO: 2022-01-21 (021 buy 함수 완성
       jisu.buy(50000);
       jeny.buy(700000);
       rose.buy(650000);
       lisa.buy(12000);
       print(jisu,jeny,rose,lisa);

       jisu.buy(30000);
       jeny.buy(135000);
       rose.buy(300000);
       lisa.buy(45000);

       jisu.buy(700000);
       jeny.buy(180000);
       rose.buy(69000);
       lisa.buy(943000);
    }
    public static void print(Customer c1, VIPCustomer c2, VIPCustomer c3,Customer c4) {
        //TODO: 2022-01-21 (021) print
        System.out.println("--------------------------------------------------------");
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        System.out.println("--------------------------------------------------------");
    }
}
