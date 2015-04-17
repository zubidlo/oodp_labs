package lab_3.part_4.gui;

import static java.lang.System.out;
import utilities.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import lab_3.part_4.factoryClasses.*;
import lab_3.part_4.gamePieces.*;

@SuppressWarnings("serial")
//given to me by lecturer
class BattleGameInterface extends FrameSkeleton implements ActionListener {

	private static final int BOARD_SIDE = 5;
    private static int BOARD_SIZE = BOARD_SIDE * BOARD_SIDE;
    private static final int ITEM_LIMIT = 3;
	private final JButton[] buttons = new JButton[BOARD_SIZE];
	private Vehicle[] vehicles = new Vehicle[BOARD_SIZE];
	private DamageItem[] damages = new DamageItem[BOARD_SIZE];
	private JPanel buttonP = new JPanel();
	private final String[] selection = {"Land Battle","Sea Battle"};
	private JComboBox selectBattle = new JComboBox<>(selection);
    private BattleGameAbstractFactory factory = new LandGameConcreteFactory();

	private BattleGameInterface(String title) {
        super(title);
        buttonP.setLayout(new GridLayout(BOARD_SIDE, BOARD_SIDE));
		createGrid();
        JPanel selectionP = new JPanel();
        selectionP.add(selectBattle);
        selectBattle.addActionListener(this);
		getContentPane().add(buttonP);
        getContentPane().add(selectionP,BorderLayout.SOUTH);
        resetGame();
	}

    private void createGrid() {
        JButton button;
        ButtonListener listener = new ButtonListener();
		for(int i = 0; i < BOARD_SIZE; i++) {
			button = new JButton();
            button.addActionListener(listener);
			buttons[i] = button;
            buttonP.add(button);
		}
	}

    private void resetGame() {
        out.println();
        for(int i = 0; i < BOARD_SIZE; i++) {
            buttons[i].setIcon(null);
            buttons[i].setText("" + i);
        }
        vehicles = new Vehicle[BOARD_SIZE];
        damages = new DamageItem[BOARD_SIZE];
        setItems("vehicles");
        setItems("damages");
    }

    //sets 3 random vehicles or damages to appropriate array
    private void setItems(String className) {
        for(int i = 0; i < ITEM_LIMIT; i++) {
            int rand = Utils.rand(BOARD_SIZE);
            if(isFreeCell(rand)) {
                out.format("piece generated to location:%d%n", rand);
                if(className.equals("vehicles"))
                    vehicles[rand] = factory.getBattleVehicle();
                else if(className.equals("damages"))
                    damages[rand] = factory.getDamageItem();
            }
            else i--;
        }
    }

    //true if both arrays have null on given location loc
	private boolean isFreeCell(int loc) {
        return damages[loc] == null && vehicles[loc] == null;
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == selectBattle) {
            factory = selectBattle.getSelectedIndex() == 0 ?
                    new LandGameConcreteFactory() : new SeaGameConcreteFactory();
            resetGame();
		}
	}

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            for(int i = 0; i < BOARD_SIZE; i++) {
                if(button == buttons[i]) {
                    button.setText("");
                    if(damages[i] != null)
                        buttons[i].setIcon(damages[i].getImage());
                    else if(vehicles[i] != null)
                        buttons[i].setIcon(vehicles[i].getImage());
                }
            }
        }
    }

	public static void main(String[] args) {
		new BattleGameInterface("Battle Game");
	}
}
