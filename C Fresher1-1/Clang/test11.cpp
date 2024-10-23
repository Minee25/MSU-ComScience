#include <stdio.h>

int main() {
  int age=0, age18up=0;
  for (int i = 1; i <= 6; i++) {
    printf("Input age : ");
    scanf("%d", &age);
    if (age > 18) {
      age18up++;
    }
  }
  printf("\nAge 18 Up : %d", age18up);

  return 0;
}