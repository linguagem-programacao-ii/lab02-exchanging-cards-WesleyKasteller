while True:
    in1, in2 = input().split()
    if in1 == in2 == '0':
        break
    array1 = [int(x) for x in input().split()]
    array2 = [int(x) for x in input().split()]
    a = set(array1)
    b = set(array2)
    c = b
    f = 0
    if len(a) < len(b):
        c = a
        a = b
    c = [x for x in c if x not in a]
    print(len(c))