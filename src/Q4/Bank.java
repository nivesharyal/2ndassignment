package Q4;

public abstract class Bank {
    private double BankA = 1000.00d;
    private double BankB = 1500.00d;
    private double BankC = 2000.00d;

    public abstract void getBalance();

    public double getA() {
        return BankA;
    }

    public void setA(double BankA ) {
        this.BankA = BankA;
    }

    public double getB() {
        return BankB;
    }

    public void setB(double BankB) {
        this.BankB = BankB;
    }

    public double getC() {
        return BankC;
    }

    public void setC(double BankC) {
        this.BankC = BankC;
    }
}