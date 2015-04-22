package lab_9.part_3;

import java.util.Arrays;
import java.util.List;

/**
 * President singleton
 * Created by martin on 16/04/2015.
 */
final class President {

    private static final President p = new President();

    private President() {}
    static President createPresident() { return p; }
    String getName() { return "Tomas"; }
    int getAge() { return 34; }

    @Override
    public String toString() {
        return String.format("p: %s, age: %d, hash: %d", getName(), getAge(), hashCode());
    }

    public static void main(String[] args) {
        List<President> presidents = Arrays.asList(
                President.createPresident(),
                President.createPresident(),
                President.createPresident(),
                President.createPresident()
        );
        presidents.forEach(System.out::println);

        President p1 = presidents.get(0);
        System.out.format("%nall presidents are the same instance: %s%n",
                presidents.stream().allMatch(p -> p.equals(p1))
        );
    }
}
