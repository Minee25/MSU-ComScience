#include <stdio.h>

int main() {
    int rice, riceTotal, bag;

    // Input
    printf("Enter rice total (kg): ");
    scanf("%d", &rice);

    // Process
    riceTotal = rice % 10;
    bag = (rice - riceTotal) / 10;

    // Output
    printf("Bag total: %d\n", bag);
    printf("Rice total: %d\n", riceTotal);

    return 0;
}
