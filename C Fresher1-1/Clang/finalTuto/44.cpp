#include <stdio.h>

int main() {
  int n, pap = 0;

  printf("N: ");
  scanf("%d", &n);

  while (n > 10) {
    printf("Incorrect!! Please input again...\n");
    printf("N: ");
    scanf("%d", &n);
  }
  int number[n];

  for (int i = 0; i < n; i++) {
    printf("Number: ");
    scanf("%d", &pap);
    if (pap >= 0 && pap <= 20) {
      number[i] = pap;
    } else {
      printf("Incorrect!! Please input again...\n");
      i--;
    }
  }

  // output
  for (int i = 0; i < n; i++) {
    printf("%d ", number[i]);
  }

  printf("\n\n");
  // star row sleep
  for (int i = 0; i < n; i++) {
    printf("%d) ", i);
    for (int j = 0; j < number[i]; j++) {
      printf("*");
    }
    printf("\n");
  }
 
  return 0;
}