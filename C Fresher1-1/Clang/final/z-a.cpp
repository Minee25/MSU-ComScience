#include <stdio.h>

int main() {
  char letter[5] = {'F', 'A', 'D', 'B', 'C'};
  char pap;

  printf("Before: ");
  for (int i = 0; i < 6; i++) {
    printf("%c ", letter[i]);
  }
  char letter[5] = {'E', 'D', 'A', 'C', 'B'}, pap;

  for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
      if (letter[i] < letter[j]) {
        pap = letter[i];
        letter[i] = letter[j];
        letter[j] = pap;
      }
    }
  }

  printf("\nAfter:  ");
  for (int i = 0; i < 5; i++) {
    printf("%c ", letter[i]);
  }

  return 0;
}