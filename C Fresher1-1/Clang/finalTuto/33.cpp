#include <stdio.h>

int Zero() { return 0; }

int main() {
  char letter[26] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                     'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                     'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
  char find;

  printf(">> ");
  scanf(" %c", &find);

  for (int i = 0; i < 26; i++) {
    printf("%c ", letter[i]);
  }

  printf("\n");
  for (int i = 0; i < 26; i++) {
    if (find == letter[i]) {
      printf("%c อยู่ที่ %d", letter[i], i+1);
    }
  }

  return Zero();
}