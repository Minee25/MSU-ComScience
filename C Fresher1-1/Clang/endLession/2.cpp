#include <stdio.h>

int main() {
  int n = 6;
  char letter[] = {'A', 'B', 'C', 'D', 'E', 'F'}, find;

  printf(">> ");
  scanf("%c", &find);

  for (int i = 0; i < n; i++) {
    printf("%c ", letter[i]);
  }

  printf("\n");
  for (int i = 0; i < n; i++) {
    if (find == letter[i]) {
      printf("%c at %d", letter[i], i);
    }
  }
}