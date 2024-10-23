#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  int randomNumber = 0, input = 0, min = 1, max = 100;

  srand(time(NULL));
  randomNumber = (rand() % 100) + 1;  // สุ่มคำตอบ

  while (input != randomNumber) {
    printf("%d - %d\n", min, max);
    printf("Number: ");
    scanf("%d", &input);

    if (input == randomNumber) {
      printf("You win\n"); 
    } else if (input > randomNumber) {
      if (input < max) {
        max = input - 1;
      }
    } else if (input < randomNumber) {
      if (input > min) {
        min = input + 1;
      }
    }
  }

  return 0;
}