public class PhoneClock extends Clock {
    private HotelWorldClockSystem hotelWorldClockSystem;
    private int time;

    public PhoneClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public void setTime(int time) {
        this.time = time;
        if(this.hotelWorldClockSystem == null) return;
        for (CityClock cityClock : this.hotelWorldClockSystem.getClocks()){
            cityClock.setUtcZeroTime(time - this.utcOffset);
        }
    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }

    public int getTime() {
        return this.time;
    }
}
