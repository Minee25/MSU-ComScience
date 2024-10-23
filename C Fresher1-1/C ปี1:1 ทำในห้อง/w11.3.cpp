#include <stdio.h>

int main() {
    int num = 0, e = 0, o = 0, i = 1;

    printf("Num: ");
    scanf("%d", &num);
    while (num >= 0) {
        if (num % 2 == 0) {
            printf("%d is Even\n", num);
        } else {
            printf("%d is Odd\n", num);
        }
        printf("Num: ");
        scanf("%d", &num);
    }

    printf("Even: %d\n", e);
    printf("Odd: %d\n", o)
}
