#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  int min = 1, max = 100, random, input;

  srand(time(0));
  random = (rand() % max) + 1;

  while (true) {
    printf("\n%d to %d\n", min, max);
    printf("Number: ");
    scanf("%d", &input);

    if (input == random) {
      printf("Answer is %d\n", random);
      printf("Your win!");
      break;
    } else if (input > random) {
      if (input < max) {
        max = input - 1;
      }
    } else if (input < random) {
      if (input > min) {
        min = input + 1;
      }
    }
  }

  return 0;
}
