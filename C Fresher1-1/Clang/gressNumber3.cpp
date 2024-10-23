#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  int random = 0, input, max = 100, min = 1;  // 49

  srand(time(NULL));
  random = (rand() % 100) + 1;  // 30

  while (input != random) {
    printf("%d - %d\n", min, max);
    printf("Input: ");
    scanf("%d", &input);  // 50

    if (input == random) {
      printf("You win!\n");
      printf("Answer is %d\n", random); 
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