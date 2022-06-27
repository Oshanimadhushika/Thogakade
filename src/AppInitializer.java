import entity.Customer;
import entity.Item;
import entity.OrderDetail;
import entity.Orders;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class AppInitializer {
    public static void main(String[] args){

        Customer c=new Customer();
        c.setId("C001");
        c.setName("Oshani");
        c.setSalary("50000");
        c.setAddress("Rathnapura");

        Item i = new Item();
        i.setCode("I001");
        i.setDescription("Dhal");
        i.setUnitPrice(250);
        i.setQtyOnHand(10);

        Orders o=new Orders();
        o.setOid("O001");
        o.setCustomer(c);

        OrderDetail od = new OrderDetail();
        od.setOrders(o);
        od.setItem(i);
        od.setQty(5);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(c);
        session.save(i);
        session.save(o);
        session.save(od);

        transaction.commit();

        session.close();
    }
}
