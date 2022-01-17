package Test;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Ship[][] playerField = new Ship[12][12];
        Ship[][] enemyField = new Ship[12][12];


        System.out.println("Press any key to start:");
        String anykey = scanner.nextLine();


        Ai.createAiShips(enemyField);
        GameHelper.showField(enemyField);
        while (!anykey.equals("stop")){
            Checker.chekShot(enemyField, User.shot());
            GameHelper.showField(enemyField);
        }



//        while (enemy.checkField(playerField)){
//            //enemy.shoot();
//            enemy.chekShot(playerField,enemy.shoot());
//            deck.showField(playerField);
//        }

    }
}

