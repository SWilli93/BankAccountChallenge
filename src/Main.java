public class Main {

    public static void main(String[] args) {
        Account scottsAccount = new Account("123456789", 2000000, "Scott Williams", "Example@fake.com", "555-5555");

//        scottsAccount.setNumber("123456789");
//        scottsAccount.setBalance(2000000);
//        scottsAccount.setCustomerName("Scott Williams");
//        scottsAccount.setCustomerEmail("Example@fake.com");
//        scottsAccount.setCustomerPhone("555-5555");

        scottsAccount.getBalance();
        scottsAccount.depositFunds(250);
        scottsAccount.withdrawFunds(50);
    }



}
