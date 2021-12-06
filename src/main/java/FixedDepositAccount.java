public class FixedDepositAccount extends BankAccount{
    private float interest;
    private int duration;
    private boolean locked;

    public FixedDepositAccount(String name) {
        super(name);
        this.interest = 3;
        this.duration = 6;
    }



    @Override
    public void setBalance(float balance) {
    }

    public void setInterest(float interest) {
        if(!locked) this.interest = interest;
        locked = true;
    }

    public void setDuration(int duration) {
        if(locked)
            throw new IllegalArgumentException();
        else
            this.duration = duration;
        locked = true;
    }
}
