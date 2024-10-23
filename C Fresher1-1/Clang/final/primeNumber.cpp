#include <stdio.h>

int main() {
  int n;
  printf("N: ");
  scanf("%d", &n);
  int input[n];

  for (int i = 0; i < n; i++) {
    printf("Number: ");
    scanf("%d", &input[i]);
  }

  // Output
  for (int i = 0; i < n; i++) {
    if (input[i] % input[i] == 0 && input[i] % 2 == 1) {
      printf("%d Is prime\n", input[i]);
    } else {
      printf("%d\n", input[i]);
    }
  }

  return 0;
}