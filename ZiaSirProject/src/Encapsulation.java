class Wallet {
    private double money;

    public void addMoney(double amount) {
        if (amount > 0) money += amount;
    }

    public double getMoney() {
        return money;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        myWallet.addMoney(300);
        System.out.println(myWallet.getMoney());
    }
}
