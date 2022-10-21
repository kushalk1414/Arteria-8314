import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bird extends Animal{
  private static Logger LOGGER = LoggerFactory.getLogger(Animal.class);


  public Bird(final String name) {
    super(name);
    this.movementType = " flies";
  }
}
