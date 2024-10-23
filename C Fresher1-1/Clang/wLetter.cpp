#include <stdio.h>
int main() {
  int n = 0, center = 0, i = 1, j = 1;
  printf("input Number : ");
  scanf("%d", &n);
  if (n % 2 == 0) {
    center = n / 2;
  } else {
    center = n / 2 + 1;
  }
  // n = 5
  // center 3
  while (i <= n) { // 4
    j = 1;
    while (j <= n) {  // 
      if (j == 1) {
        printf("*");
      } else if (j == n) {
        printf("*");
      } else if (j == i && i >= center) {
        printf("*");
      } else if (j + i == n + 1 && i >= center) {
        printf("*");
      } else {
        printf(" ");
      }
      j++;
    }
    printf("\n");
    i++;
  }

  return 0;
} 