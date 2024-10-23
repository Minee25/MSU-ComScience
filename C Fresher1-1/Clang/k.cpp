#include <stdio.h>

int main() {
  int readPageBook = 30, pageBook = 0, day = 0;

  printf("Page: ");
  scanf("%d", &pageBook);

  while (pageBook >= 0 ) {
    pageBook = pageBook - readPageBook;
    day = day + 1;
  }

  printf("Day: %d", day);  
  
  return 0;
}