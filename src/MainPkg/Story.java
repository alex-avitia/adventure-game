package MainPkg;

import Weapons.Weapon_Knife_Damaged;

public class Story {
    Game game;
    UI ui;
    VisibilityManager vm;
    Player player = new Player();

    public Story(Game g, UI userInterface, VisibilityManager vManager) {

        game = g;
        ui = userInterface;
        vm = vManager;

    }

    public void defaultSetup(){

        player.hp = 10;
        ui.hpNumberLabel.setText("" + player.hp);

        player.currentWeapon = new Weapon_Knife_Damaged();
        ui.weaponNameLabel.setText(player.currentWeapon.name);
    }

    public void startNewStory() {
        ui.mainTextArea.setText("You are a Voyager aboard the ORIGIN, an infamous starship known around the galaxy. While you were sleeping between jumps, the ORIGIN made an emergency landing onto a desolate rock for an unknown reason. \n\nIn this instance, you've received a traumatic blow to the head. You remain unconscious during the chaos and awake among the wreckage of your starship.");
    }

    //TODO: have startNewStory flow into secondPageNewStory

    public void secondPageNewStory() {
        ui.mainTextArea.setText("Dazed and with blurred vision, you see no other members of your crew. The site of impact is ridden with shrapnel and chunks of the ORIGIN, well beyond repair. \nYou see a standard plasma cutter lodged into the inner hull of your cabin. You are able to pull it out with some force. On a brief examine, you notice the blade is damaged, but accept that this would be better than nothing.");
    }

    public void startArea() {
        ui.mainTextArea.setText("");
    }

}
