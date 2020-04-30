package ch.heigvd.mcr.visitor.house.visitor;

import ch.heigvd.mcr.visitor.house.Visitor;
import ch.heigvd.mcr.visitor.house.rooms.Bathroom;
import ch.heigvd.mcr.visitor.house.rooms.Bedroom;
import ch.heigvd.mcr.visitor.house.rooms.Kitchen;

public class Kid implements Visitor {

  @Override
  public void visit(Bathroom bathroom) {
    bathroom.use();
  }

  @Override
  public void visit(Bedroom bedroom) {
  }

  @Override
  public void visit(Kitchen kitchen) {
    if (!kitchen.eat()) {
      System.out.println("kid > I'm hungry.");
    } else {
      System.out.println("kid > nom nom");
    }
  }
}
