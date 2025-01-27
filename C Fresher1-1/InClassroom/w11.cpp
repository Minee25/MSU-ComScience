#include <stdio.h>

int main() {
    int num = 0, evenCount = 0, oddCount = 0;
    for (int i = 1; i <= 5; i++) {
        printf("Enter number: ");
        scanf("%d", &num);
        if (num % 2 == 0) {
            printf("%d is Even\n", num);
            evenCount += 1;
        } else {
            printf("%d is Odd\n", num);
            oddCount += 1;
        }
    }
    printf("Even count is: %d\n", evenCount);
    printf("Odd count is: %d\n", oddCount);

    return 0;
}
