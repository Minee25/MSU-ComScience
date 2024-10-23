#include <stdio.h>
int main() {
  int n, A, center;
  float median;
  printf("input Num :");
  scanf("%d", &n);
  int x[n];

  for (int i = 0; i < n; i++) {
    scanf("%d", &x[i]);
  }
  for (int i = 0; i < n; i++) {
    printf("%d\t", x[i]);
  }
  printf("\n");
  //  x = {'E', 'D', 'A', 'C', 'B'}

  for (int i = 0; i < n - 1; i++) {
    for (int i = 0; i < n - 1; i++) {
      if (x[i] > x[i + 1]) {
        A = x[i];
        x[i] = x[i + 1];
        x[i + 1] = A;
      }
    }
  }

  for (int i = 0; i < n; i++) {
    printf("%d\t", x[i]);
  }

  printf("\n");
  center = n / 2;

  if (n % 2 == 0) {
    median = (float)(x[center - 1] + x[center]) / 2;  // n==even
  } else {
    median = x[center];  // n==odd
  }
  printf("median = %.2f\n", median);

  return 0;
}