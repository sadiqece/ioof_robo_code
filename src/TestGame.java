public class TestGame {
    public static void main(String args[]) throws Exception {
        runTest1();
        runTest2();
        runTest3();
        runTest4();
        runTest5();
    }
    private static void runTest1() {
        System.out.println("####### TEST1 BEGIN ######");
        Game game = new Game();
        Table table = new Table();
        String[] commands = {"PLACE 0,0,NORTH","MOVE", "REPORT"};
        game.runCommands(table,commands);
        System.out.println("####### TEST1 END ######\n");
    }
    private static void runTest2() {
        System.out.println("####### TEST2 BEGIN ######");
        Game game = new Game();
        Table table = new Table();
        String[] commands = {"PLACE 0,0,NORTH", "LEFT","REPORT"};
        game.runCommands(table,commands);
        System.out.println("####### TEST2 END ######\n");
    }
    private static void runTest3() {
        System.out.println("####### TEST3 BEGIN ######");
        Game game = new Game();
        Table table = new Table();
        String[] commands = {"PLACE 1,2,EAST","MOVE", "MOVE","LEFT", "MOVE", "REPORT"};
        game.runCommands(table,commands);
        System.out.println("####### TEST3 END ######\n");
    }
    private static void runTest4() {
        System.out.println("####### TEST4 BEGIN ######");
        Game game = new Game();
        Table table = new Table();
        String[] commands = {"PLACE 5,5,EAST","MOVE", "LEFT","PLACE 1,1,EAST", "MOVE","Robot 2", "MOVE", "REPORT"};
        game.runCommands(table,commands);
        System.out.println("####### TEST4 END ######\n");
    }

    private static void runTest5() {
        System.out.println("####### TEST5 BEGIN ######");
        Game game = new Game();
        Table table = new Table();
        String[] commands = {"PLACE 5,6,EAST","MOVE", "LEFT","PLACE 1,1,EAST", "MOVE","Robot 10", "MOVE", "REPORT"};
        game.runCommands(table,commands);
        System.out.println("####### TEST5 END ######\n");
    }
}