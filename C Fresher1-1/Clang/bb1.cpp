#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
  char input[15];
  int num1 = 0, sum = 0;

  while (true) {
    printf("Input Number: ");
    scanf("%s", &input);

    if (strcmp("exit", input) == 0) {
      printf("Exit program");
      break;
    } else {
      num1 = atoi(input); 
      if (!isdigit(num1)) {
        sum += num1;
      } else {
        printf("Try again!\n");
      }
    }
  }

  printf("Sum: %d", sum);

  return 0;
}