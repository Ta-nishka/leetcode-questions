class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int Wealth = 0;

        for (int i = 0; i < accounts.size(); i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].size(); j++) {
                sum = sum + accounts[i][j];
            }
            if ( sum > Wealth){
                Wealth = sum ;
            }
            //Wealth = max(Wealth, sum);
        }

        return Wealth;
    }
};