import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Ant extends Insect{
  public Ant(final String name) {
    super(name);
  }
  private static Logger LOGGER = LoggerFactory.getLogger(Animal.class);

  @Override
  public void feed() {
      if (isAlive) {
        energy++;
        if (energy > 13) {
          LOGGER.info(name + " gives birth to another ant");
          birth();
        } else {
          LOGGER.info(name + " crawls to eat the sweets");
        }
    }
  }

  public Ant birth(){
    Scanner scanner = new Scanner(System.in);
    String babyName = scanner.nextLine();
    LOGGER.info("a new butterfly " + babyName + " is born ");
    return new Ant(babyName);
  }
}
