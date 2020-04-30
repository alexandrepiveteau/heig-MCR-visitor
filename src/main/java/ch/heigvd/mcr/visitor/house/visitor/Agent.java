package ch.heigvd.mcr.visitor.house.visitor;

import ch.heigvd.mcr.visitor.house.Visitor;
import ch.heigvd.mcr.visitor.house.rooms.Bathroom;
import ch.heigvd.mcr.visitor.house.rooms.Bedroom;
import ch.heigvd.mcr.visitor.house.rooms.Kitchen;

public class Agent implements Visitor {

  private double surface;

  @Override
  public void visit(Bathroom bathroom) {
    surface += bathroom.getSurface() / 2;
  }

  @Override
  public void visit(Bedroom bedroom) {
    surface += bedroom.getSurface();
  }

  @Override
  public void visit(Kitchen kitchen) {
    surface += kitchen.getSurface();
  }

  public void announceSurface() {
    System.out.println("agent > What a nice house of " + surface + " square meters !");
  }
}
