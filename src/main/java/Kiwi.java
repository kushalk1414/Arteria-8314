import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Kiwi extends FlightlessBird {
  private static Logger LOGGER = LoggerFactory.getLogger(Parrot.class);

  public Kiwi(final String name) {
    super(name);
  }

  @Override
  public void animalType() {
    super.animalType();
  }
  public void feed(){
    if (isAlive) {
      energy++;
      if (energy > 7) {
        LOGGER.info(name + " is fed but needs to exercise");
      }else if (energy > 9){
        birth();
      }
      else {
        LOGGER.info(name + " pecks at the food with its beak");
      }
    }
  }

  public Kiwi birth(){
    Scanner scanner = new Scanner(System.in);
    String babyName = scanner.nextLine();
    System.out.println("give name to the baby.");
    LOGGER.info("a new " + getClass().getSimpleName() + " " + babyName + " is born ");
    energy -=7;
    return new Kiwi(babyName);
  }
}


