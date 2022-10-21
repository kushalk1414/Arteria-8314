import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Parrot extends Bird implements Showtime{

  private static Logger LOGGER = LoggerFactory.getLogger(Parrot.class);

  public Parrot(final String name) {
    super(name);
    this.energy = 5 ;
  }

  @Override
  public void practice() {

    if(energy > 0){
      LOGGER.info(name + movementType + " & practices its moves");
      energy--;
    }else {
      exhaustion();
    }
  }

  @Override
  public void perform() {
    if (energy > 0 && energy < 6) {
        LOGGER.info(name + " performs the show well");
      energy--;
      } else if (energy > 6){
        LOGGER.info(name + "is gaining weight needs to practice");
      energy--;
      }else {
      exhaustion();
    }
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

    public Parrot birth(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("give name to the baby.");
      String babyName = scanner.nextLine();
      LOGGER.info("a new " + getClass().getSimpleName() + " " + babyName + " is born ");
      energy -=7;
      return new Parrot(babyName);
    }
  }

