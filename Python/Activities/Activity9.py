List1 = [4,5,6,7]
List2 = [8,9,1,2]
List3=[]
for item in List1:
    if(item %2 != 0):
        List3.append(item)
for item1 in List2:
    if(item1%2 ==0):
        List3.append(item1)
print(List3)        
               