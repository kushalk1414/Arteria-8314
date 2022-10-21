import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlightlessBird extends Bird{
  private static Logger LOGGER = LoggerFactory.getLogger(Mammal.class);

  public FlightlessBird(final String name) {
    super(name);
    this.movementType = " runs";
  }

  @Override
  public void animalType() {
    LOGGER.info(name + " is an animal of type: " + getClass().getSuperclass().getSuperclass().getSimpleName());
  }
}
