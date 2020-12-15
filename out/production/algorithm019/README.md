# 学习笔记 Week 6

## 递归代码模板
```Java
public void recur(int level, int param) {
  // terminator
  if (level > MAX_LEVEL) {
    // process result
    return;
  }
  // process current logic
  process(level, param);
  // drill down
  recur( level: level + 1, newParam);
  // restore current status

}
```

## 分治法
```Java
private static int divide_conquer(Problem problem, ) {
  
  if (problem == NULL) {
    int res = process_last_result();
    return res;     
  }
  subProblems = split_problem(problem)
  
  res0 = divide_conquer(subProblems[0])
  res1 = divide_conquer(subProblems[1])
  
  result = process_result(res0, res1);
  
  return result;
}
```

## homework
### 中等
- [64.最小路径和](https://leetcode-cn.com/problems/minimum-path-sum/)（亚马逊、高盛集团、谷歌在半年内面试中考过）
- [91.解码方法](https://leetcode-cn.com/problems/decode-ways/)（亚马逊、Facebook、字节跳动在半年内面试中考过）
- [221.最大正方形](https://leetcode-cn.com/problems/maximal-square/)（华为、谷歌、字节跳动在半年内面试中考过）
- [621.任务调度器](https://leetcode-cn.com/problems/task-scheduler/)（Facebook 在半年内面试中常考）
- [647.回文子串](https://leetcode-cn.com/problems/palindromic-substrings/)（Facebook、苹果、字节跳动在半年内面试中考过）
### 困难
- [最长有效括号]()（字节跳动、亚马逊、微软在半年内面试中考过）
- [编辑距离]()（字节跳动、亚马逊、谷歌在半年内面试中考过）
- [矩形区域不超过K的最大数值和]()（谷歌在半年内面试中考过）
- [青蛙过河]()（亚马逊、苹果、字节跳动在半年内面试中考过）
- [分割数组的最大值]()（谷歌、亚马逊、Facebook 在半年内面试中考过）
- [学生出勤记录II]() （谷歌在半年内面试中考过）
- [最小覆盖子串]()（Facebook 在半年内面试中常考）
- [戳气球]()（亚马逊在半年内面试中考过）

