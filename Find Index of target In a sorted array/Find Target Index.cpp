#include<iostream>
#include<vector>

using namespace std;

int main()
{
    int n,target,i;
    cin >> n;
    vector<int> arr(n);
    for(i=0;i<n;i++)
    cin >> arr[i];
    cin >> target;
    for(i=1;i<n;i++)
    {
        if(arr[i]<arr[i-1])
        {
            cout <<"Array should be sorted in ascending";
            return 0;
        }
    }

    for(i=0;i<n;i++)
    {
        if(arr[i]>=target)
            break;
    }
    cout << i;
    return 0;
}
