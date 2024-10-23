#include <stdio.h>

int main() {
  int n, sum;
  char name[3][50] = {"Minee", "Master", "FF"};  // string array 
  int numer[3] = {10, 2, 5};  // int array 
  float gpa[3] = {4.00, 2.00, 10.22};  // float array 
  char grade[3] = {'A', 'B', 'C'};  // char array 
  char theChar;


  printf(">> ");
  scanf(" %c", &theChar);

  for (int i = 0; grade[i]; i++) {
    if (theChar == grade[i]) {
      printf("%d", i);
    } 
  }

  // printf("N: ");sำนวน N ครั้ง

  // // loop เพื่อ input ใส่ array
  // for (int i = 0; i < n; i++) {
  //   printf("Number: ");
  //   scanf("%d", &numer[i]);
  // }

  // // loop เพื่อ หาผลบวกของ array
  // for (int i = 0; i < n; i++) {
  //   sum += numer[i];
  // }

  printf("%d", sum);
  return 0;
}