import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mammal extends Animal{
  private static Logger LOGGER = LoggerFactory.getLogger(Mammal.class);
  public int bodytemp = 36;
  public Mammal(final String name) {
    super(name);
  }

  public void regulatetemp(int tempChange){
        bodytemp += tempChange;
        if(bodytemp > 47 || bodytemp < 12){
          unstableTemp();
          isHealthy = false;
        }

  }

  @Override
  public void examine() {
    super.examine();
    regulatetemp(1);
  }

  @Override
  public void moves() {
    super.moves();
    regulatetemp(3);
  }

  public void rest(){
    energy = 4;
    bodytemp = 36;
  }

  public void unstableTemp(){
      LOGGER.info(name+ "'" + "s body temperature is too high or too low....." + name + " needs to rest");
      energy = 0;
      isHealthy = false;
  }
}
