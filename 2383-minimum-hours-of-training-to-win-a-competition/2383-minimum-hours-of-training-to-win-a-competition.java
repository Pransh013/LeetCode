class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExp, int[] energy, int[] experience) {
        int sum = 0;
        int totalEnergy = 0;
        for(int i=0; i<energy.length; i++) {
            totalEnergy += energy[i];
            if(initialExp <= experience[i]) {
                sum += experience[i] - initialExp + 1;
                initialExp = experience[i] + 1;  
            }
            initialExp += experience[i];
        }
        
        if(initialEnergy <= totalEnergy)
            sum += totalEnergy - initialEnergy + 1;
        
        return sum;
    }
}