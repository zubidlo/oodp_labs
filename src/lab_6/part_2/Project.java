package lab_6.part_2;

import java.util.ArrayList;

/**
 * project (tree node -> tasks can be added to this project)
 * Created by Martin Zuber on 11/03/2015.
 */
class Project extends AbstractProject{

    private ArrayList<AbstractProject> projects;

    Project(String name) {
        super(name);
        projects = new ArrayList<>();
    }

    Project(Project parent, String name) {
        this(name);
        parent.add(this);
    }

    @Override
    protected void add(AbstractProject project) throws UnsupportedOperationException {
        projects.add(project);
    }

    @Override
    AbstractProject remove(AbstractProject project)
            throws UnsupportedOperationException, IllegalArgumentException {
        if(!projects.contains(project))
            throw new IllegalArgumentException("given project nonexistent");

        projects.remove(project);
        return project;
    }

    @Override
    ArrayList<AbstractProject> getTasks() {
        return projects;
    }

    @Override
    double getCost() {
        double result = 0;
        for(AbstractProject project : projects) result += project.getCost();
        return result;
    }
}
