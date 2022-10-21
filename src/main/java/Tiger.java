import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tiger extends Mammal{
  private static Logger LOGGER = LoggerFactory.getLogger(Animal.class);

  public Tiger(final String name) {
    super(name);
  }

  @Override
  public void examine() {
    if (isAlive) {
      LOGGER.info(name + " examines the cage. " + (cageClosed ? name + " goes back." : name + " tries has escaped"));

    }
  }

  //public void attack(){
  //Zoo.dolphin.isAlive = false;
  //animal.energy = 0;
  //animal.isHealthy = false;
 // }
}
