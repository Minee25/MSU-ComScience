#include <stdio.h>

int main() {
    double money, product, priceCoupon;
    int couponH, countCouponH, couponT, countCouponT;

    // Read input money
    printf("Enter the amount of money: ");
    scanf("%lf", &money);

    // Calculate product
    product = money * 13 / 100;

    // Check if product is greater than or equal to 5000
    if (product >= 5000) {
        priceCoupon = money * 2.5 / 100;

        // Calculate count of hundreds and tens for product
        couponH = ((int)product) % 100;
        countCouponH = ((int)product - couponH) / 100;

        // Calculate count of tens and ones for couponH
        couponT = couponH % 10;
        countCouponT = (couponH - couponT) / 10;

        // Print countCouponH, countCouponT, priceCoupon
        printf("Count of hundreds: %d\n", countCouponH);
        printf("Count of tens: %d\n", countCouponT);
        printf("Price of coupon: %.2lf\n", priceCoupon);
    }

    return 0;
}
