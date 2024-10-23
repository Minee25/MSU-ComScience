#include <stdio.h>

int main() {
  int num1, num2, num3, sum;
  float result;

  printf("Number (1): ");
  scanf("%d", &num1);
  printf("Number (2): ");
  scanf("%d", &num2);
  printf("Number (3): ");
  scanf("%d", &num3);

  sum = num1 + num2 + num3;

  if (sum > 30) {
    result = (float)sum / 3;
    printf("Avg: %.2f", result);
  } else {
    printf("Sum: %d", sum);
  }

  return 0;
}
