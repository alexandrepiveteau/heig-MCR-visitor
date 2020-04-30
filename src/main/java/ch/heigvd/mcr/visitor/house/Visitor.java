package ch.heigvd.mcr.visitor.house;

import ch.heigvd.mcr.visitor.house.rooms.Bathroom;
import ch.heigvd.mcr.visitor.house.rooms.Bedroom;
import ch.heigvd.mcr.visitor.house.rooms.Kitchen;

public interface Visitor {

  void visit(Bathroom bathroom);

  void visit(Bedroom bedroom);

  void visit(Kitchen kitchen);
}
