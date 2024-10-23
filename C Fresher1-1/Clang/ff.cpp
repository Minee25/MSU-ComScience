#include <stdio.h>

int main() {
  int round;
  int num;
  
  printf("Round: ");
  scanf("%d", &round);

  int minToMax[round];

  for (int i = 0; i < round; i++) {
    printf("num: ");
    scanf("%d", &num);

    minToMax[i] = num;
  }

  for (int i = 0; i < round; i++) {
    printf("%d,", minToMax[i]);
  }
  printf("\b");
}