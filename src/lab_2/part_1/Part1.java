package lab_2.part_1;

import java.util.Vector;

class Part1 {

    public static void main(String[] args) {

        //model
        HobbyList model = new HobbyList();
        Vector<Hobby> hobbies = model.getHobbies();

        //views
        AbstractHobbyView listView = new ListView("View with JList", hobbies);
        AbstractHobbyView comboView = new ComboView("View with Combo Box", hobbies);

        //controller
        new Controller(model, listView, comboView);
    }
}
