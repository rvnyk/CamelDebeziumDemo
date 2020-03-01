# CamelDebeziumDemo
Camel Debezium Change Log Demo with MongoDB

## Mongo DB  with replica set, running on windows
- mongod.exe --journal --config D:\Downloads\softwares\mongodb-win32-x86_64-2012plus-4.2.3\mongod.cfg --dbpath D:\Downloads\softwares\mongodb-win32-x86_64-2012plus-4.2.3\data --replSet rs0 --bind_ip localhost

- use admin, db = db.getSiblingDB('admin')
   ```
    db.createUser(
   {
     "user": "user",
     "pwd": "password",
     "roles": [{ role: "readWrite", db: "test" },{ role: "read", db: "admin" },{ role: "read", db: "local" },{ role: "read", db: "config" }]
   })
  ```

- use test
  ```
  db.createUser(
    {
      user: "user",
      pwd: "password",
      roles: [ { role: "readWrite", db: "test" } ]
    })
  ```
- mongod.exe --journal --config D:\Downloads\softwares\mongodb-win32-x86_64-2012plus-4.2.3\mongod.cfg --dbpath D:\Downloads\softwares\mongodb-win32-x86_64-2012plus-4.2.3\data --replSet rs0 --bind_ip localhost --auth --install
net start mongoDB

- ```db.Events.insert({ "paymentId" : "123", "name" : "abc", "account" : 123, "date" : new Date() } ) // Sample data```

