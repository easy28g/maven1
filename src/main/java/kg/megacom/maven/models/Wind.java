package kg.megacom.maven.models;

public class Wind {
    public String direction;
    public int speed;

    public Wind(String direction, int speed) {
        this.direction = direction;
        this.speed = speed;
    }

    public Wind() {
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "direction='" + direction + '\'' +
                ", speed=" + speed +
                '}';
    }
}

