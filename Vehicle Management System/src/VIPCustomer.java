public class VIPCustomer extends Customer {
    private int vipLevel;

    public VIPCustomer(String name, String email, String phoneNumber,int vipLevel) {
        super(name, email, phoneNumber);
        this.vipLevel = vipLevel;
    }

    @Override
    public String toString() {
        return "VIPCustomer: (Name: "+getName()+", Email: "+getEmail()+", PhoneNumber: "+getPhoneNumber()+", Vip Level: "+getVipLevel()+")";
    }

    public int getVipLevel() {
        return vipLevel;
    }
}