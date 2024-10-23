#include <stdio.h>

int main() {
  int n, sumWeight = 0, min = 0, max = 0, moreThanAvg = 0;
  float avg = 0;
  printf("N: ");
  scanf("%d", &n);
  int weight[n];

  for (int i = 0; i < n; i++) {
    printf("Weight: ");
    scanf("%d", &weight[i]);
  }

  // loop for sum
  for (int i = 0; i < n; i++) {
    sumWeight += weight[i];
  }

  // Average
  avg = (float)sumWeight / n;

  // find min max
  min = weight[0]; 
  max = weight[0];
  for (int i = 0; i < n; i++) {
    if (weight[i] > max) {
      max = weight[i];
    }
    if (weight[i] < min) {
      min = weight[i];
    }
  }

  // find more than average
  for (int i = 0; i < n; i++) {
    if (weight[i] > avg) {
      moreThanAvg += 1;
    }
  }

  // output
  printf("Max: %d\n", max);
  printf("Min: %d\n", min);
  printf("Avg: %.2f\n", avg);
  printf("More than average: %d\n", moreThanAvg);

  return 0;
}