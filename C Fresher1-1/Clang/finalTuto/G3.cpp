#include <stdio.h>

int Zero() { return 0; }

int main() {
  int group1 = 0, group2 = 0, group3 = 0, n = 0, money = 0;

  printf("N: ");
  scanf("%d", &n);
  float ageCow[n];

  for (int i = 0; i < n; i++) {
    printf("Age Cow: ");
    scanf("%f", &ageCow[i]);
  }

  for (int i = 0; i < n; i++) {
    if (ageCow[i] < 0.5) {
      group1 += 1;
    } else if (ageCow[i] >= 0.5 && ageCow[i] <= 1.5) {
      group2 += 1;
    } else {
      group3 += 1;
    }
  }

  money = (group1 * 15000) + (group2 * 25000) + (group3 * 31500);

  // output 0.4 0.5 0.9 1.2 2
  printf("Dead (Lower than 0.5): %d\n", group1);
  printf("Dead (Between 0.5 - 1.5): %d\n", group2);
  printf("Dead (More than 1.5): %d\n", group3);
  printf("เงินชดเชย: %d\n", money); 

  return Zero();
}