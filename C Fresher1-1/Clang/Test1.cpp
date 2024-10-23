#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  int min=1, random=0, max=100, input=0;
  
  srand(time(0));
  random = (rand() % max) + 1;
  printf("%d", random);

  while (true) {
    printf("\n%d to %d\n", min, max);
    printf("Enter Number : ");
    scanf("%d", &input);
    if (input == random) {
      printf("\nAnswer : %d\n", random);
      printf("You win bro fucking God dump shit!!\n");
      break;
    } else if (input > random) {
      if (input < max) {
        max = input - 1;
      }
    } else if (input < random){
      if (input > min) {
        min = input + 1;
      }
    }
  }
}
