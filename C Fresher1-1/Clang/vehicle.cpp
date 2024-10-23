#include <stdio.h>

int main() {
  int n, car = 0, van = 0, truck = 0, error = 0, sum = 0, sumPrice = 0;
  printf("N: ");
  scanf("%d", &n);
  int weight[n];
  for (int i = 0; i < n; i++) {
    printf("Weight: ");
    scanf("%d", &weight[i]);
  }

  printf("\n");
  printf("ทางไว: Car\tVan\tTruck\tError\tSum\n");
  printf("=============================================\n");
  for (int i = 0; i < n; i++) {
    if (weight[i] < 3 || weight[i] > 20) {
      printf("%d :\t\t\t\t/\t\n", weight[i]);
      error += 1;
    } else if (weight[i] >= 3 && weight[i] <= 7) {
      printf("%d :\t/\t\t\t\t\n", weight[i]);
      car += 1;
      sumPrice += 155;
      sum += 1;
    } else if (weight[i] > 7 && weight[i] < 15) {
      printf("%d :\t\t/\t\t\t\n", weight[i]);
      van += 1;
      sumPrice += 175;
      sum += 1;
    } else if (weight[i] > 14 && weight[i] <= 20) {
      printf("%d:\t\t\t/\t\t\n", weight[i]);
      truck += 1;
      sumPrice += 210;
      sum += 1;
    }
  }
  printf("=============================================\n");
  printf("Count:\t%d\t%d\t%d\t%d\t%d\n", car, van, truck, error, sum);
  printf("Price:\t%d\t%d\t%d\t-\t%d\n", car * 125, van * 150, truck * 175, sumPrice);

  return 0;
}