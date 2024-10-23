#include <stdio.h>

int main() {
  int input, even = 0, odd = 0;

  printf(">> ");
  scanf("%d", &input);

  while (input != 0) {
    if (input % 2 == 0) {
      even += 1;
    } else {
      odd += 1;
    }

    printf(">> ");
    scanf("%d", &input);
  }

  printf("Even: %d\n", even);
  printf("Odd: %d\n", odd);

  return 0;
}