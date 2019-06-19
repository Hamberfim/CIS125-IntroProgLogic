# -*- coding: utf-8 -*-
"""
Created on Wed Jun 19 13:45:15 2019

@author: adhamlin
"""

dollarAmount = input("Enter dollar Amount: ")
dollarAmount = float(dollarAmount)
chooseConversion = input('Select curreny to convert to: ("JPY", "GBP", "CNY"): ')


def convertCNY(amount):

    return (amount * 6.92)


def convertGDP(amount):

    return (amount * 0.79)


def convertJPY(amount):

    return (amount * 108.32)


if chooseConversion == "CNY":
    converted = convertCNY(dollarAmount)
    print("Here is your currency conversion: ", converted)
elif chooseConversion == "GBP":
    converted = convertGDP(dollarAmount)
    print("Here is your currency conversion: ", converted)
elif chooseConversion == "JPY":
    converted = convertJPY(dollarAmount)
    print("Here is your currency conversion: ", converted)
elif chooseConversion != "CNY" or chooseConversion != "GBP" or chooseConversion != "JPY":
    print("Select from the three choices only")
