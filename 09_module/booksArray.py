# -*- coding: utf-8 -*-
"""
Created on Thu Jun 20 15:31:41 2019

@author: adhamlin
"""
import numpy as np

INDEX_SIZE = 3
books = []
index = 0
while index < INDEX_SIZE:
    stockNum = input("Enter stockNum: ")
    author = input("Enter author: ")
    title = input("Enter title: ")
    price = input("Enter price: ")
    pages = input("Enter page count: ")

    stockNum = int(stockNum)
    price = float(price)
    pages = int(pages)
    books.append(stockNum)
    books.append(author)
    books.append(title)
    books.append(price)
    books.append(pages)
    index = index + 1

booksArr = np.asarray(books)
print(booksArr)

for i, v in enumerate(books):
    print(i, v)
