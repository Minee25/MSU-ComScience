#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
  char num[15];
  int num1 = 0, sum = 0;
  bool stats = true;
  for (int i = 0; stats; i++) {
    printf("Input Number: ");
    scanf("%s", num);
    num1 = atoi(num);
    if (strcmp("exit", num) == 0) {
      stats = false;
      break;
    } else if (isdigit(num1)) {
      printf("Not invalid Plase try again!\n");
    } else {
      sum += num1;
    }
  }
  printf("%d", sum);

  return 0;
}

// *
// **
// ***
// ****
// *****
// ******
// *******
// ********