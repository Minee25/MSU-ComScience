#include <stdio.h>

int main() {
  int n;
  char pap;

  printf("N >> ");
  scanf("%d", &n);
  char letter[n];

  // input
  for (int i = 0; i < n; i++) {
    printf(">> ");
    scanf(" %c", &letter[i]);
  }

  // z to a
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      if (letter[i] > letter[j]) {
        pap = letter[i];
        letter[i] = letter[j];
        letter[j] = pap;
      }
    }
  }

  // output
  for (int i = 0; i < n; i++) {
    printf("%c ", letter[i]);
  }

  return 0;
}