package ch.heigvd.mcr.visitor.house.rooms;

import ch.heigvd.mcr.visitor.house.Visitable;

public abstract class Room implements Visitable {

  private final double surface;
  private Messiness messiness;

  public Room(double surface) {
    this.surface = surface;
    this.messiness = Messiness.SuperClean;
  }

  public final Messiness getMessiness() {
    return this.messiness;
  }

  protected final void setMessiness(Messiness messiness) {
    this.messiness = messiness;
  }

  public final double getSurface() {
    return surface;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName();
  }

  public enum Messiness {
    SuperClean,
    Clean,
    Dirty,
    ;

    public Messiness dirtier() {
      int nextIndex = Math.min(Messiness.values().length - 1, ordinal() + 1);
      return Messiness.values()[nextIndex];
    }
  }
}
