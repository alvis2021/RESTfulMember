---
typora-copy-images-to: ./image
---

# RESTfulMember



### Read 讀取DB中所有member 於 http://188.166.178.174/使用GET

http://188.166.178.174/

在terminal使用curl以下commmand:

```
curl -i -X GET -H "Content-Type:application/json" http://188.166.178.174
```



### Create 使用POST 於 http://188.166.178.174/create/

http://188.166.178.174/create

在terminal使用curl以下commmand:

```
curl -i -X POST -H "Content-Type:application/json" -d "{ \"name\" : \"Amy\", \"gentle\" : \"female\",  \"phone\" : \"0912345678\" }" http://188.166.178.174/create
```

```
curl -i -X POST -H "Content-Type:application/json" -d "{ \"name\" : \"葉大雄\", \"gentle\" : \"男\",  \"phone\" : \"0912345678\" }" http://188.166.178.174/create
```

範例結果：

```
HTTP/1.1 200 
Content-Type: application/json
Transfer-Encoding: chunked
Date: Thu, 15 Sep 2022 10:45:56 GMT

{"id":"632302640dafde0947e1f50b","name":"Amy","gentle":"female","phone":"0935555666"}
```



### Read 使用GET 於 http://188.166.178.174/{memberID}

在terminal使用curl以下commmand:

```
curl -i -X GET -H "Content-Type:application/json" http://188.166.178.174/632302640dafde0947e1f50b
```



### Update  使用PUT 於 http://188.166.178.174/update/{memberID}

memberID 由 http://188.166.178.174/ GET例出時可查到monogoDB自產的ID

在terminal使用curl以下commmand代入**更新**id為632302020dafde0947e1f50a的資料:

```
curl -i -X PUT -H "Content-Type:application/json" -d "{ \"name\" : \"Amy\", \"gentle\" : \"female\",  \"phone\" : \"0935555666\" }" http://188.166.178.174/update/632302020dafde0947e1f50a
```



### Delete 使用DELETE 於 http://188.166.178.174/{memberID}

memberID 由 http://188.166.178.174/ GET例出時可查到monogoDB自產的ID

在terminal使用curl以下commmand代入**刪除**id為632302020dafde0947e1f50a的資料:





## 可以用POSTMAN進行： 

#### 

Read 讀取DB中所有member 於 http://188.166.178.174/使用GET

![Snipaste_2022-09-15_19-06-52](image/Snipaste_2022-09-15_19-06-52.png)



Create 使用POST 於 http://188.166.178.174/create/

![](image/Snipaste_2022-09-15_19-08-32.png)





Read 使用GET 於 http://188.166.178.174/{memberID}



![Snipaste_2022-09-15_19-15-41](image/Snipaste_2022-09-15_19-15-41-3240591.png)



Update  使用PUT 於 http://188.166.178.174/update/{memberID}

![Snipaste_2022-09-15_19-19-24](image/Snipaste_2022-09-15_19-19-24.png)



Delete 使用DELETE 於 http://188.166.178.174/{memberID}

![Snipaste_2022-09-15_19-20-28](image/Snipaste_2022-09-15_19-20-28.png)

