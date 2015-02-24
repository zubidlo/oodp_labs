package lab_4.part_2;

/**
 * awarding body for athletes
 * Created by martin on 24/02/2015.
 */
class AthleticsAwardingBody extends AwardingBody {

    /**
     * returns new gold, silver or bronze medal
     * @param finishingPoisition finish position
     * @return new medal
     */
    @Override
    Prize getPrize(int finishingPoisition) {
        return new Medal(finishingPoisition);
    }
}
