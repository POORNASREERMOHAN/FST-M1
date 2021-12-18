example_list = list(input("Enter the values for the list needed").split(","))
if(example_list[0]==example_list[-1]):
    print("Last and first numbers equal")
    pass
else:
    print("Not equal. Exiting")
    raise SystemExit



