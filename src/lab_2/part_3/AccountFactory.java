package lab_2.part_3;
/**
 * Created by martin on 14/02/2015.
 */
public class AccountFactory {

    /**
     * Creates an instance of account based on id
     * @param id "C233543" or "I34343"
     * @return instance of account
     */
    AbstractAccount getAccount(String id) throws IllegalArgumentException{

        if (id.toUpperCase().charAt(0) == 'C') { return new CurrentAccount(id); }
        if (id.toUpperCase().charAt(0) == 'I') { return new InvestmentAccount(id); }

        throw new IllegalArgumentException("Bad account id!");
    }

    /**
     * Creates account based on id and with given funds
     * @param id "C233543" or "I34343"
     * @param funds some funds
     * @return new account
     */
    AbstractAccount getAccount(String id, double funds) throws IllegalArgumentException{

        AbstractAccount account = getAccount(id);
        account.setFunds(funds);
        return account;
    }
}
