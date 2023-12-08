#include <iostream>
using namespace std;
float power(float n, int p = 2)
{
    float res;
    int i;
    res = 1;
    for (i = 0; i < p; i++)
    {
        res *= n;
    }
    return res;
}
int main()
{
    cout << "Rishu kumar\n2822104\nB2\n";
    int p;
    float n, res;
    cout << "Enter the base:";
    cin >> n;
    cout << "Enter the power:";
    cin >> p;
    res = power(n, p);
    cout << "the result is :" << res << endl;
    cout << "The square of the number is" << power(n);
    return 0;
}