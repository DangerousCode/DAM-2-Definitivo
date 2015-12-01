__author__ = 'AlumnoT'
def invertir(l,m):
    if l==[]:
        return m
    else:
        m.append(l[len(l)-1])
        return invertir(l[:len(l)-1],m)
#main
m=[]
print invertir([1,2,3],m)