package leetcode.canplaceflowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanplaceflowersTest {

  Solution sol;
  int[] flowerbed;
  int n;
  boolean expected;


  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void canPlaceFlowers() {
    flowerbed = new int[]{1, 0, 0, 0, 1};
    n = 1;
    expected = true;

    assertEquals(expected, sol.canPlaceFlowers(flowerbed, n));
  }

  @Test
  void canPlaceFlowers2() {
    flowerbed = new int[]{1, 0, 0, 0, 1};
    n = 2;
    expected = false;

    assertEquals(expected, sol.canPlaceFlowers(flowerbed, n));
  }

  @Test
  void canPlaceFlowers3() {
    flowerbed = new int[]{1, 0, 0, 0, 1, 0, 0};
    n = 2;
    expected = true;

    assertEquals(expected, sol.canPlaceFlowers(flowerbed, n));
  }

  @Test
  void canPlaceFlowers4() {
    flowerbed = new int[]{1};
    n = 0;
    expected = true;

    assertEquals(expected, sol.canPlaceFlowers(flowerbed, n));
  }

  @Test
  void canPlaceFlowers5() {
    flowerbed = new int[]{0, 0, 1, 0, 1};
    n = 1;
    expected = true;

    assertEquals(expected, sol.canPlaceFlowers(flowerbed, n));
  }

  @Test
  void canPlaceFlowers6() {
    flowerbed = new int[]{1, 0, 0, 0, 1, 0, 0};
    n = 2;
    expected = true;

    assertEquals(expected, sol.canPlaceFlowers(flowerbed, n));
  }

  @Test
  void canPlaceFlowers7() {
    flowerbed = new int[]{0, 0, 1, 0, 0};
    n = 1;
    expected = true;

    assertEquals(expected, sol.canPlaceFlowers(flowerbed, n));
  }
}