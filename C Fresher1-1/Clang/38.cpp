#include <stdio.h>

int main() {
  int money, ten = 0, five = 0, two = 0, one = 0;

  printf(">> ");
  scanf("%d", &money);

  printf("Money: %d", money);
  while (money > 0) {
    if (money >= 10) {
      ten += 1;
      money -= 10;
    } else if (money >= 5) {
      five += 1;
      money -= 5;
    } else if (money >= 2) {
      two += 1;
      money -= 2;
    } else {
      one += 1;
      money -= 1;
    }
  }

  printf("\nเหรียญ 10 = %d\n", ten);
  printf("เหรียญ 5 = %d\n", five);
  printf("เหรียญ 2 = %d\n", two);
  printf("เหรียญ 1 = %d\n", one);

  return 0;
}