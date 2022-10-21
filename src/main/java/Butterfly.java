import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class Butterfly extends Insect{
  public Butterfly(final String name) {
    super(name);
  }
  private static Logger LOGGER = LoggerFactory.getLogger(Animal.class);

  @Override
  public void feed() {
    if (isAlive) {
      energy++;
      if (energy > 13) {
        LOGGER.info(name + " gives birth to another butterfly");
        birth();
      } else {
        LOGGER.info(name + " flies to eat the worms");
      }
    }
  }

  public Butterfly birth(){
    Scanner scanner = new Scanner(System.in);
    String babyName = scanner.nextLine();
    LOGGER.info("a new butterfly " + babyName + " is born ");
    return new Butterfly(babyName);
  }
}
