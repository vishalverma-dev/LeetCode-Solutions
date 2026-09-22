"""
Problem: Article Views I
LeetCode: 1148
Difficulty: Easy
Topics: Pandas, DataFrame

Description:
Given article-view records, return sorted unique author IDs for authors who viewed their own articles.

Time Complexity: O(n log n)
Space Complexity: O(n)
"""
import pandas as pd

def article_views(views: pd.DataFrame) -> pd.DataFrame:

    return views[views['author_id']==views['viewer_id']][['viewer_id']].rename(columns= {'viewer_id':'id'}).sort_values('id').drop_duplicates()
