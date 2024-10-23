#include <stdio.h>

int main() {
  char command = ' ', radius = 0, length = 0, width = 0, base = 0, height = 0;

  while (command != 'x' && command != 'X') {
    printf("=====[command]=====\n");
    printf("[C] Circle\n");
    printf("[R] Rectangle\n");
    printf("[T] Triangle\n");
    printf("[X] Exit\n");
    printf("\n>> ");
    scanf("%s", &command);
    command = command;

    if (command == 'c' || command == 'C') {
      printf("Circle Menu\n");
      printf("\nRaduis: ");
      scanf("%d", &radius);
      printf("%.2f\n", (float)3.14 * (radius * radius));
    } else if (command == 'r' || command == 'R') {
      printf("Rectangle\n");
      printf("\nLength: ");
      scanf("%d", &length);
      printf("\nLength: ");
      scanf("%d", &width);
      printf("%d\n", length * width);
    } else if (command == 't' || command == 'T') {
      base = 0;
      height = 0;
      printf("Triangle\n");
      printf("\nHeight: ");
      scanf("%d", &height);
      printf("\nBase: ");
      scanf("%d", &base);
      printf("%.2f\n", (float)1 / 2 * (base * height));
    } else if (command == 'x' || command == 'X') {
      printf("Exited!");
    } else {
      printf("No choice...\n");
    }
  }

  return 0;
}
