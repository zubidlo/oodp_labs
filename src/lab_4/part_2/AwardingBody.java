package lab_4.part_2;

/**
 * abstract awarding body
 * Created by martin on 24/02/2015.
 */
abstract class AwardingBody {

    abstract Prize getPrize(int finishingPoisition);

    protected String congrats() {
        return "Congratulations you are the winner.\n";
    }
}
