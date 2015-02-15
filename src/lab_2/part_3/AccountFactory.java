package lab_2.part_3;

import java.util.regex.*;
import static java.lang.System.*;

class AccountFactory {

    /**
     * Creates an instance of account based on id.
     * @param id "C233543" or "I34343"
     * @return instance of account
     */
    AbstractAccount getAccount(String id) throws IllegalArgumentException{

        AbstractAccount account;

        //determine which instance of account to return
        if (Pattern.compile("^[cC]\\d+$").matcher(id).find()) {
            account = new CurrentAccount(id);
        }
        else if (Pattern.compile("^[iI]\\d+$").matcher(id).find()) {
            account = new InvestmentAccount(id);
        }
        else {
            throw new IllegalArgumentException("Bad account id format:'" + id + "'!");
        }

        out.format("Account factory created instance of %s from id:'%s'%n",
                account.getClass().getSimpleName(), id);
        return account;
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
