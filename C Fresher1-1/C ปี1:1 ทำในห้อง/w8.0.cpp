#include <stdio.h>

int main() {
    int num1, num2, num3, makKaoi, noiKaoi;

    printf("Enter num (1): ");
    scanf("%d", &num1);
    printf("Enter num (2): ");
    scanf("%d", &num2);
    printf("Enter num (3): ");
    scanf("%d", &num3);

    if (num2 >= num1 && num2 >= num3) {
        makKaoi = num2;
    } else if (num1 >= num2 && num1 >= num3) {
        makKaoi = num1;
    } else {
        makKaoi = num3;
    }

    // NoiKaoi
    if (num2 <= num1 && num2 <= num3) {
        noiKaoi = num2;
    } else if (num1 <= num2 && num1 <= num3) {
        noiKaoi = num1;
    } else {
        noiKaoi = num3;
    }

    // Output
    printf("MakKaoi: %d\n", makKaoi);
    printf("NoiKaoi: %d\n", noiKaoi);
}
