

def forloop() :
    lst =[1,2,3,4,5]

    for e in lst:
        print(e,end = ' ')


def function4():
    for i in range(1,6):
        print(i, end = ',')

def function5():
    for i in range(1,11):
        if i % 2 == 0:
            print(i,end = ',')
    
def function6():
    for i in range(20,10,-2): #3rd parameter steps 
        print(i,end=',')
    
def function7():
    for i in range(5):
        print('*'*i)

def function8():
    for i in range(5):
        print(' '*i,'*'*(5-i))

def function9():
    for i in range(5):
        print(' '*(5-i),'*'*i)

def function10():
    for i in range(1,6):
        print(' '*(5-i),'*'*i,end = '')    
        print('*'*(i-1))

def function12():
    array = [{'product':'soap' , 'price':30},{'product':'shampoo','price':60}]
    if array[0]['price']>array[1]['price']:
        print(array[0]['product'])
    else:
        print(array[1]['product'])


#forloop()
function12()