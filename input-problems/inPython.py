def input_array_format():
    arr = list(map(int, input().strip("[]").split(',')))
    return arr
    
def input_space_seperated():
    arr = list(map(int, input().split()))
    return arr
    
def input_comma_seperated():
    arr = list(map(int, input().split(',')))
    return arr
    
def input_array_not_given():
    arr = []
    print("Enter numbers (press Enter to stop):")
    while True:
        try:
            num = input().strip()
            if num == "":
                break
            arr.extend(map(int, num.split()))
        except ValueError:
            print('Please enter valid integers seperated by space.')
    return arr
    
def input_array_size_not_given():
    arr = list(map(int, input().split()))
    return arr
    
#print(f"input_array_format() = {input_array_format()}")
#print(f"input_space_seperated() = {input_space_seperated()}")
#print(f"input_comma_seperated() = {input_comma_seperated()}")
#print(f"input_array_not_given() = {input_array_not_given()}")
print(f"input_array_size_not_given() = {input_array_size_not_given()}")