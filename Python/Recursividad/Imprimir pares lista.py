__author__ = 'AlumnoT'
def pares(L):
    if(L==[]):
        return []
    elif(L[0]%2==0):
        return [L[0]]+pares(L[1:])
    else:
        return pares(L[1:])
#main
print(pares([1,5,4,8]))