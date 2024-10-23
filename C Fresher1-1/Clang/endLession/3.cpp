#include <stdio.h>

int Zero() { return 0; }

int main() {
  int n, pap = 0;

  printf("N (1-10) : ");
  scanf("%d", &n);

  while (n > 10 || n < 1) {
    printf("Incorrect!!\n");
    printf("N (1-10) : ");
    scanf("%d", &n);
  }

  int number[n];

  for (int i = 0; i < n; i++) {
    printf("Number (1-20) : ");
    scanf("%d", &pap);
    if (pap > 20 || pap < 0) {
      printf("Incorrect!! Please input again..\n");
      i--;
    } else {
      number[i] = pap;
    }
  }

  // output
  printf("\n----------\n");
  for (int i = 0; i < n; i++) {
    printf("%d ", number[i]);
  }

  printf("\n\n");
  for (int i = 0; i < n; i++) {
    printf("%d) ", i);
    for (int j = 0; j < number[i]; j++) {
      printf("*");
    }
    printf("\n");
  }

  return Zero();
}