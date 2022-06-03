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
      int n,even=0,cnt=1e9;
      cin >>n;
      int a[n];
      for(int i=0;i<n;i++){
        cin >> a[i];
        if(!(a[i]&1)){
          even++;
        }
        int mn=0;
        while(!(a[i]&1)){
          mn++;
          a[i]>>=1;
        }
        cnt=min(cnt,mn);
      }
      if(even==n)cout << (cnt+even-1) <<'\n';
      else cout << even << '\n';

    }
    cerr<<1.0 * (clock()-start)/CLOCKS_PER_SEC<<endl;
    return 0;
}
