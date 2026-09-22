"""
Problem: Big Countries
LeetCode: 595
Difficulty: Easy
Topics: Pandas, DataFrame

Description:
Given country records, return the name, population, and area for countries meeting the large-area or large-population condition.

Time Complexity: O(n)
Space Complexity: O(n)
"""
import pandas as pd

def big_countries(world: pd.DataFrame) -> pd.DataFrame:
    
    result = world[(world['area']>=3000000) | (world['population']>=25000000)]

    return result[['name','population','area']]
