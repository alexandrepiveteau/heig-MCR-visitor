package ch.heigvd.mcr.visitor.house.rooms;

import ch.heigvd.mcr.visitor.house.Room;

public abstract class HouseRoom implements Room {

  private final double surface;
  private Messiness messiness;

  public HouseRoom(double surface) {
    this.surface = surface;
    this.messiness = Messiness.SuperClean;
  }

  protected void setMessiness(Messiness messiness) {
    this.messiness = messiness;
  }

  @Override
  public Messiness getMessiness() {
    return this.messiness;
  }

  @Override
  public double getSurface() {
    return surface;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName();
  }
}
