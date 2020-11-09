import java.math.BigDecimal;
import java.text.DecimalFormat;

//make a method for making random account numbers
public class BankAccount {
    double bal = 0;
    AccountOwner acctOwn;
    long accountNum = 0;

    public BankAccount(AccountOwner accountOwner, double balance) {
        bal = balance;
        acctOwn = accountOwner;
        accountNum = accountGenerator();
    }


    public long accountGenerator() {
        long accountNumber = (long) (Math.random() * 100000000);
        return accountNumber;
    }

    public int deposit(double amount) {
        if (amount <= 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public int withdraw(double amount) {
        if (amount > bal) {
            return 3;
        } else if (amount <= 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public int transfer(long account, double amount) {
        if (amount <= 0) {
            return 2;
        } else if (amount > bal) {
            return 3;
        } else if (account != accountNum) {
            return 4;
        } else {
            return 1;
        }
    }

    public java.lang.String getMaskedAccountNumber() {
        String strAccountNum = String.valueOf(accountNum);

        if (strAccountNum.length() == 1) {
            return "****000" + strAccountNum;
        } else if (strAccountNum.length() == 2) {
            return "****00" + strAccountNum;
        } else if (strAccountNum.length() == 3) {
            return "****0" + strAccountNum;
        } else if (strAccountNum.length() == 4) {
            return "****" + strAccountNum;
        } else {
            return "****" + strAccountNum.substring(4);
        }
    }

    public java.lang.String getFormattedBalance() {
        DecimalFormat decimalFormat = new DecimalFormat("$#,###.##");
        return decimalFormat.format(bal);
    }

    public java.math.BigDecimal validateBalance(double balance) {
        if (bal < 0) {
            return BigDecimal.ZERO;
        } else {
            return BigDecimal.valueOf(bal);
        }

    }

    public long getAccountNumber() {
        return accountNum;
    }

    public AccountOwner getAccountOwner() {
        return acctOwn;
    }

    public void setAccountOwner(AccountOwner accountOwner) {
        acctOwn = accountOwner;
    }

    public java.math.BigDecimal getBalance() {
        return BigDecimal.valueOf(bal);
    }
}