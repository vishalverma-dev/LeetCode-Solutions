/*
 * Problem: Binary Tree Preorder Traversal
 * LeetCode: 144
 * Difficulty: Easy
 * Topics: Stack, Tree, Depth-First Search, Binary Tree
 *
 * Description:
 * Given a binary tree root, return its node values in preorder traversal.
 *
 * Time Complexity: O(n^2) worst case
 * Space Complexity: O(n)
 */
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<int> preorderTraversal(TreeNode* root) {
    vector<int> result;
    if(root==NULL) return {};
    result.push_back(root->val);
    vector<int> leftResult = preorderTraversal(root->left);
    result.insert(result.end(), leftResult.begin(), leftResult.end());
    vector<int> rightResult = preorderTraversal(root->right);
    result.insert(result.end(), rightResult.begin(), rightResult.end());
    return result;
    }
};
