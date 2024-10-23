#include <stdio.h>

int main() {
  int sum = 0, n;

  printf("> "); 
  scanf("%d", &n);

  while (n != -9999) {
    printf("> "); 
    sum = sum + n;
    scanf("%d", &n);
  }
  printf("%d", sum);

  return 0;
}