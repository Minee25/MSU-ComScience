#include <stdio.h>

int main() {
    int bonusFather;
    float moneyChildren, moneyMother;
    printf("Enter bonus father: ");
    scanf("%d", &bonusFather);
    moneyMother = (float) 30/100 * bonusFather;
    moneyChildren = (bonusFather - moneyMother) / 3;
    printf("Money mother: %.2f\n", moneyMother);
    printf("Money children; %.2f\n", moneyChildren);
    return 0;
}
