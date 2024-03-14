Postman API : https://api.postman.com/collections/28076797-eb6726aa-22da-48cd-be1e-bdc3a6fdfaed?access_key=PMAT-01HRXXFA7RWV8SA1D3Z2M9YTZ1
- URL API REGISTER =http://localhost:8023/register (Method POST)
  request body :
  {
    "username":"rosyid",
    "password":"test"
  }
  response :
  {
    "id": 4,
    "username": "aku",
    "password": "$2a$10$HRlFov3aEwBZXnlv.vmfsOQtHV4hvJZjJ6u7M55i3QOKdgnqnYDeC"
  }
- URL API TOKEN =http://localhost:8023/token (Method POST)
- URL API GETALL TASK =http://localhost:8023/task/getall (Method GET)
- URL API GETBYID TASK =http://localhost:8023/task/get/{id} (Method GET)
- URL API ADD TASK =http://localhost:8023/task/add
- URL API DELETE TASK =http://localhost:8023/task/delete/{id}
- URL API UPDATE TASK =http://localhost:8023/task/update/{id}
