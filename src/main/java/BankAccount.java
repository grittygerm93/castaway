import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BankAccount {
    private String accountName;
    private String accountNum;
    private float balance;
    private List<String> transactions;
    private boolean isClosed;
    private Date createDate;
    private Date closedDate;

    public BankAccount(String name) {
        this.accountName = name;
        this.balance = 0f;
        this.accountNum = Integer.toString((int)(1000 * Math.random()));
        transactions = new ArrayList<>();

    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    public void deposit(int deposit) {
        this.transactions.add(String.format("deposit $%d at %s", deposit, Calendar.getInstance().getTimeInMillis()));
        balance += deposit;
    }

    public void withdraw(int withdraw) {
        if (withdraw < 0 || withdraw > this.balance || isClosed) {
            throw new IllegalArgumentException();
        }

        this.transactions.add(String.format("withdraw $%d at %s", withdraw, Calendar.getInstance().getTimeInMillis()));
        balance -= withdraw;
    }
}
