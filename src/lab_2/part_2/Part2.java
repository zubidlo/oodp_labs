package lab_2.part_2;
import static java.lang.System.*;

class Part2 {

    public static void main(String[] args) {

        NumberFactory nFactory = new NumberFactory();

        String[] lists = {
                "1 2 3 4 5 6 7 8 9 10",
                "1.1 2.2 3.3 4.4 5.5 6.6 7.7 8.8 9.9 10.1",
                "A,B,C,D,E,F,G,H,I,J"
        };

        for(String list : lists) {
            NumberList numList = nFactory.getNumberList(list);
            numList.display();
            out.format("sum:%s%n", numList.sum());
        }
    }
}
