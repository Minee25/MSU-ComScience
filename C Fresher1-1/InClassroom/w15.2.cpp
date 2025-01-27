#include <stdio.h>

int returnZoon() {
    return 0;
}

int main() {
    int n = 8, num = 0, a = 0, b = 0, binary[n] = {};

    printf("> ");
    scanf("%d", &num);

    a = num;
    for (int i = 0; i < n; i++) {
        b = a % 2;
        a = a / 2;
        // printf("%d\t%d\n", a, b);
        binary[i] = b;
    }

    printf("\n%d\n", num);
    printf("To Binary:\n");

    for (int i = n-1; i >= 0; i--) {
        printf("%d ", binary[i]);
    }


    return returnZoon();
}
