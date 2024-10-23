#include <stdio.h>

int main() {
  int unit, price, total = 0, discount = 0;
  char member;

  printf(">> ");
  scanf("%d", &unit);
  printf(">> ");
  scanf("%d", &price);
  printf(">> ");
  scanf(" %c", &member);

  total = unit * price;

  if (member == 'Y' || member == 'y') {
    if (total <= 500) {
      discount = total * 10 / 100;
    } else if (total > 500 && total < 1000) {
      discount = total * 15 / 100;
    } else {
      discount = total * 20 / 100;
    }
  } else if (member == 'N' || member == 'n') {
    if (total <= 500) {
      discount = total * 5 / 100;
    } else if (total > 500 && total < 1000) {
      discount = total * 10 / 100;
    } else {
      discount = total * 15 / 100;
    }
  } else {
    printf("ERROR");
  }

  printf("Total: %d\n", total);
  printf("Discount: %d\n", discount);
  printf("Amount: %d\n", total -( total-  discount));

  return 0;
}