public enum RoomType {

    BEDROOM("Bedroom"),
    CONFERENCEROOM("Conference Room");

    private final String type;

    RoomType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }


}
