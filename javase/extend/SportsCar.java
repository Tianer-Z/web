package javase.extend;

public class SportsCar extends CarBase{
    public int nAmount = 90;

    public SportsCar() {
        System.out.println("SportsCar 类的构造方法被调用了!");
    }

    public void speedUpUsingN(int p_amount) {
        int realAmount = 0;
        if (this.nAmount <= p_amount) {
            realAmount = this.nAmount;
            this.nAmount = 0;
        } else {
            realAmount = p_amount;
            this.nAmount -= p_amount;
        }
        int speedUp = (int)(realAmount / 4);
        this.speed += speedUp;
    }

    public void addN(int p_amount) {
        if (p_amount < 0) {
            return ;
        }
        this.nAmount += p_amount;
    }

}
