class Solution {
    public boolean isPalindrome(String s) {
      
      int n = s.length();
      int j = n-1; 
      int i = 0;
      while(i < j)
      {
        char a = s.charAt(i);
        char b = s.charAt(j);

        if( !Character.isLetterOrDigit(a))
        {
           i++;
           
        }
         else if(!Character.isLetterOrDigit(b))
        {
           j--;
           
        }
        else {
        if(Character.toLowerCase(a) != Character.toLowerCase(b))
            return false;
            i++;
            j--;
        }
        
      }  
      return true;
    }
}
