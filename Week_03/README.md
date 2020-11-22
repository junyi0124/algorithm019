## 学习笔记 W3

### 1.递归总结
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


### 2.课后作业
#### 中等：
 - 236. 二叉树的最近公共祖先[https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/]（Facebook 在半年内面试常考）
 - 105. 从前序与中序遍历序列构造二叉树（字节跳动、亚马逊、微软在半年内面试中考过）
 - 77. 组合（微软、亚马逊、谷歌在半年内面试中考过）
 - 46. 全排列（字节跳动在半年内面试常考）
 - 47. 全排列 II （亚马逊、字节跳动、Facebook 在半年内面试中考过）