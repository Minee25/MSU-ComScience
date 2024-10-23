#include <stdio.h>

int main() {
    char name[10];
    char lastname[10];
    int money;
    float gpax;
    char grade;
    int number;

    // input
    printf("Enter your name: ");
    scanf("%s", &name);

    printf("Enter your last name: ");
    scanf("%s", &lastname);

    printf("Enter your money: ");
    scanf("%d", &money);

    printf("Enter your need gpax: ");
    scanf("%f", &gpax);

    printf("Enter your need grade: ");
    scanf(" %c", &grade);

    printf("Enter number: ");
    scanf("%d", &number);

    // Output
    printf("\n\n");
    printf("Good morning %s %s, how are you to day?\n", name, lastname);
    printf("I have money %d bath\n", money);
    printf("I need GPAX %.2f for this therm.\n", gpax);
    printf("Please grade %c for me? %d\n", grade, number);



}
