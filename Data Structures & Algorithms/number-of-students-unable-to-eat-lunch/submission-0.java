class Solution {
    public int countStudents(int[] students, int[] sandwiches) { 

        int[] options = new int[2];
        int count = students.length;

        for(int i=0; i<students.length; i++)
        {
           options[students[i]]++; 
        }
        for(int i=0; i<students.length; i++)
        {
           if(options[sandwiches[i]]>0)
           {
            count--;
            options[sandwiches[i]]--; 
           }
           else
           break;
        }
        return count;
    }
    
}