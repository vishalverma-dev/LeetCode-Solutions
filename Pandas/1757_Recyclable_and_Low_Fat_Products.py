"""
Problem: Recyclable and Low Fat Products
LeetCode: 1757
Difficulty: Easy
Topics: Pandas, DataFrame

Description:
Given product records, return IDs for products that are both low-fat and recyclable.

Time Complexity: O(n)
Space Complexity: O(n)
"""
import pandas as pd

def find_products(products: pd.DataFrame) -> pd.DataFrame:

    df = products[(products['low_fats']=='Y') & (products['recyclable']=='Y')]

    return df[['product_id']]
    
