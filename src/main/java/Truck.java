public class Truck extends Automobile {
  private int bedLengthFeet;
  private int bedWidthFeet;
  private int containerHeightFeet;
  private int currentLoadCubicFeet;

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet) {
    super(type, model, make, mpg, fuelCapacity);
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    this.setRunning(false);
    this.setInService(false);
    this.containerHeightFeet = 3;
  }

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet, int containerHeightFeet) {
    this(type, model, make, mpg, fuelCapacity, bedLengthFeet, bedWidthFeet);
    this.containerHeightFeet = containerHeightFeet;
  }

  public int getBedLengthFeet() {
    return bedLengthFeet;
  }

  public int getBedWidthFeet() {
    return bedWidthFeet;
  }

  public int getContainerHeightFeet() {
    return containerHeightFeet;
  }

  public int getCurrentLoadCubicFeet() {
    return currentLoadCubicFeet;
  }

  public int volumeCapacity() {
    return this.containerHeightFeet*this.bedWidthFeet*this.bedLengthFeet;
  }

  public boolean addCargo(int newLoadCubicFeet) {
    if(newLoadCubicFeet + currentLoadCubicFeet <= this.volumeCapacity()) {
      this.currentLoadCubicFeet += newLoadCubicFeet;
      return true;
    }
    return false;
  }

  public void emptyCargo() {
    this.currentLoadCubicFeet = 0;
  }

  public void companyGreeting() {
    System.out.println("Thank you for shipping with gÜber.");
  }
}
