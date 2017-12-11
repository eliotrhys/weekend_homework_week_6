import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel(){
        this.rooms = new ArrayList<>();
    }

    public void addRooms(Room room){
        rooms.add(room);
    }

    public int countRooms(){
        return rooms.size();
    }

    public void addGuestToRoom(Room room, Guest guest){
        room.addGuest(guest);
    }

    public int getEmptyRooms(){
        ArrayList<Room> emptyRooms = new ArrayList<>();

        for (int i = 0; i < countRooms(); i++){
            Room room = rooms.get(i);


            if (room.getGuestCount() == 0){
                emptyRooms.add(room);
            }
        }
        return emptyRooms.size();
    }

}
