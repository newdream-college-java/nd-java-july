# nd-java-july
java3班级-代码管理库
# 2.1 初始化 
    git init
    git status
	查看到文件 初始化成功 
# 2.2 添加文件到仓库 
    git add .
    git status
# 2.3 提交 
	git commit -am “first init” 
# 2.4 链接远程仓库 
	git remote add origin <git仓库地址>   注：链接远程仓库 
	git branch 
	master 
# 2.5 推送本地仓库内容到远程仓库 
    git pull
    git push -u origin  master
    git branch
        master
    git branch -r     	注：-r 查看远程仓库分支 -av 查看所有分支
        origin/master
# 2.6 创建本组的分支 
	git checkout -b v1.0 origin/master 
	git branch 
		master
 	 -->V1.0
	git push origin HEAD -u
## 注意:将 v1.0 改为你们的组名:team-01 

