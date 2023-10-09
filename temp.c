#include <stdio.h>
/* CREATED BY DELON AKA DAZAI 2023*/
/* print Fahrenheit-Celsius table
    for fahr = 0, 5, ..., 300 */

main()
{
    int fahr, celsius;
    int lower, upper, step;
    
    lower = 0; /* lower limit of temperature table*/
    upper = 300; /* upper limit*/
    step = 5; /* step size */
    
    fahr = lower;
    while (fahr <= upper) {
        celsius = 5 * (fahr - 32) / 9;
        printf("%3d %6d\n", fahr, celsius);
        fahr = fahr + step;
    }
}
/* To get more accurate answers, we should use floating point arithmetic instead of interger*/

/* %d  print as decimal interger
   %6d print as decimal interger, at least 6 characters wide
   %f  print as floating point
   %6f print as floating point, at least 6 characters wide
   %.2f print as floating point, 2 characters after decimal point
   %6.2 print as floating point, at least 6 characters wide and 2 after decimal point*/
   
