#include <stdio.h>

int main() {
    int num1;
    int num2;

    // input
    printf("Enter num(1): ");
    scanf("%d", &num1);

    printf("Enter num(2): ");
    scanf("%d", &num2);

    // process

    int sumPlus = num1 + num2;
    int sumMinus = num1 - num2;
    int sumMultiply = num1 * num2;
    float sumDivided = float(num1) / float(num2);
    int sumModulus = num1 % num2;

    printf("\n\n===============\n\n");
    printf("Plus: %d + %d = %d\n", num1, num2, sumPlus);
    printf("Minus: %d - %d = %d\n", num1, num2, sumMinus);
    printf("Multiply: %d * %d = %d\n", num1, num2, sumMinus);
    printf("Divided: %d / %d = %.2f\n", num1, num2, sumDivided);
    printf("Modulus: %d %% %d = %d\n", num1, num2, sumModulus);
}
