# Provided morsecode patterns for all alphabet in array
morse_code = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
def covert_to_uniq_morsecode(words):
    """
    Converting letters to morsecode and getting the distinct representation
    words: an array of words to convert to morsecode
    """
    # Set is used since distinct value is what we want
    transformations = set()
    # Iterate through word in array words
    for word in words:
        # store all morsecode for each word then clear
        morsecode_rep = ""
        # iterate through each word to get each letters
        for letter in word:
            # getting the ascii code for letter
            ASCII_rep = ord(letter)
            # position of letter in array
            position_of_letter = ASCII_rep - 97
            morsecode_rep += morse_code[position_of_letter]
        transformations.add(morsecode_rep)
    
    return len(transformations)


print(covert_to_uniq_morsecode(["gin","zen","gig","msg"]))
