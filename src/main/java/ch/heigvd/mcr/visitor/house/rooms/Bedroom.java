package ch.heigvd.mcr.visitor.house.rooms;

import ch.heigvd.mcr.visitor.house.Visitor;

public class Bedroom extends HouseRoom {

  public Bedroom() {
    super(18.0);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
