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
        testBedroom = new Bedroom(2, 90.0, 18, RoomType.SINGLE);
        testConference = new ConferenceRoom(50, 500.0, "The Bilderberg Room");
        testGuest = new Guest("Charlie");
    }

    @Test
    public void canGetBedroomStuff(){
        assertEquals(2, testBedroom.getCapacity());
        assertEquals(0, testBedroom.getGuestCount());
        assertEquals("Single Bedroom", testBedroom.getRoomType().getType());
        assertEquals(90.0, testBedroom.getRate(), 0.1);
        assertEquals(18, testBedroom.getRoomNumber());
    }

    @Test
    public void canGetConferenceStuff(){
        assertEquals(50, testConference.getCapacity());
        assertEquals(0, testConference.getGuestCount());
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

    @Test
    public void cantOverfillRoom(){
        testBedroom.addGuest(testGuest);
        testBedroom.addGuest(testGuest);
        testBedroom.addGuest(testGuest);
        assertEquals(testBedroom.getGuestCount(), 2);
    }

    @Test
    public void canRemoveFromRoom(){
        testBedroom.addGuest(testGuest);
        testBedroom.addGuest(testGuest);
        testBedroom.removeGuest(testGuest);
        assertEquals(testBedroom.getGuestCount(), 1);
        testConference.addGuest(testGuest);
        testConference.addGuest(testGuest);
        testConference.removeGuest(testGuest);
        assertEquals(testConference.getGuestCount(), 1);
    }





}
