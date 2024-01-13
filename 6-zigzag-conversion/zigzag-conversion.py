class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if len(s) < 2 or numRows < 2:
            return s
        next = 2*numRows - 2
        st = ""
        for i in range(numRows):
            x = i
            prev = 0 
            while (x < len(s)):

                st += s[x]
                if (x+next - 2*i) != x and (x+next - 2*i) != x+next and (x+next -2*i) < len(s):
                    st += s[x+next - 2*i]
                x += next
        return st



        