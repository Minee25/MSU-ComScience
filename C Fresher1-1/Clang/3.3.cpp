#include <stdio.h>

int main() {
  int mom, result = 0, i = 1;
  printf("> ");
  scanf("%d", &mom);

  while (i <= 12) {
    result = mom * i;
    printf("%d * %d = %d\n", mom, i, result);
    i++;
  }
}