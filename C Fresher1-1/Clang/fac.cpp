#include <stdio.h>

int main() {
  // 5! = 5*4*3*2*1

  int n = 0, result = 1; // 120

  printf(">> ");
  scanf("%d", &n); // 5

  for (int i = 0; i < n; i++) { // 3
    printf("%d*", n-i);
    result *= n-i;
  }

  printf("\b = %d", result);
}