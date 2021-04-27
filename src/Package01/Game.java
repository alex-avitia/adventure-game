package Package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();
    VisibilityManager vm = new VisibilityManager(ui);
    Story story = new Story(this, ui, vm);

    public static void main(String[] args) {

        new Game();

    }

    public Game() {

        ui.createUI(cHandler);
        story.defaultSetup();
        story.secondPageNewStory();
        vm.secondPageNewStory();
        story.startNewStory();
        vm.startNewStory();
        vm.showTitleScreen();


    }

    public class ChoiceHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            String playerChoice = event.getActionCommand();

            switch(playerChoice){
                case "start":
                    vm.startNewStory();
                    break;
                case "continue":
                    vm.secondPageNewStory();
                    break;
                case "c1":
                    break;
                case "c2":
                    break;
                case "c3":
                    break;
                case "c4":
                    break;
            }

        }
    }

}
