import java.util.ArrayList;

public class Room {

    private int capacity;
    private ArrayList<Guest> guests;
    private RoomType roomType;
    private double rate;


    public Room(int capacity, RoomType roomType, double rate){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.roomType = roomType;
        this.rate = rate;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getGuestCount(){
        return guests.size();
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double getRate() {
        return rate;
    }

    public void addGuest(Guest guest){
        guests.add(guest);
    }
}
