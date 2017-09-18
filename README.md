Java示例代码使用方法
===

<div class="jumbotron">
<p>大屎蛋教程网<br>
   Java教程源码使用方法</p>  
</div>


1 大屎蛋教程网网址
---

    [大屎蛋教程网](http:///dashidan.com): http:///dashidan.com
    
2 下载源码
---

[示例代码下载链接](https://github.com/zflh/lession_java/archive/master.zip).

3 下载开发工具Intellij IDEA   
---

Intellij IDEA可以说是目前最好的java开发工具了.   
有社区版和商业版,社区版是免费的.初学者可以下载社区版.   
[社区版下载地址](https://download.jetbrains.com/idea/ideaIC-2017.2.3.exe)

下载后, 默认方式安装即可.

4 用IDEA打开源码项目
---

`File`->`New`->`project from Existing Source`->代码目录

5 设置SDK
---

项目名称->点右键->`Project Settings`->`Project`->`Project SDK`->`New`->SDK安装目录
   
6 项目目录结构
---

以java项目为例
`src`为源码目录
`com.dashidan`以网站域名倒叙作为包名
`base`目录对应基础篇源码
`advance`目录对应进阶篇源码
`master`目录对应高级篇源码
`addenda`目录对应附件源码

每个目录中有子目录:   

	lession3 对应第3篇教程
	...
	lession20 对应第20篇教程

结构如下:

	lession_java
	    -src 源码目录
	        -com.dashidan 以网站域名倒叙作为包名
                -base 基础篇对应源码
                    -lession3 3.HelloWorld 对应的源码
                    -lession6 6.Java基础类型变量 对应的源码
                    ...
                -promote 进阶篇对应源码
                    -lession3 3.HelloWorld 对应的源码
                    ...
                    
		
7 运行对应源码
---

在想运行的源码上点击右键(例如:`HelloWorld`)->`Run 'HelloWrold.main()'`.   
下方的控制会输出运行结果.   

如图:
![图f1-1](http://localhost/img/java/addenda/f1-1.png)

8 查看代码运行输出
---

在IDE(代码编辑器)的下方是控制台区, 会显示程序输出

如图:
![图f1-2](http://localhost/img/java/addenda/f1-2.png)