#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#error-logging.py 测试错误日志输出
import logging

class FooError(ValueError):
    pass

def foo(s):
    if int(s)==0:
        raise FooError('invalid value: %s' % s)
    return 10/int(s)
    
def bar(s):
    return foo(s)*2

def main():
    try:
        bar('0')
    except Exception as e:
        logging.exception(e)

main()
print('End')        