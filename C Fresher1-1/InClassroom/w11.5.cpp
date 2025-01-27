#include <stdio.h>

int main() {
    int year, age = 0, childCount = 0, youngCount = 0, adultCount = 0, oldCount = 0, pay = 0;

    printf("Year: ");
    scanf("%d", &year);

    while (year <= 2567) {
        age = 2567 - year;
        if (age < 12) {
            printf("Child\n");
            childCount += 1;
        }
        else if (age >= 12 && age <= 18) {
            printf("Young\n");
            youngCount += 1;
        }
        else if (age >= 19 && age <= 59) {
            printf("Adult\n");
            adultCount += 1;
        }
        else {
            printf("Old\n");
            oldCount += 1;
        }

        printf("Year: ");
        scanf("%d", &year);
    }

    pay = childCount * 7500 + youngCount * 5000 + adultCount * 1500 + oldCount * 6000;

    printf("\n");
    printf("Child: %d\n", childCount);
    printf("Young: %d\n", youngCount);
    printf("Adult: %d\n", adultCount);
    printf("Old: %d\n", oldCount);
    printf("Pay: %d\n", pay);

    return 0;
}
