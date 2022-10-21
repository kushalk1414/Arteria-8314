import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Insect extends Animal {
  private static Logger LOGGER = LoggerFactory.getLogger(Animal.class);
  public String foodItem = "sugar cane stick";

  public Insect(final String name) {
    super(name);
  }

  public abstract void feed();

  public abstract Object birth();
}
