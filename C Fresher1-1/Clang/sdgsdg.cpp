#include <stdio.h>

int main() {
  char size;
  float price = 0, cost = 0, cost2 = 0, sumCost = 0, profit = 0, add = 0,
        milk = 0;

  printf("Enter size (s/m/l): ");
  scanf(" %c", &size);

  printf("Milk added? (y/n): ");
  scanf("%f", &milk);
  
  if (milk <= 0) {
    milk = 0;
  }

  add = milk * 5;

  if (size == 's') {
    price = 15;
    cost = price * 65.50 / 100;
    cost2 = milk * 3;
    sumCost = cost + cost2;
    price += add;
    profit = price - sumCost;
  } else if (size == 'm') {
    price = 20;
    cost = price * 70.25 / 100;
    cost2 = add * 3;
    sumCost = cost + cost2;
    price += add;
    profit = price - sumCost;
  } else if (size == 'l') {
    price = 20;
    cost = price * 70.25 / 100;
    cost2 = add * 3;
    sumCost = cost + cost2;
    price += add;
    profit = price - sumCost;
  } else {
    printf("No Size\n");
    return 0;
  }

  // Print results
  printf("Price: %.2f, \nCost: %.2f, \nProfit: %.2f\n", price, sumCost, profit);

  return 0;
}
