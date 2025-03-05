def isPrime(num):
    i = 2
    while i < num:
        if num % i == 0:
            return False
        i += 1
    return True

def primeNumbers(n):
    lst = [1]
    for i in range(2, n + 1):
        if (isPrime(i)):
            lst.append(i)
            
    print(lst)
    
    
primeNumbers(17)
#print(isPrime(15))