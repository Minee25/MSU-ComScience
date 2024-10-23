#include <stdio.h>

int main() {
  float i = 1, n, sumGpa = 0, sumGpa2 = 0, sumUnit = 0;
  float gpa = 0, unit = 0, result = 0;

  printf("> ");
  scanf("%f", &n);

  while (i <= n) {
    printf("Unit: ");
    scanf("%f", &unit);
    printf("Gpa: ");
    scanf("%f", &gpa);

    sumGpa = gpa * unit;
    sumGpa2 += sumGpa;
    sumUnit += unit;
    i++; 
  }

  printf(">> %f <<\n", sumGpa2);
  printf(">> %f <<", sumUnit);

  result = sumGpa2 / sumUnit;
  printf("%.2f", result);
}