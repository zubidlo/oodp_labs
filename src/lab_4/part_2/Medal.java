package lab_4.part_2;

/**
 * Prize for Athletes.
 * Created by martin on 24/02/2015.
 */
class Medal extends Prize {

    private static final String[] iconPaths = {
            "golden_medal.png",
            "silver_medal.png",
            "bronze_medal.png"
    };

    Medal(int position) {
        makeIcon(iconPaths[position]);
    }
}
