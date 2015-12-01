__author__ = 'AlumnoT'
def concatenar(L1,L2):
    if L1==[]:
        return L2
    elif L2==[]:
        return L1
    else:
        L1.append(L2[0])
        return concatenar(L1,L2[1:])
#main
print concatenar([2,4,5],[5,9,7])