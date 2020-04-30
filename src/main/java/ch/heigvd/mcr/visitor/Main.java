package ch.heigvd.mcr.visitor;

import ch.heigvd.mcr.visitor.house.House;
import ch.heigvd.mcr.visitor.house.rooms.Bathroom;
import ch.heigvd.mcr.visitor.house.rooms.Bedroom;
import ch.heigvd.mcr.visitor.house.rooms.Kitchen;
import ch.heigvd.mcr.visitor.house.visitor.Agent;
import ch.heigvd.mcr.visitor.house.visitor.Kid;
import ch.heigvd.mcr.visitor.house.visitor.Mom;

public class Main {

  public static void main(String[] args) {
    House house = new House(new Bathroom(), new Bedroom(), new Kitchen());

    Mom mom = new Mom();
    Kid kid = new Kid();

    System.out.println("--- MOM VISIT #1 ---");
    house.visit(mom);

    System.out.println("--- KID VISIT #1 ---");
    house.visit(kid);

    System.out.println("--- KID VISIT #2 ---");
    house.visit(kid);

    System.out.println("--- MOM VISIT #2 ---");
    house.visit(mom);

    System.out.println("--- AGENT VISIT #1 ---");
    Agent agent = new Agent();
    house.visit(agent);
    agent.announceSurface();
  }
}
