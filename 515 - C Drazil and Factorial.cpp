#include <bits/stdc++.h>
using  namespace  std;

int32_t  main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    string need[] = {"", "", "2", "3", "322", "5", "53", "7", "7222", "7332"};
    int n;
    cin >> n;
    string s, ans;
    cin >> s;
    for(int i = 0; i < n ; i++){
        ans += need[s[i] - '0'];
    }
    sort(ans.begin(), ans.end());
    reverse(ans.begin(), ans.end());
    cout << ans << '\n';
    return 0;
}
