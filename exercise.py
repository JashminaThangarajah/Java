strx = input("Enter the string")
stry = input("Enter the string")

if len(strx)==(len(stry)):
    if sorted(strx.lower()) == sorted(stry.lower()):
      print ("Anagram")
    else:
       print("not anagram")
else:
    print("not anagram")
   
   
   



