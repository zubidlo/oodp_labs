package lab_2.part_3;

import static java.lang.System.*;
import java.util.*;
/**
 * Created by martin on 14/02/2015.
 */
public class Part3 {

    public static void main(String[] args) {

        AccountFactory factory = new AccountFactory();

        List<AbstractAccount> accounts = new ArrayList<AbstractAccount>();

        try {
            accounts.add(factory.getAccount("C1223"));
            accounts.add(factory.getAccount("C5454", 45));
            accounts.add(factory.getAccount("I2340"));
            accounts.add(factory.getAccount("I2343", 1000));
            out.println("accounts:" + accounts);

            factory.getAccount("A34343");
        }
        catch (IllegalArgumentException e) {err.println(e.getMessage());}
    }
}
