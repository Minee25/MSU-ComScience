#include <stdio.h>

int main() {
  int n, thin = 0, healthy = 0, fat = 0, sumPrice = 0;

  printf("N: ");
  scanf("%d", &n);
  int weight[n];

  for (int i = 0; i < n; i++) {
    printf("Weight: ");
    scanf("%d", &weight[i]);
  }

  // {40, 64, 75, 43, 91 }
  // 40 64 75 43 91
  // output
  printf("\n");
  printf("Weight\tGroup\tVat\n");
  for (int i = 0; i < n; i++) {
    if (weight[i] >= 1 && weight[i] <= 45) { 
      printf("%d\tThin\t", weight[i]);
      printf("%d\n", 15);
      thin += 1;
    } else if (weight[i] >= 45 && weight[i] <= 65) { 
      printf("%d\tHealthy\t", weight[i]);
      printf("%d\n", 12);
      healthy += 1;
    } else if (weight[i] >= 65) {
      printf("%d\tFat\t", weight[i]);
      printf("%d\n", weight[i] * 5);
      fat += weight[i];
    }
  }

  sumPrice = (thin * 15) + (healthy * 12) + (fat * 5);

  printf("--------------------\n");

  printf("Thin\t%d bath\n", thin * 15);
  printf("Healthy\t%d bath\n", healthy * 12);
  printf("Fat\t%d bath\n", fat * 5);
  printf("SUM\t%d bath\n", sumPrice);

  return 0;
}
