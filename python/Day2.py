# 函数
# 缺省值
def test1(n=2):
    print(n)
test1(1)
test1()

#可变参数
def test2(*numbers):
    n = len(numbers)
    return n
print(test2(1,2,3,4))

def test3(**cityPoint):
    for (k,v) in cityPoint.items():
        print('key:' + k + "value:" + v )
test3(Beijing='100', Shanghai='88')        
    
