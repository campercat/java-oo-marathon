public abstract class Automobile {
  private String type;
  private String model;
  private String make;
  private int mpg;
  private int fuelCapacity;
  private boolean running;
  private boolean inService;

  public Automobile(String type, String model, String make, int mpg, int fuelCapacity) {
    this.type = type;
    this.model = model;
    this.make = make;
    this.mpg = mpg;
    this.fuelCapacity = fuelCapacity;
    this.running = true;
    this.inService = true;
  }

  public String getType() {
    return type;
  }

  public String getModel() {
    return model;
  }

  public String getMake() {
    return make;
  }

  public int getMpg() {
    return mpg;
  }

  public int getFuelCapacity() {
    return fuelCapacity;
  }

  public boolean isRunning() {
    return running;
  }

  public void setRunning(boolean running) {
    this.running = running;
  }

  public void toggleEngine() {
    this.running = !this.running;
  }

  public boolean isInService() {
    return inService;
  }

  public void setInService(boolean inService) {
    this.inService = inService;
  }

  public void repair() {
    this.inService = true;
  }

  public abstract void companyGreeting();
}
