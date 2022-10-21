import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Animal {
  private static Logger LOGGER = LoggerFactory.getLogger(Animal.class);

  public boolean cageClosed;

  public String name;
  public boolean isHealthy;
  public boolean isAlive;
  public int energy = 4;
  public String movementType = "runs";

  public Animal(final String name) {
    this.name = name;
    this.cageClosed = true;
    this.isHealthy = true;
    this.isAlive = true;
  }


  public abstract void feed();

  public void examine() {
    if (isAlive) {
      LOGGER.info(name + " examines the cage. " + (cageClosed ? name + " goes back." : name + " has escaped"));
    }
  }

  public void moves(){

    if(energy > 0 && isHealthy){
      LOGGER.info(name + movementType + " around");
      energy--;
    }
    else {
      exhaustion();
    }
  }

  public void animalType(){
    LOGGER.info(name + " is an animal of type: " + getClass().getSuperclass().getSimpleName());
  }

  public void animalIsDead(){
    LOGGER.info(name +" is dead.");
  }

  public void exhaustion(){
    energy = 0;
    LOGGER.info(name + " is exhausted....please feed " + name);
  }

  public void rest(){
    energy = 4;
    isHealthy = true;
  }
}
