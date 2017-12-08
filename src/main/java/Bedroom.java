public class Bedroom extends Room {

    private int number;
    private RoomType roomType;

    public Bedroom(int capacity, double rate, int number, RoomType roomType){
        super(capacity, rate);
        this.number = number;
        this.roomType = roomType;
    }

    public RoomType getRoomType(){
        return roomType;
    }

    public int getRoomNumber() {
        return number;
    }
}
