package MainPkg;

public class VisibilityManager {

    UI ui;

    public VisibilityManager(UI userInterface){

        ui = userInterface;
    }

    //TODO: uncomment when continue button is made

    public void showTitleScreen(){

        // Show the title screen
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);
        // ui.continueButtonPanel.setVisible(false);

        // Hide the game screen
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
    }


    // Display general story before start
    public void startNewStory() {
        // Hide the title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        ui.continueButtonPanel.setVisible(true);

        // Show ONLY the main text panel
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
    }

    public void secondPageNewStory() {
        // Hide the title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        ui.continueButtonPanel.setVisible(true);

        // Show ONLY the main text panel
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
    }

    public void titleToStart(){

        // Hide the title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        ui.continueButtonPanel.setVisible(false);

        // Show the game screen
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
    }
}
