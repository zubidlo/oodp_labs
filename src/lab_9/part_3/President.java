package lab_9.part_3;

import java.util.Arrays;

/**
 * President singleton
 * Created by martin on 16/04/2015.
 */
final class President {

    private static final President president = new President();

    private President() {}
    static President createPresident() { return president; }
    String getName() { return "Tomas"; }
    int getAge() { return 34; }

    @Override
    public String toString() {
        return String.format("president: %s, age: %d, hashcode: %d%n", getName(), getAge(), hashCode());
    }

    public static void main(String[] args) {
        Arrays.asList(
                President.createPresident(),
                President.createPresident(),
                President.createPresident(),
                President.createPresident()
        ).forEach(System.out::print);
    }
}
