import java.util.Scanner;

public class Game {
    public static void main(String args[]) {
        Game main = new Game();
        main.start();
    }
    private void start() {
        Scanner scanner = new Scanner(System.in);
        Table table = new Table();
        try {
            System.out.println("Please input a line");
            while (true) {
                String line = scanner.nextLine();
                runCommand(table, line);
            }
        } catch (Exception e) {
            System.err.println("ending session !");
        }
    }
    public void runCommands(Table table, String lines[]) {
        for(String line:lines){
            runCommand(table, line);
        }
    }
    public void runCommand(Table table, String line) {
        try {
            line = line.toLowerCase();
            if (line != null && !line.isEmpty()) {
                if (line.startsWith("place")) {
                    String[] split = line.split("\\s+");
                    String[] splits2 = split[1].split(",");
                    int x = Integer.valueOf(splits2[0]);
                    int y = Integer.valueOf(splits2[1]);
                    String face = splits2[2];
                    if ((x >= 0 && x <= 5) && (y >= 0 && y <= 5) &&
                            (face.equals("north") || face.equals("east") || face.equals("south") || face.equals("west"))) {
                        Robot robot = new Robot();
                        robot.setDirection(face);
                        robot.setPosition(x, y);
                        table.addRobot(robot);
                    } else {
                        System.out.println("cannot add new robot: "+line);
                    }
                } else if (line.startsWith("move")) {
                    table.move();
                } else if (line.startsWith("robot")) {
                    String[] split = line.split("\\s+");
                    table.makeRobotActive(Integer.valueOf(split[1]));
                } else if (line.startsWith("left")) {
                    table.left();
                } else if (line.startsWith("right")) {
                    table.right();
                } else if (line.startsWith("report")) {
                    table.report();
                }
            }
        }catch (Exception e){
            System.out.println("not a valid command: "+line);
        }
    }

}