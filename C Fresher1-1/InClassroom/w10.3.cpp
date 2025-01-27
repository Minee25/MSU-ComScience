#include <stdio.h>

int main() {
    int n, price, itemCount, pay, sumPay;

    printf("Round: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++) {
        printf("\nCount: ");
        scanf("%d", &itemCount);
        printf("Price: ");
        scanf("%d", &price);

        printf("Count Item: %d\n", itemCount);
        printf("Price Item: %d\n", price);
        pay = itemCount * price;
        sumPay += pay;
    }
    printf("Pay: %d\n", sumPay);

}
