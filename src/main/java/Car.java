public class Car extends Automobile {
  private int capacity;
  private int numPassengers;

  public Car(String type, String model, String make, int mpg, int fuelCapacity, int capacity, int numPassengers) {
    super(type, model, make, mpg, fuelCapacity);
    this.capacity = capacity;
    this.numPassengers = numPassengers;
    this.setRunning(false);
  }

  public int getCapacity() {
    return capacity;
  }

  public int getNumPassengers() {
    return numPassengers;
  }

  public boolean addPassengers(int newPassengers) {
    if(this.numPassengers + newPassengers <= this.capacity) {
      this.numPassengers += newPassengers;
      return true;
    } else {
      return false;
    }
  }

  public void exitPassengers(int exitPassengers) {
    if(exitPassengers > this.numPassengers) {
      this.numPassengers = 0;
    } else {
      this.numPassengers -= exitPassengers;
    }
  }
}
