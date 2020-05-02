package ch.heigvd.mcr.visitor.house;

import ch.heigvd.mcr.visitor.house.rooms.Room;

public class House {

  private final Room[] rooms;

  public House(Room... rooms) {
    this.rooms = new Room[rooms.length];
    System.arraycopy(rooms, 0, this.rooms, 0, rooms.length);
  }

  public void visit(Visitor visitor) {
    for (Visitable room : rooms) {
      room.accept(visitor);
    }
  }
}
