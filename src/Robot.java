

public class Robot {
    private static final int NORTH = 0, EAST = 1, SOUTH = 2, WEST = 3;
    private int direction;
    private int id;
    private Position position;
    public Robot() {
        position = new Position(0,0);
        direction = NORTH;
    }
    public void right() {
        direction++;
        if (direction == 4) {
            direction = 0;
        }
        System.out.println("direction: "+this);
    }
    public void left() {
        direction--;
        if (direction == -1) {
            direction = 3;
        }
        System.out.println("direction: "+this);
    }
    public void forward() {
        int y = position.getY();
        int x = position.getX();
        if (direction == NORTH) {
            y++;
        } else if (direction == SOUTH) {
            y--;
        } else if (direction == EAST) {
            x++;
        } else if (direction == WEST) {
            x--;
        }
        if ((x >= 0 && x <= 5) && (y >= 0 && y <= 5)) {
            position.setX(x);
            position.setY(y);
            System.out.println("moved: " + this);
        }else{
            System.out.println("cannot move: " + this);
        }
    }
    public void setPosition(int x, int y) {
        this.position = new Position(x, y);
    }
    public void setDirection(String direction) {
        if(direction.equalsIgnoreCase("north")){
            this.direction = 0;
        }else if(direction.equalsIgnoreCase("east")){
            this.direction = 1;
        }else if(direction.equalsIgnoreCase("south")){
            this.direction = 2;
        }else if(direction.equalsIgnoreCase("west")){
            this.direction = 3;
        }
    }
    public String getDirection() {
        return direction == 0 ? "NORTH" : direction == 1 ? "EAST" : direction == 2 ? "SOUTH" : "WEST" ;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Robot "+this.id+" to "+this.position.getX()+","+this.position.getY()+","+this.getDirection();
    }
}