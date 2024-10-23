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
    int is_prime = 1;  // Assume number is prime

    if (input[i] <= 1) {
      is_prime = 0;  // 0 and 1 are not prime numbers
    }

    for (int j = 2; j < input[i]; j++) { // 3
      if (input[i] % j == 0) {
        is_prime = 0;  // Not prime if divisible by any j 
        break;
      }
    }

    if (is_prime == 1) {
      printf("%d Is prime\n", input[i]);
    } else {
      printf("%d\n", input[i]);
    }
  }

  return 0;
}
