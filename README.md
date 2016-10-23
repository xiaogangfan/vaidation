git init //初始化本地仓库
git add README.md //添加
git commit -m "first commit"//提交到要地仓库，并写一些注释
git remote add origin git@github.com:youname/Test.git //连接远程仓库并建了一个名叫：origin的别名
git push -u origin master //将本地仓库的东西提交到地址是origin的地址，master分支下

//删除文件夹下的所有 .svn 文件
find . -name ".svn" | xargs rm -Rf
//删除文件夹下的所有 .git 文件
find . -name ".git" | xargs rm -Rf
