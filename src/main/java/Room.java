import java.util.ArrayList;

public class Room {

    private int capacity;
    private ArrayList<Guest> guests;
    private RoomType roomType;
    private double rate;


    public Room(int Capacity, ArrayList guests){
        this.capacity = capacity;
        this.guests = guests;
        this.roomType = roomType;
        this.rate = rate;
    }

}
