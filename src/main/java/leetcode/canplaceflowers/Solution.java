package leetcode.canplaceflowers;

class Solution {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int canPlaceCount = 0;

    if (flowerbed[0] == 0) {
      if (flowerbed.length == 1 || flowerbed[1] == 0) {
        flowerbed[0] = 1;
        canPlaceCount++;
      }
    }

    for (int i = 1; i < flowerbed.length - 1; i++) {
      if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
        flowerbed[i] = 1;
        canPlaceCount++;
      }
    }

    if (flowerbed[flowerbed.length - 1] == 0 && flowerbed.length != 1) {
      if (flowerbed[flowerbed.length - 2] == 0) {
        canPlaceCount++;
      }
    }

    return (canPlaceCount >= n) ? true : false;
  }
}
