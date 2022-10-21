import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
  }

