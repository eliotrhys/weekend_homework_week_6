import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private String name;

    public ConferenceRoom(int capacity, RoomType roomType, double rate, String name){
        super(capacity, roomType, rate);
        this.name = name;
    }

    public String getRoomName() {
        return name;
    }


}
