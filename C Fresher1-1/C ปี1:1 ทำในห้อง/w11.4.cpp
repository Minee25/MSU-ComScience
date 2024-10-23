#include <stdio.h>

int main() {
    int weight = 0, poorHealth = 0, goodHealth = 0, overHealth = 0;

    printf("Weight: ");
    scanf("%d", &weight);
    while (weight >= 1 && weight <= 15) {
        if (weight >= 1 && weight <= 4) {
            printf("POOR HEALTH\n");
            poorHealth += 1;
        }
        else if (weight >= 5 && weight <= 10) {
            printf("GOOD HEALTH\n");
            goodHealth += 1;
        }
        else if (weight >= 6 && weight <= 15) {
            printf("OVER HEALTH\n");
            overHealth += 1;
        }
        printf("Weight: ");
        scanf("%d", &weight);
    }

    printf("Poor Health: %d\n", poorHealth);
    printf("Good Health: %d\n", goodHealth);
    printf("Over Health: %d\n", overHealth);

    return 0;
}
