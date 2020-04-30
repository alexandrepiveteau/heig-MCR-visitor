package ch.heigvd.mcr.visitor.house.rooms;

import ch.heigvd.mcr.visitor.house.Visitor;

public class Bedroom extends SurfacedRoom {

  public Bedroom() {
    super(18.0);
  }

  public Messiness getMessiness() {
    return Messiness.SuperClean;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
