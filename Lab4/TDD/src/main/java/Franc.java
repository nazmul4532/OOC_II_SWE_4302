public class Franc extends Money{
    public int amount;
    public Franc(int amount) {this.amount = amount;}
    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
    @Override
    public boolean equals(Object o) {
        Franc franc = (Franc) o;
        return this.amount ==franc.amount;
    }
}
