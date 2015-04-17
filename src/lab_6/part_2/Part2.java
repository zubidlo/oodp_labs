package lab_6.part_2;

import utilities.FrameSkeleton;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.util.*;

/**
 * gui
 * Created by Martin Zuber on 11/03/2015.
 */
class Part2 extends FrameSkeleton implements TreeModel {

    private final AbstractProject root;
    private final List<TreeModelListener> listeners;

    private Part2(Project root, String title) {
        super(title);
        this.root = root;
        listeners = new ArrayList<>();
        initTreeModel(root);

        JTree tree = new JTree(this);
        tree.setShowsRootHandles(true);
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        renderer.setLeafIcon(new ImageIcon(getClass().getResource("leaf.jpg")));
        ImageIcon projectIcon = new ImageIcon(getClass().getResource("project.jpg"));
        renderer.setOpenIcon(projectIcon);
        renderer.setClosedIcon(projectIcon);
        tree.setCellRenderer(renderer);
        tree.putClientProperty("JTree.lineStyle", "Vertical");
        JScrollPane treeView = new JScrollPane(tree);
        getContentPane().add(treeView);
    }

    private void initTreeModel(Project root) {

        Project sap = new Project(root, "SAP");
        new Task(sap, "Requirements", 1000);
        new Task(sap, "Coding", 1000);

        Project analysis = new Project(sap, "Analysis");
        new Task(analysis, "UML Diagram", 1000);
        new Task(analysis, "Data Analysis", 1000);
        new Task(analysis, "Screen Design", 1000);

        Project website = new Project(root, "Website");
        new Task(website, "Design", 1000);
        new Task(website, "Analysis", 1000);

        Project coding1 = new Project(website, "Coding");
        new Task(coding1, "Prog. Specs", 1000);
        new Task(coding1, "Screens", 1000);

        Project payroll = new Project(root, "Payroll");
        new Task(payroll, "Design", 1000);
        new Task(payroll, "Coding", 1000);
        new Task(payroll, "Testing", 1000);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new Part2(new Project("Project"), "Composite design pattern"));
    }

    @Override
    public Object getRoot() {
        return root;
    }

    @Override
    public Object getChild(Object parent, int index) {

        if(index >= getChildCount(parent)) return null;
        ArrayList<AbstractProject> children = ((AbstractProject) parent).getTasks();
        return children.get(index);

    }

    @Override
    public int getChildCount(Object parent) {
        return ((AbstractProject) parent).getTasks().size();
    }

    @Override
    public boolean isLeaf(Object node) {
        return ((AbstractProject) node).getTasks().size() == 0;
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        ArrayList<AbstractProject> children = ((AbstractProject) parent).getTasks();
        if (children.contains(child)) return (children.indexOf(child));
        else return -1;
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        synchronized (this) {
            listeners.add(l);
        }
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        synchronized (this){
            listeners.remove(l);
        }
    }
}
