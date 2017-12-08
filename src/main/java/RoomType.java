public enum RoomType {

    SINGLE("Single Bedroom"),
    DOUBLE("Double Bedroom");

    private final String type;

    RoomType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }


}
