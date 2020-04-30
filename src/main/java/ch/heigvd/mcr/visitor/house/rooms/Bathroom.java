package ch.heigvd.mcr.visitor.house.rooms;

import ch.heigvd.mcr.visitor.house.Visitor;

public class Bathroom extends SurfacedRoom {

  private Messiness messiness = Messiness.SuperClean;

  public Bathroom() {
    super(12.0);
  }

  public Messiness getMessiness() {
    return messiness;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void clean() {
    this.messiness = Messiness.SuperClean;
    System.out.println("bathroom > The bathroom was just cleaned.");
  }

  public void use() {
    if (this.messiness == Messiness.SuperClean) {
      this.messiness = Messiness.Clean;
    } else {
      this.messiness = Messiness.Dirty;
    }
    System.out.println("bathroom > The bathroom is now " + this.messiness + ".");
  }
}
