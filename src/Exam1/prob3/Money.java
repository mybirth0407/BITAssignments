package exam1.prob3;

public class Money {
    private int amount;

    Money(int amount) {
        this.amount = amount;
    }

    public Money add(Money money) {
        //더하기
        Money retMoney = new Money(amount + money.amount);
        return retMoney;
    }

    public Money minus(Money money) {
        //빼기
        Money retMoney = new Money(amount - money.amount);
        return retMoney;
    }

    public Money multiply(Money money) {
        //곱하기
        Money retMoney = new Money(amount * money.amount);
        return retMoney;
    }

    public Money devide(Money money) {
        //나누기
        if (money.amount == 0) {
            System.out.println("cant divide to 0");
            return null;
        }
        
        Money retMoney = new Money(amount / money.amount);
        return retMoney;
    }

    public boolean equals(Object o) {
        if (o.getClass() == this.getClass()) {
            Money tempMoney = (Money)o;

            if (tempMoney.amount == this.amount) {
                return true;
            }
        }
        return false;
    }

    public int getAmount() {
        return amount;
    }
}