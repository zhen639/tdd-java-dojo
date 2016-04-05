public class CityClock extends Clock {
    private int utcZeroTime;

    public CityClock(int Offset) {
        this.utcOffset = Offset;
    }

    public int getTime() {
        return (this.utcOffset + this.utcZeroTime + 24) % 24;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
