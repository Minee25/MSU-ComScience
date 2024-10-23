#include <stdio.h>

int main() {
  int height = 10;
  
  for (int i =1; i <= height; i++) {
    for (int j = 1; j <= height - i; j++) {
      printf(" ");
    }
    for (int k = 1; k <= 2*i - 1; k++) {
      printf("*");
    }
    printf("\n");
  }
  for (int i = 1; i <= height -1; i++) {
    for (int j = 1; j < height; j++) {
      printf(" ");
    }
    printf("*\n");
  }


  return 0;
}