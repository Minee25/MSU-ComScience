#include <stdio.h>

int main() {
    int year;
    char *text;

    printf("Your year: ");
    scanf("%d", &year);

    if (year == 1) {
        text = "You are Freshly";
    } else if (year == 2) {
        text = "You are Sophomore";
    } else if (year == 3) {
        text = "You are Junior";
    } else if (year == 4) {
        text = "You are Senior";
    } else {
        text = "Invalid";
    }

    printf("%s", text);
}
