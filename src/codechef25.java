/*#include  <bits/stdc++.h>
        using namespace std;

        int func()
        {
        int n;
        cin >> n;

        int start = 1;
        int end = 2;
        for(int i = 1; i <= n; i++)// coded by jhai bajaj
        {
        for(int j = 1; j <= n;j++)
        {
        if(start<=n*n)
        {
        cout<<start<<" ";
        start+=2;
        }
        else{
        cout<<end<<" ";
        end+=2;
        }
        }
        cout << endl;
        }

        return 0;
        }

        int main()
        {
        int tc;
        cin >> tc;
        while (tc--)
        {
        /* code */

