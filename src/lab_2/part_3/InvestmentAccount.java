package lab_2.part_3;

/**
 * Created by martin on 14/02/2015.
 */
public class InvestmentAccount extends AbstractAccount {

    /**
     * Creates investment account with given id
     * @param id "I4343"
     */
    InvestmentAccount(String id) {

        this.id = id;
        this.type = AccountType.INVESTMENT;
    }
}
