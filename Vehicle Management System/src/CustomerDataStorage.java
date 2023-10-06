import java.util.ArrayList;
import java.util.List;

public class CustomerDataStorage {
    private List<Customer> customers;

    public CustomerDataStorage() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void addVIPCustomer(VIPCustomer vipCustomer)
    {
        customers.add(vipCustomer);
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }
}
