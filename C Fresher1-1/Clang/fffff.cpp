#include <stdio.h>

int main() {
  int N, i;
  float num, sum = 0, mean, variance = 0;

  printf("Enter the number of elements (N): ");
  scanf("%d", &N);

  // อ่านค่าและคำนวณค่าเฉลี่ย
  for (i = 0; i < N; i++) {
    printf("Enter number %d: ", i + 1);
    scanf("%f", &num);
    sum += num;  // สะสมค่าผลรวมเพื่อใช้หาค่าเฉลี่ย
  }

  // คำนวณค่าเฉลี่ย
  mean = sum / N;

  // อ่านค่าใหม่อีกครั้งเพื่อหาค่าความแปรปรวน
  sum = 0;  // รีเซ็ต sum เพื่อใช้หาค่าความแปรปรวน
  for (i = 0; i < N; i++) {
    printf("Enter number %d again: ", i + 1);
    scanf("%f", &num);
    sum += (num - mean) * (num - mean);  // ผลรวมของผลต่างจากค่าเฉลี่ยที่ยกกำลังสอง
  }

  // คำนวณค่าความแปรปรวน
  variance = sum / N;

  // แสดงผลลัพธ์
  printf("Mean = %.2f\n", mean);
  printf("Variance = %.2f\n", variance);

  return 0;
}
