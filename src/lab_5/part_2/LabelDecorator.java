package lab_5.part_2;

/**
 * decorator
 * Created by Martin Zuber on 04/03/2015.
 */
class LabelDecorator extends LabelWithMouseListener{

    private final LabelWithMouseListener componentToBeDecorated;

    LabelDecorator(LabelWithMouseListener componentToByDecorated) {
        this.componentToBeDecorated = componentToByDecorated;
    }

    @Override
    void setBorder() {
        componentToBeDecorated.setBorder();
    }

    @Override
    String getDescription() {
        return componentToBeDecorated.getDescription();
    }
}
