#include <stdio.h>

int main() {
  int n, i;
  double price, sumMoney, total = 0.0;
  int count; 
  
  printf("Enter the number of items: ");
  scanf("%d", &n);

  i = 1;

  while (i <= n) {
    printf("Enter price and count for item %d: ", i);
    scanf("%lf %d", &price, &count);

    sumMoney = price * count;
    total += sumMoney;
    printf("Item %d: Count = %d, Price = %.2lf\n", i, count, price);
    i++;
  }

  printf("Total sum: %.2lf\n", total);

  return 0;
}
