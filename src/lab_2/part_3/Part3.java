package lab_2.part_3;

import static java.lang.System.*;
import java.util.*;

class Part3 {

    public static void main(String[] args) {

        AccountFactory factory = new AccountFactory();
        List<AbstractAccount> accounts = new ArrayList<>();

        accounts.add(factory.getAccount("C1223"));
        accounts.add(factory.getAccount("C5454", 45));
        accounts.add(factory.getAccount("I2340"));
        accounts.add(factory.getAccount("I2343", 1000));
        out.format("%naccounts:%s%n", accounts);

        //factory.getAccount("i343ed3");
    }
}
