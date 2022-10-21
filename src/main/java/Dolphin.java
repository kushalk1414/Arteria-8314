import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Dolphin extends Mammal implements Showtime {
  private static Logger LOGGER = LoggerFactory.getLogger(Dolphin.class);
  public Dolphin(final String name) {
    super(name);
    this.movementType = " swims";
  }

  @Override
  public void practice() {
    if (energy > 0 && isHealthy) {
      LOGGER.info(name + movementType + " & practices its moves");
      energy--;
      regulatetemp(+2);
    } else {
      exhaustion();
    }
  }

  @Override
  public void perform() {
    if (energy > 0 && energy < 6 && isHealthy) {
      LOGGER.info(name + " performs the show well");
      energy--;
      regulatetemp(2);
    } else if (energy > 6) {
      LOGGER.info(name + "is gaining weight needs to practice");
      energy--;
      regulatetemp(2);
    } else {
      exhaustion();
    }
  }


}
