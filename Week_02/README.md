学习笔记

## 四件套
1. clarification - 澄清问题
2. possible solution -> optimal (time & space)
3. code
4. test case

## 作业
### 简单：
- 写一个关于 HashMap 的小总结。
  - 说明：对于不熟悉 Java 语言的同学，此项作业可选做。
- 242.有效的字母异位词（亚马逊、Facebook、谷歌在半年内面试中考过）
- 1.两数之和（近半年内，亚马逊考查此题达到 216 次、字节跳动 147 次、谷歌 104 次，Facebook、苹果、微软、腾讯也在近半年内面试常考）
- 589.N 叉树的前序遍历（亚马逊在半年内面试中考过）
- HeapSort ：自学 https://www.geeksforgeeks.org/heap-sort/
### 中等：
- 49.字母异位词分组（亚马逊在半年内面试中常考）
- 94.二叉树的中序遍历（亚马逊、字节跳动、微软在半年内面试中考过）
- 144.二叉树的前序遍历（字节跳动、谷歌、腾讯在半年内面试中考过）
- 429.N叉树的层序遍历（亚马逊在半年内面试中考过）
- 263.丑数（字节跳动在半年内面试中考过）
- 347.前 K 个高频元素（亚马逊在半年内面试中常考）


## HashMap 学习笔记

### put方法调用
- put方法把key hash了一下，就直接调用了putVal方法了。hash的注释里似乎还透露一丝纠结
- putVal的另外两个开关onlyIfAbsent = false，表示允许修改现有数据，evict = true，表示table不是创建模式

### putVal方法
- 一上来检查了了一下table是否初始化，如果没有就resize一下，并把长度记录下来
- 之后非常长一段代码，按照几种不同的情况处理节点插入过程。过程主要三个情况：
  - 没找到hash时，创建新节点并插入；
  - 找到hash且node是treeNode时，使用树方式插入；
  - 找到hash且node不是treeNode时，需要处理链表；
- 再之后长度++，再判断一下阈值，超过的话会重新resize

### get 方法
- get 调用的是getNode方法。传入的还是hash（key），如果能找到则返回node的value，否则返回空

### getNode 方法
- 获取过程相比putVal来说直白些，一上来检查table里面是否有数据，并找出first节点
- 检查first节点是否就是要找的数据，如果还不是，按照树或者链表查找数据

