package lab_6.part_2;

import java.util.ArrayList;

/**
 * abstract project
 * Created by Martin Zuber on 11/03/2015.
 */
abstract class AbstractProject {

    protected AbstractProject parent;
    protected String name;

    AbstractProject(String name) {
        this.name = name;
    }

    AbstractProject(AbstractProject parent, String name) {
        this(name);
        this.parent = parent;
    }

    AbstractProject getParent() {
        return parent;
    }

    @Override
    public String toString(){
        return String.format("%s: %s, cost:%.2f euro", getClass().getSimpleName(), name, getCost());
    }

    /**
     * adds given project to this project tasks. Called only in child constructor
     * @param project
     * @throws UnsupportedOperationException if this project is a task itself
     */
    protected abstract void add(AbstractProject project) throws UnsupportedOperationException;

    /**
     * removes given project from this project tasks
     * @param project
     * @return
     * @throws UnsupportedOperationException if this project is a task itself
     * @throws IllegalArgumentException if given project is not in this project tasks
     */
    abstract AbstractProject remove(AbstractProject project)
            throws UnsupportedOperationException, IllegalArgumentException;

    /**
     * returns this project tasks.
     * @return a collection of this project tasks, empty if this project is a task itself
     */
    abstract ArrayList<AbstractProject> getTasks();

    /**
     * returns cost of this projects, all task costs included.
     * @return
     */
    abstract double getCost();
}
