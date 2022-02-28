package Test;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        //Gui gui = new Gui();
        //gui.create();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press any key to start:");
        String anykey = scanner.nextLine();


        Ai.createAiShips(GameHelper.enemyField);
        Ai.createAiShips(GameHelper.playerField);


        GameHelper.showField(GameHelper.playerField);
        GameHelper.showBattleField(GameHelper.battleField, GameHelper.enemyField);


        while (Checker.checkField(GameHelper.enemyField, GameHelper.playerField)){
            System.out.println("Ваш ход:");
            Checker.chekShot(GameHelper.enemyField, User.shot(GameHelper.battleField));
            GameHelper.showField(GameHelper.playerField);
            GameHelper.showBattleField(GameHelper.battleField, GameHelper.enemyField);
            System.out.println("Ход противника:");
            Checker.chekShot(GameHelper.playerField, Ai.aiShot());


        }
        System.out.println("The end");


    }
}

