#include <stdio.h>

int main() {
    char gender, *genderFull;
    int weight, service;
    float discount, pay;

    printf("Enter your gender (M/F): ");
    scanf(" %c", &gender);
    printf("Enter your wright (KG): ");
    scanf("%d", &weight);
    printf("Enter your service: ");
    scanf("%d", &service);

    if (gender == 'm' || gender == 'M') {
        genderFull = "Male";
        if (weight > 80) {
            discount = service * 0.5;
            pay = service - discount;
            printf("Your gender is: %s\n", genderFull);
            printf("Discount: %.2f\n", discount);
            printf("Have to Pay: %.2f\n", pay);
        } else if (weight >= 10 && weight <= 80) {
            discount = service * 0.25;
            pay = service - discount;
            printf("Your gender is: %s\n", genderFull);
            printf("Discount: %.2f\n", discount);
            printf("Have to Pay: %.2f\n", pay);
        } else {
            printf("Not in the conditions!");
        }
    } else if (gender == 'f' || gender == 'F') {
        genderFull = "Female";
        if (weight > 60) {
            discount = service * 0.75;
            pay = service - discount;
            printf("Your gender is: %s\n", genderFull);
            printf("Discount: %.2f\n", discount);
            printf("Have to Pay: %.2f\n", pay);
        } else if (weight >= 10 && weight <= 60) {
            discount = service * 0.45;
            pay = service - discount;
            printf("Your gender is: %s\n", genderFull);
            printf("Discount: %.2f\n", discount);
            printf("Have to Pay: %.2f\n", pay);
        } else {
            printf("Not in the conditions!");
        }
    } else {
        printf("Gender Invalid");
    }
}
