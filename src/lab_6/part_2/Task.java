package lab_6.part_2;

import java.util.ArrayList;

/**
 * task (tree leaf -> no task can be added to this task)
 * Created by Martin Zuber on 11/03/2015.
 */
class Task extends AbstractProject {

    private double cost;

    Task(Project parent, String name, double cost) {
        super(parent, name);
        this.cost = cost;
        parent.add(this);
    }
    @Override
    protected void add(AbstractProject project) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    AbstractProject remove(AbstractProject project) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    ArrayList<AbstractProject> getTasks() {
        return new ArrayList<AbstractProject>();
    }

    @Override
    double getCost() {
        return cost;
    }
}
