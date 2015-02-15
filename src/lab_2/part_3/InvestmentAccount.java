package lab_2.part_3;

class InvestmentAccount extends AbstractAccount {

    /**
     * Creates investment account with given id
     * @param id "I4343"
     */
    InvestmentAccount(String id) {

        this.id = id;
        this.type = AccountType.INVESTMENT;
    }
}
