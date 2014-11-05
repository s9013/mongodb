mongodb
=======

学习mongodb

官网 http://www.mongodb.org 下载mongodb，解压配置环境变量。
mongodb路径下新建data
启动mongodb
mongod -dbpah data路径
浏览器访问 http://localhost:27017
会出现It looks like you are trying to access MongoDB over HTTP on the native driver port.
输入 mongo 出现connecting to：test
连接成功

show dbs 查看所有库


java来连接mongodb需要下载mongodb的驱动