package Planes;

import java.util.Objects;
import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane {

  private ExperimentalTypes type;
  private ClassificationLevel classificationLevel;

  public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
      ExperimentalTypes type, ClassificationLevel classificationLevel) {
    super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    this.type = type;
    this.classificationLevel = classificationLevel;
  }

  public ClassificationLevel getClassificationLevel() {
    return classificationLevel;
  }

  @Override
  public String toString() {
    return "experimentalPlane{" +
        "model='" + getModel() + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    ExperimentalPlane that = (ExperimentalPlane) o;
    return type == that.type &&
        classificationLevel == that.classificationLevel;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), type, classificationLevel);
  }
}
