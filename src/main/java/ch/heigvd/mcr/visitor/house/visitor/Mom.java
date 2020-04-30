package ch.heigvd.mcr.visitor.house.visitor;

import ch.heigvd.mcr.visitor.house.Room;
import ch.heigvd.mcr.visitor.house.Room.Messiness;
import ch.heigvd.mcr.visitor.house.Visitor;
import ch.heigvd.mcr.visitor.house.rooms.Bathroom;
import ch.heigvd.mcr.visitor.house.rooms.Bedroom;
import ch.heigvd.mcr.visitor.house.rooms.Kitchen;

public class Mom implements Visitor {

  private void visitAndShout(Room room) {
    if (room.getMessiness() == Messiness.Dirty) {
      System.out.println("mom > YOUR " + room.toString().toUpperCase() + " IS DIRTY !!!");
    }
  }

  public void visit(Bathroom bathroom) {
    visitAndShout(bathroom);
    bathroom.clean();
  }

  public void visit(Bedroom bedroom) {
    visitAndShout(bedroom);
  }

  public void visit(Kitchen kitchen) {
    visitAndShout(kitchen);
  }
}
