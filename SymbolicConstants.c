#include <stdio.h>

/* A #define line defines a symbolic name ore constant to be a particular string of characters:
 #define name  replacement text */

#define LOWER 0 /*lower limit of table*/
#define UPPER 300 /*upper limit*/
#define STEP 20 /*step size*/

/*print fahrenheit-celsius table*/

int main() {
    int fahr;
    for (fahr = LOWER; fahr <= UPPER; fahr = fahr + STEP)
        printf("%3d  %6.1f\n", fahr, (5.0/9.0)*(fahr-32));
}
