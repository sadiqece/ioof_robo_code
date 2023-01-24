import java.util.HashMap;
import java.util.Map;

public class Table {
    private Map<Integer,Robot> robotMap = new HashMap<>();
    private Robot activeRobot;
    public void addRobot(Robot robot) {
        if(robotMap.isEmpty()) {
            this.activeRobot = robot;
        }
        int key = this.robotMap.size() + 1;
        robot.setId(key);
        robotMap.put(key,robot);
        System.out.println("added: "+robot);
    }
    public Robot getRobot(int id) {
        return robotMap.get(id);
    }
    public void makeRobotActive(int id) throws Exception {
        Robot robot = getRobot(id);
        if(robot != null){
            this.activeRobot = robot;
        }else{
            throw new Exception("cannot find the required robot");
        }
    }
    public void move() {
        activeRobot.forward();
    }

    public void left() {
        activeRobot.left();
    }

    public void right() {
        activeRobot.right();
    }
    public void report() {
        System.out.println("report: "+this.activeRobot);
    }
}
