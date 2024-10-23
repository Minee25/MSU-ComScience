#include <stdio.h>

int main() {
  int fac = 1, n;

  printf("> ");
  scanf("%d", &n);

  while (n > 0) {
    fac = fac * n;
    printf("%d*", n);
    n = n - 1;
  }

  printf("\b = %d", fac);
}