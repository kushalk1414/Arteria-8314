import org.checkerframework.checker.units.qual.A;

public class Zoo {
  public String name;
  public Tiger tiger;
  public Dolphin dolphin;
  public Parrot parrot;
  public Kiwi kiwi;
  public Ant ant;
  public Butterfly butterfly;

  public Zoo(final String name,  Tiger tiger, final Dolphin dolphin, final Parrot parrot, final Kiwi kiwi, final Ant ant,
      final Butterfly butterfly) {
    this.name = name;
    this.tiger = tiger;
    this.dolphin = dolphin;
    this.parrot = parrot;
    this.kiwi = kiwi;
    this.ant = ant;
    this.butterfly = butterfly;
  }

  private String getName() {
    return name;
  }

  private Tiger getTiger() {
    return tiger;
  }

  private void setTiger(final Tiger tiger) {
    this.tiger = tiger;
  }

  private Dolphin getDolphin() {
    return dolphin;
  }

  private void setDolphin(final Dolphin dolphin) {
    this.dolphin = dolphin;
  }

  private Bird getParrot() {
    return parrot;
  }

  private void setParrot(final Parrot parrot) {
    this.parrot = parrot;
  }

  private Kiwi getKiwi() {
    return kiwi;
  }

  private void setKiwi(final Kiwi kiwi) {
    this.kiwi = kiwi;
  }

  private Ant getAnt() {
    return ant;
  }

  private void setAnt(final Ant ant) {
    this.ant = ant;
  }

  private Butterfly getButterfly() {
    return butterfly;
  }

  private void setButterfly(final Butterfly butterfly) {
    this.butterfly = butterfly;
  }
}

