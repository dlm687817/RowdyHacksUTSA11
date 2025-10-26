package javaprototype;

public class User {
    private int userId;
    private String fullname;
    private String accountNumber;
    private String routingNumber;

    public User(int userId, String fullname, String accountNumber, String routingNumber) {
        this.userId = userId;
        this.fullname = fullname;
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
    }

    public int getUserId() { return userId; }
    public String getName() { return fullname; }
    public String getAccountNumber() { return accountNumber; }
    public String getRoutingNumber() { return routingNumber; }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + userId +
                ", Name='" + fullname + '\'' +
                ", Account='" + accountNumber + '\'' +
                ", Routing='" + routingNumber + '\'' +
                '}';
    }
}