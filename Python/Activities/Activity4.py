
while True:
   Player1 = str(input("Enter the one"))
   Player2 = str(input(" Enter the two"))
   if(Player1==Player2):
    print("its a tie")
   elif(Player1=="scissors"):
     if (Player2=="paper"):
        print("Player1 wins")
     else:
        print("Player2 wins")
   elif(Player1=="rock"):
     if (Player2=="scissors"):
        print("Player1 wins")
     else:
        print("Player2 wins")
   elif(Player1=="paper"):
     if (Player2=="rock"):
        print("Player1 wins")
     else:
        print("Player2 wins")  
   else:
        print("wrong input") 
 
   repeat = input("do you want to play another round of game :")
   if(repeat=="yes"):
      pass
   elif(repeat=="no"):
      raise SystemExit
   else:
      print("you entered invalid option. Exiting")
      raise SystemExit

