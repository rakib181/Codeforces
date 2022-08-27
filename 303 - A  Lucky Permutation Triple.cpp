#include <bits/stdc++.h>
using namespace std;

int32_t main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin >> n;
    vector<pair<int, int>> ans;
    vector<int> ok;
    if(n & 1){
        for(int i = 0; i < n; i++){
            ans.push_back({i, i});
        }
        for(auto x : ans){
            ok.push_back((x.first + x.second) % n);
        }
        for(auto x : ans){
            cout << x.first << ' ';
        }
        cout << '\n';
        for(auto x : ans){
            cout << x.second << ' ';
        }
        cout << '\n';
        for(auto x : ok){
            cout << x << ' ';
        }
        cout << '\n';
    }else cout << "-1" << '\n';
    return 0;
}
