package lab_4.part_2;

/**
 * awarding body for horses
 * Created by martin on 24/02/2015.
 */
class HorseShowAwardingBody extends AwardingBody {

    /**
     * returns new gold, silver or bronze ribbon
     * @param finishingPoisition finish position
     * @return new ribbon
     */
    @Override
    Prize getPrize(int finishingPoisition) {
        return new Ribbon(finishingPoisition);
    }
}
