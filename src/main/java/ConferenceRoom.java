public class ConferenceRoom extends Room{

    private String name;

    public ConferenceRoom(int capacity, double rate, String name){
        super(capacity, rate);
        this.name = name;
    }

    public String getRoomName() {
        return name;
    }


}
