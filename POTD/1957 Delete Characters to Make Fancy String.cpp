//Date : 1.11.2024
//Porblem Statement no : 1957  
//Porblem Statement Topic : . Delete Characters to Make Fancy String

class Solution {
    public:
        static string makeFancyString(string& s) {
            int n=s.size(), i=0;
            char prev='@';
            for(int len=0; char c: s){
                if (prev!=c) len=1;
                else len++;
                if (len<= 2) 
                    s[i++]=c;
                prev=c;
                
            }
            s.resize(i);
            return s;
             
        }
    };