class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_arr=s.split(' ')
        char_to_word=dict()
        word_to_char=dict()

        if len(pattern) !=len(s_arr):
            return False

        for i,char in enumerate(pattern):
            word=s_arr[i]
            if char in char_to_word and char_to_word[char]!=word:
                return False
            else:
                char_to_word[char]=word

            if word in word_to_char and word_to_char[word]!=char:
                return False
            else:
                word_to_char[word]=char

        return True