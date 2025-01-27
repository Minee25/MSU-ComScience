#include <stdio.h>

int main() {
    int n, grade, credit, sumCredit = 0, gradeXcredit = 0, sumGradeXcredit = 0;
    float gradeAvg;

    printf("Round: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++) {
        printf("\nGrade: ");
        scanf("%d", &grade);
        printf("Credit: ");
        scanf("%d", &credit);

        gradeXcredit = grade * credit;
        sumCredit += creDdit;
        sumGradeXcredit += gradeXcredit;
    }

    gradeAvg = (float)sumGradeXcredit / sumCredit;
    printf("Grade: %.2f", gradeAvg);

    return 0;
}
