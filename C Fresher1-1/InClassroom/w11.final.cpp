#include <stdio.h>


int main() {
    int weight, sumS = 0, sumM = 0, sumL = 0;
    float pay = 0;

    printf("Weight: ");
    scanf("%d", &weight);

    while (weight >= 1 && weight <= 100) {
        if (weight < 30) {
            sumS++;
        }
        else if (weight >= 30 && weight <= 45) {
            sumM++;
        }
        else {
            sumL++;
        }
        printf("Weight: ");
        scanf("%d", &weight);
    }
    pay = sumS * 3.25 + sumM * 4 + sumL *4.50;

    printf("Sum size S: %d\n", sumS);
    printf("Sum size M: %d\n", sumM);
    printf("Sum size L: %d\n", sumL);
    printf("Pay: %.2f\n", pay);
    return 0;
}
