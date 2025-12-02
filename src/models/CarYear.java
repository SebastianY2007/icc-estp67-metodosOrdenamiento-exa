package models;

public class CarYear {
  private int year;
  private boolean isValid;

  public CarYear(int year, boolean isValid) {
    this.year = year;
    this.isValid = isValid;
  }

  public int getYear() {
    return year;
  }

  public boolean isValid() {
    return isValid;
  }

  @Override
  public String toString() {
    return "CarYear [year=" + year + ", isValid=" + isValid + "]";
  }
}
