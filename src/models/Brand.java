package models;

public class Brand {

  private String brandName;
  private CarModel[] models;

  public Brand(String brandName, CarModel[] models) {
    this.brandName = brandName;
    this.models = models;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public CarModel[] getModels() {
    return models;
  }

  public void setModels(CarModel[] models) {
    this.models = models;
  }

  public int getTotalValidYears() {
    int total = 0;

    if (models == null)
      return 0;

    for (CarModel model : models) {
      if (model.getYears() == null)
        continue;

      for (CarYear carYears : model.getYears()) {
        if (carYears.isValid()) {
          total++;
        }
      }
    }

    return total;
  }
}
