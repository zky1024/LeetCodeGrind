Given a string `s`, reverse the string according to the following rules:

-   All the characters that are not English letters remain in the same position.
-   All the English letters (lowercase or uppercase) should be reversed.

Return `s` _after reversing it_.

**Example 1:**

```
<strong>Input:</strong> s = "ab-cd"
<strong>Output:</strong> "dc-ba"
```

**Example 2:**

```
<strong>Input:</strong> s = "a-bC-dEf-ghIj"
<strong>Output:</strong> "j-Ih-gfE-dCba"
```

**Example 3:**

```
<strong>Input:</strong> s = "Test1ng-Leet=code-Q!"
<strong>Output:</strong> "Qedo1ct-eeLg=ntse-T!"
```

**Constraints:**

-   `1 <= s.length <= 100`
-   `s` consists of characters with ASCII values in the range `[33, 122]`.
-   `s` does not contain `'\"'` or `'\\'`.