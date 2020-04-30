package ch.heigvd.mcr.visitor.house.rooms;

import ch.heigvd.mcr.visitor.house.Room;

public abstract class SurfacedRoom implements Room {

  private final double surface;

  public SurfacedRoom(double surface) {
    this.surface = surface;
  }

  public double getSurface() {
    return surface;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName();
  }
}
