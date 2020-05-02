package ch.heigvd.mcr.visitor.house.rooms;

import ch.heigvd.mcr.visitor.house.Visitor;

public class Kitchen extends HouseRoom {

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

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
