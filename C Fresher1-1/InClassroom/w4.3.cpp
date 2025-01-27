#include <stdio.h>

int main() {
    int pen,penCount, penDozen , moneyTotal;

    // Input
    printf("Enter Pen: ");
    scanf("%d", &pen);

    // Process
    penCount = pen % 12;
    penDozen = (pen - penCount) / 12;
    moneyTotal = (penCount * 12) + (penDozen * 357);


    // Output
    printf("penDozen: %d\n", penDozen);
    printf("penCount: %d\n", penCount);
    printf("moneyTotal: %d\n", moneyTotal);

    return 0;
}
