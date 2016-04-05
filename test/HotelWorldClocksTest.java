import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelWorldClocksTest {
    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time(){

        CityClock londonClock = new CityClock(0);
        PhoneClock phoneClock = new PhoneClock(8);
        phoneClock.setCityClock(londonClock);
        phoneClock.setTime(9);
        assertEquals(1, londonClock.getTime());
    }

    @Test
    public void the_time_of_clock_NewYork_should_be_20_after_the_phone_clock_is_set_to_9_Beijing_time(){
        CityClock newYorkClock = new CityClock(-5);
        PhoneClock phoneClock = new PhoneClock(8);
        phoneClock.setCityClock(newYorkClock);
        phoneClock.setTime(9);
        assertEquals(20, newYorkClock.getTime());
    }

    @Test
    public void the_time_of_clock_NewYork_and_London_should_be_20_and_1_after_the_phone_clock_is_set_to_9_Beijing_time(){
        PhoneClock phoneClock = new PhoneClock(8);
        CityClock newYorkClock = new CityClock(-5);
        CityClock londonClock = new CityClock(0);
        HotelWorldClockSystem hotelWorldClockSystem = new HotelWorldClockSystem();
        hotelWorldClockSystem.attach(londonClock);
        hotelWorldClockSystem.attach(newYorkClock);

        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);
        assertEquals(20, newYorkClock.getTime());
        assertEquals(1, londonClock.getTime());
    }
}
