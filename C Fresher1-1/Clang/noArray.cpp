#include <stdio.h>

int main() {
  int i = 1, n, sum = 1;

  printf("> ");
  scanf("%d", &n);

  if (n >= 1 && n <= 10) {
    while (i <= n) {
      sum = sum * 2;
      i = i + 1;
    }
    printf("%d", sum);
  } 
  
  return 0;
}
