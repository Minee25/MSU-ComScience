#include <stdio.h>

int main() {
  int size=10;

  for (int i = 0; i < size ; i++) {
    for (int k = 0; k < size; k++) {
      if (k == i || k == size - i - 1) {
        printf("*");
      } else {
        printf(" ");
      }
    }
    printf("\n");
  }

  return 0;
}