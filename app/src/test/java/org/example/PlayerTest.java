package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

  @Test
  public void testShowHp() {
    Player classUnderTest = new Player();
    assertEquals(30, classUnderTest.returnHp());
  }
}
