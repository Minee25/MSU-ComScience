#include <stdio.h>

int main() {
    int i = 1, sum = 0, multiply;

    printf("Multiply: ");
    scanf("%d", &multiply);

    while (i <= 12) {
        sum = multiply * i;
        printf("%d x %d = %d\n", multiply, i, sum);
        i++;
    }
    return 0;
}
