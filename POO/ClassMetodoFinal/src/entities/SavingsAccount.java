package entities;

public final class SavingsAccount extends Account {
    
    private Double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){

    }
    public Double withdraw(Double amount){
        return balance -= amount;
    }
}
