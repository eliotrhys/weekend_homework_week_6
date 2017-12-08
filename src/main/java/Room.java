import java.util.ArrayList;

public class Room {

    private int capacity;
    private ArrayList<Guest> guests;
    private double rate;


    public Room(int capacity, double rate){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.rate = rate;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getGuestCount(){
        return guests.size();
    }

    public double getRate() {
        return rate;
    }

    public void addGuest(Guest guest){
        if (getGuestCount() < capacity){
        guests.add(guest);}
    }

    public void removeGuest(Guest guest){
        guests.remove(guest);
    }
}
