#include <iostream>

using std::cout;
using std::cin;
using std::endl;

int gcd (int a, int b)
{
    //avoid division by 0
    //then keep dividing recursively
    return b == 0 ? a : gcd (b, a % b);
}

void rotateArray (int A[], int arraySize, int middle)
{
    int d = -1, temp, j;

    for (int i = 0; i < gcd (arraySize, middle); ++i)
    {
        j = i;
        temp = A[i];

        while (true)
        {
            d = (j + middle) % arraySize;

            if (d == i)
                break;

            A[j] = A[d];
            j = d;
        }
        A[j] = temp;
    }
}

void displayArray (int A[], int n)
{
    for (int i = 0; i < n; i++)
        cout << A[i] << " ";

    cout << endl;
}

int main()
{
    unsigned int arraySize;

    cout << "Hello! This program shows how " <<
            "the rotate algorithm can be implemented." << endl;

    do
    {
        cout << "Enter a size for the array to rotate: ";
        cin >> arraySize;

        if (arraySize < 1 || arraySize > 10)
            cout << "Choose a value between 1 and 10!" << endl;
    } while (arraySize < 1 || arraySize > 10);

    int* A = new int[arraySize];

    for (unsigned int i = 0; i < arraySize; ++i)
    {
        //Array indices are 0 based
        //We add one to make it more intuitive for users
        cout << "Enter element " << i + 1 << "/" << arraySize << ": ";
        cin >> A[i];
    }

    int middle;

    cout << "Enter the index for an element in the middle, " <<
            "and this will make it first: ";
    cin >> middle;

    displayArray (A, arraySize);

    //We are taking away 1 for the same reason again
    //Array indices are 0 based
    rotateArray (A, arraySize, middle - 1);

    //gives the same result as
    //std::rotate(A, A + middle - 1, A + arraySize);
    //(don't forget to #include <algorithm> )

    displayArray (A, arraySize);

    delete[] A;

    //Do not close immediately, wait for enter
    cin.get();

    return 0;
}
