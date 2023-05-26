# Microservice Product

### Endpoints

#### Save Product
````
POST /api/product HTTP/1.1
Host: localhost:3333
Authorization: Basic base64(username:password)
Content-Type: application/json
Content-Length: 40

    {
        "name":"test-1",
        "price":1.2
    }
````
#### Get Products

````
GET /api/product HTTP/1.1
Host: localhost:3333
Authorization: Basic base64(username:password)

   {
        "id": 1,
        "name": "test-1",
        "price": 1.2,
        "createTime": "2023-05-24T19:22:44.416986"
    }

````

#### Delete Product

````
DELETE /api/product/1 HTTP/1.1
Host: localhost:3333
Authorization: Basic base64(username:password)
````
