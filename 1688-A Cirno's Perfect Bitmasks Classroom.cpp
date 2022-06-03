#include<bits/stdc++.h>
using namespace std;

int32_t main(){
   ios_base::sync_with_stdio(0);
    cin.tie(0); 
    cout.tie(0);
    #ifndef ONLINE_JUDGE 
    freopen("input.txt","r",stdin); 
    freopen("output.txt","w",stdout); 
    #endif
    auto start=clock();
    int tt;
    cin >> tt;
    while(tt--){
      long long x;
      cin >> x;
      long long ans=(1<<__builtin_ctz(x));
     while((x^ans)<=0){
      ans++;
      if((x&ans)==0){
        ans++;
      }
     }
      cout<< ans << '\n';
    }
    cerr<<1.0 * (clock()-start)/CLOCKS_PER_SEC<<endl;
    return 0;
}
 
