package lab_4.part_2;

/**
 * Prize for horses
 * Created by martin on 24/02/2015.
 */
class Ribbon extends Prize {

    private static final String[] iconPaths = {
            "golden_ribbon.png",
            "silver_ribbon.png",
            "bronze_ribbon.png"
    };

    Ribbon(int position) {
        makeIcon(iconPaths[position]);
    }
}
