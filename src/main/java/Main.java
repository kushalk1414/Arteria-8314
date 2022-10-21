public class Main {
  public static void main(String[] args) {

  Parrot bree = new Parrot("bree");
  Kiwi tea = new Kiwi("tea");
  Ant mico = new Ant("mico");
  Tiger dee = new Tiger("dee");
  Dolphin delphi = new Dolphin("delphi");
  Butterfly pox = new Butterfly("pox");
  Zoo bavaria = new Zoo("bavaria", dee, delphi, bree, tea, mico, pox );

    bree.feed();
    bree.feed();bree.feed();
    bree.feed();
    bree.feed();
    final int energy = bree.energy;
    System.out.println(energy);


  }

}
