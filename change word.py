#input
sentence=input("Enter a sentence: ")
replace_word=input("Enter word to replace: ")
replacement_word=input("Enter replacement word: ")

#slicing
n=sentence.find(replace_word)

#finding length
length=len(replace_word)


#sentences
sentence1=sentence[:n]
sentence2=sentence[n+length:]
replacementword=replacement_word


#printing
print(sentence1 + replacementword + sentence2)
