#include <stdio.h>

int main() {
  char Size, Color;
  int sWhite = 0, sBlack = 0, mWhite = 0, mBlack = 0, lWhite = 0, lBlack = 0,
      allMoney = 0;

  while (true) {
    printf("\033[0;33mSize: ");
    scanf(" %c", &Size);
    printf("\033[0m");

    printf("\033[0;32mColor: ");
    scanf(" %c", &Color);
    printf("\033[0m");

    if (Size == 's' || Size == 'S') {
      if (Color == 'w' || Color == 'W') {
        sWhite += 1;
        allMoney += 50;
      } else if (Color == 'b' || Color == 'B') {
        sBlack += 1;
        allMoney += 55;
      } else {
        break;
      }
    } else if (Size == 'm' || Size == 'M') {
      if (Color == 'w' || Color == 'W') {
        mWhite += 1;
        allMoney += 70;
      } else if (Color == 'b' || Color == 'B') {
        mBlack += 1;
        allMoney += 75;
      } else {
        break;
      }
    } else if (Size == 'l' || Size == 'L') {
      if (Color == 'w' || Color == 'W') {
        lWhite += 1;
        allMoney += 100;
      } else if (Color == 'b' || Color == 'B') {
        lBlack += 1;
        allMoney += 125;
      } else {
        break;
      }
    } else {
      break;
    }
  }

  // Output
  printf("\n");
  printf("Size:\tS\tM\tL\n");
  printf("==============================\n");
  printf("White:\t%d\t%d\t%d\n", sWhite, mWhite, lWhite);
  printf("Black:\t%d\t%d\t%d\n", sBlack, mBlack, lBlack);
  printf("==============================\n");
  printf("All Money: %d", allMoney);

  return 0;
}