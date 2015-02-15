package lab_2.part_3;

abstract class AbstractAccount {

    protected String id;
    protected AccountType type;
    protected double funds = 0;

    void setFunds(double funds) { this.funds = funds; }

    @Override
    public String toString() {

        return "\n  " + type.name() + " id:" + id + " funds:" + funds;
    }
}
