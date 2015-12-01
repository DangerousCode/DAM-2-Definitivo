from operator import itemgetter

__author__ = 'Alumnot'
diccionario={1:'DAM',2:'ASR',35:'DAW',7:'SMR'}
print diccionario
print sorted(diccionario.items(),key=itemgetter(0))
print sorted(diccionario.items(),key=itemgetter(1))
print sorted(diccionario.items(),reverse=True)