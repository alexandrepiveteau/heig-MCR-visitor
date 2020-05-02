package ch.heigvd.mcr.visitor.house.rooms;

import ch.heigvd.mcr.visitor.house.Visitor;

public class Bathroom extends HouseRoom {

  public Bathroom() {
    super(12.0);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void clean() {
    setMessiness(Messiness.SuperClean);
    System.out.println("bathroom > The bathroom was just cleaned.");
  }

  public void use() {
    setMessiness(getMessiness().dirtier());
    System.out.println("bathroom > The bathroom is now " + getMessiness() + ".");
  }
}
