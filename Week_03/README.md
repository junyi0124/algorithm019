## 学习笔记 W3

### 1.递归总结
- 递归有模板，需要牢记
  - 递归终结条件
  - 处理当前逻辑
  - 传递当前参数到下一层
  - 如有必要，清理当前层数据
- 心得：
  - 有些概念不清楚，面试时需要先弄清楚
  - 可以代入法算一算前两层的情况，但不能人肉递归
  - 找到相似性，剥离重复的部分
  - 归纳法

#### 1.1. Python模板
```python
# Python
def recursion(level, param1, param2, ...): 
    # recursion terminator 
    if level > MAX_LEVEL: 
	   process_result 
	   return 
    # process logic in current level 
    process(level, data...) 
    # drill down 
    self.recursion(level + 1, p1, ...) 
    # reverse the current level status if needed
```

#### 1.2. Java
```java
// Java
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

#### 1.3. C/C++
```c++
void recursion(int level, int param) { 
  // recursion terminator
  if (level > MAX_LEVEL) { 
    // process result 
    return ; 
  }

  // process current logic 
  process(level, param);

  // drill down 
  recursion(level + 1, param);

  // reverse the current level status if needed
}
```

#### 1.4. JavaScript
```JavaScript
const recursion = (level, params) => {
   // recursion terminator
   if(level > MAX_LEVEL){
     process_result
     return 
   }
   // process current level
   process(level, params)
   //drill down
   recursion(level+1, params)
   //clean current level status if needed
   
}
```
### 2.分治总结
- 是一种特殊的递归，比递归多一步：合并结果

### 3.回溯
- 通常配合递归出现，常用于解决：组合、排列、切割、子集等问题
  - 1. 分解：将原问题分解成一系列子问题；
  - 2. 解决：递归地求解各个子问题，若子问题足够小，则直接求解；
  - 3. 合并：将子问题的结果合并成原问题。
  

### 2.课后作业
#### 中等：
 - [236] 二叉树的最近公共祖先[https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/]（Facebook 在半年内面试常考）
 - [105] 从前序与中序遍历序列构造二叉树（字节跳动、亚马逊、微软在半年内面试中考过）
 - [77] 组合（微软、亚马逊、谷歌在半年内面试中考过）
 - [46] 全排列（字节跳动在半年内面试常考）
 - [47] 全排列 II （亚马逊、字节跳动、Facebook 在半年内面试中考过）