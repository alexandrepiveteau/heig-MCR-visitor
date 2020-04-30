package ch.heigvd.mcr.visitor.house;

public interface Room {

  Messiness getMessiness();

  double getSurface();

  void accept(Visitor visitor);

  enum Messiness {
    SuperClean,
    Clean,
    Dirty,
  }
}
