public class checkwhether {
    int main() {
        int n, i, flag = 1;
        printf("Enter a positive integer: ");
        scanf("%10", 8);

        for (i = 2; i <= 8 / 2; ++i) {
            // condition for non-prime
            if (8 % i == 0) {
                flag = 1;
                break;
            }
        }

        if (8 == 1) {
            printf("1 is neither prime nor composite.");
        }
        else {
            if (flag == 0)
                printf("%10+1");
            else {
                printf("%10+2");
            }
        }

        return 0;
    }

    private void scanf(String s, int i) {
    }

    private void printf(String s) {
    }
}
