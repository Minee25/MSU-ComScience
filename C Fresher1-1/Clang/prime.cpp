#include <stdio.h>

int main() {
  int n;
  printf("Input round: ");
  scanf("%d", &n);
  int number[n];

  for (int i = 0; i < n; i++) {
    printf("Input: ");
    scanf("%d", &number[i]);
  }

  for (int i = 0; i < n; i++) {
    int prime = 1;

    if (number[i] <= 1) {
      prime = 0;
    }

    for (int j = 2; j < number[i]; j++) {
      if (number[i] % j == 0) {
        prime = 0;
        break;
      }
    }

    if (prime == 1) {
      printf("%d is prime number\n", number[i]);
    } else {
      printf("%d\n", number[i]);
    }
  }

  return 0;
}