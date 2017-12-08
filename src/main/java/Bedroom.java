import java.util.ArrayList;

public class Bedroom extends Room {

    private int number;

    public Bedroom(int capacity, RoomType roomType, double rate, int number){
        super(capacity, roomType, rate);
        this.number = number;
    }

    public int getRoomNumber() {
        return number;
    }
}
