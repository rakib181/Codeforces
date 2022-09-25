#include<bits/stdc++.h>
using namespace std;

int32_t main(){
     ios_base::sync_with_stdio(0);
      cin.tie(0); 
      #ifndef ONLINE_JUDGE 
      freopen("input.txt","r",stdin); 
      freopen("output.txt","w",stdout); 
      #endif
      auto start=clock();
      int tt;
      cin >> tt;
      while(tt--){
       int n, c, q;
      cin >> n >> c >> q;
      string s;
      cin >> s;
      vector<pair<long long, long long>> oper(c), seg(c);
      long long cur_pos = n;
      for(int i = 0; i < c; i++){
        long long l, r;
        cin >> l >> r;
        oper[i] = {l, r};
        seg[i] = {cur_pos + 1, cur_pos + (r - l + 1)};
        cur_pos = seg[i].second;
      }
      while(q--){
        long long k;
        cin >> k;
        if(k <= n){
            cout << s[k - 1] << '\n';
            continue;
        }

        for(int i = c - 1; i >= 0; i--){
            if(k >= seg[i].first and k <= seg[i].second){
                k = (oper[i].first) + (k - seg[i].first);
            }
        }
        cout << s[k - 1] << '\n';
      }
    }
      cerr<<1.0 * (clock()-start)/CLOCKS_PER_SEC<<endl;
      return 0;
}
