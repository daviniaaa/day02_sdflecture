package sg.edu.nus.iss;

public class MountainBike extends Bicycle {
    
    public int seatHeight;

    public MountainBike() {
    }

    public MountainBike(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        // return "MountainBike [seatHeight=" + seatHeight + "]";
        // super.toString() calls the parent class toString details too
        return super.toString() + "\nSeat Height=" + seatHeight;
    }

    
    
}
