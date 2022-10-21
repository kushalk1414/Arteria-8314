import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Bird extends Animal{
  private static Logger LOGGER = LoggerFactory.getLogger(Animal.class);


  public Bird(final String name) {
    super(name);
    this.movementType = " flies";
  }

  public abstract void feed();

  public abstract Object birth();


}
