
public class CityClock {

    private int utcZeroTime;
    private int utcOffset;

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
