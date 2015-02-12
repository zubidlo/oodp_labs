package lab_2.part_3;

/**
 * Created by martin on 14/02/2015.
 */
public class CurrentAccount extends AbstractAccount {

    /**
     * Creates current account with given id
     * @param id "C4343"
     */
    CurrentAccount(String id) {

        this.id = id;
        this.type = AccountType.CURRENT;
    }
}
