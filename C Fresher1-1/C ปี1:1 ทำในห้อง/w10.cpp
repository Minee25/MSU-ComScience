#include <stdio.h>

int main() {
    int num = 0, sum;

    while (num != 11 && num != 99){
        sum += num;
        printf("Num: ");
        scanf("%d", &num);
    }
    printf("%d", sum);
}
