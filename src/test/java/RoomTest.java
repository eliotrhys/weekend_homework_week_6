import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Bedroom testBedroom;
    ConferenceRoom testConference;
    Guest testGuest;


    @Before
    public void before(){
        testBedroom = new Bedroom(4, RoomType.BEDROOM, 90.0, 18);
        testConference = new ConferenceRoom(50, RoomType.CONFERENCEROOM, 500.0, "The Bilderberg Room");
        testGuest = new Guest();
    }

    @Test
    public void canGetBedroomStuff(){
        assertEquals(4, testBedroom.getCapacity());
        assertEquals(0, testBedroom.getGuestCount());
        assertEquals("Bedroom", testBedroom.getRoomType().getType());
        assertEquals(90.0, testBedroom.getRate(), 0.1);
        assertEquals(18, testBedroom.getRoomNumber());
    }

    @Test
    public void canGetConferenceStuff(){
        assertEquals(50, testConference.getCapacity());
        assertEquals(0, testConference.getGuestCount());
        assertEquals("Conference Room", testConference.getRoomType().getType());
        assertEquals(500.0, testConference.getRate(), 0.1);
        assertEquals("The Bilderberg Room", testConference.getRoomName());
    }

    @Test
    public void canAddToRooms(){
        testBedroom.addGuest(testGuest);
        testBedroom.addGuest(testGuest);
        assertEquals(testBedroom.getGuestCount(), 2);
        testConference.addGuest(testGuest);
        testConference.addGuest(testGuest);
        assertEquals(testConference.getGuestCount(), 2);
    }

}
