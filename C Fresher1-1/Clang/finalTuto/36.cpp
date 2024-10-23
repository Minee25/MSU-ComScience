#include <stdio.h>

int main() {
  int number[] = {};

  for (int i = 0; i < 3; i++) {
    printf(">> ");
    scanf("%d", &number[i]);
  }
  
  // 4 5 6

  const char* order = "neither"; // Default to neither
  if (number[0] < number[1] && number[1] < number[2]) {
    order = "increasing";
  } else if (number[0] > number[1] && number[1] > number[2]) {
    order = "decreasing";
  }
  printf("%d %d %d = %s", number[0], number[1], number[2], order);

  return 0;
}
