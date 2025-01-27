#include <stdio.h>

int main() {
    int start, stop;

    printf("Start: ");
    scanf("%d", &start);
    printf("End: ");
    scanf("%d", &stop);

    if (start < stop) {
        while (start <= stop) {
            printf("%d\n", start);
            start += 1;
        }
    } else if (start > stop) {
        while (start >= stop) {
            printf("%d\n", start);
            start -= 1;
        }
    } else {
        printf("Equal");
    }
    return 0;
}

// start 10
// stop 4
// update -1
