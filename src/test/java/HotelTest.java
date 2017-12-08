import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel testHotel;
    Bedroom testBedroom;
    ConferenceRoom testConference;
    Guest testGuest;
    Guest testGuest2;

    @Before
    public void before(){
        testHotel = new Hotel();
        testBedroom = new Bedroom(2, 90.0, 18, RoomType.SINGLE);
        testConference = new ConferenceRoom(50, 500.0, "The Bilderberg Room");
        testGuest = new Guest("Charlie");
        testGuest2 = new Guest("McSworley");
    }

    @Test
    public void canAddRooms(){
        testHotel.addRooms(testBedroom);
        testHotel.addRooms(testConference);
        assertEquals(testHotel.countRooms(), 2);
    }

    @Test
    public void canAddGuestToRoom(){
        testHotel.addRooms(testBedroom);
        testHotel.addGuestToRoom(testBedroom, testGuest);
        testHotel.addGuestToRoom(testBedroom, testGuest);
        testHotel.addGuestToRoom(testBedroom, testGuest);
        assertEquals(testBedroom.getGuestCount(), 2);
    }

//    @Test
//    public void canSearchForGuest(){
//        testHotel.addRooms(testBedroom);
//        testHotel.addGuestToRoom(testBedroom, testGuest);
//        testHotel.addGuestToRoom(testConference, testGuest2);
//        assertEquals(testHotel.guestsInRoom(), "Charlie");
//        assertEquals(testHotel.guestsInRoom(), "McSworley");
//    }



//    @Test
//    public void canFindEmptyRoom(){
//        testHotel.addRooms(testBedroom);
//        testHotel.addRooms(testConference);
//        testHotel.addGuestToRoom(testConference, testGuest);
//        testHotel.addGuestToRoom(testConference, testGuest);
//        testHotel.getEmptyRooms();
//        assertEquals(testHotel.getEmptyRooms(), 1);
//    }

}
