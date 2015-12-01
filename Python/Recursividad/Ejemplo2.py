__author__ = 'AlumnoT'
def Largo(L):
    if L==[]:
        return 0
    else:
        return 1+Largo(L[1:])
#main:
print Largo(['a','b','c','d','e'])