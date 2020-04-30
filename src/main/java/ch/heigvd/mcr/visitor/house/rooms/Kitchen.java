package ch.heigvd.mcr.visitor.house.rooms;

import ch.heigvd.mcr.visitor.house.Visitor;

public class Kitchen extends SurfacedRoom {

  private int biscuits = 1;

  public Kitchen() {
    super(25.0);
  }

  public boolean eat() {
    System.out.println("kitchen > There are " + biscuits + " biscuits remaining.");
    if (biscuits > 0) {
      biscuits--;
      return true;
    }
    return false;
  }

  public Messiness getMessiness() {
    return Messiness.Clean;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
