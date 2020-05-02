package ch.heigvd.mcr.visitor.house;

public interface Room {

  void accept(Visitor visitor);

  enum Messiness {
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
