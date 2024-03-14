Postman API : https://api.postman.com/collections/28076797-eb6726aa-22da-48cd-be1e-bdc3a6fdfaed?access_key=PMAT-01HRXXFA7RWV8SA1D3Z2M9YTZ1
- URL API REGISTER =http://localhost:8023/register (Method POST)
  
  request body :
  {
    "username":"aku",
    "password":"test"
  }

  response :
  {
    "id": 4,
    "username": "aku",
    "password": "$2a$10$HRlFov3aEwBZXnlv.vmfsOQtHV4hvJZjJ6u7M55i3QOKdgnqnYDeC"
  }
  
- URL API TOKEN =http://localhost:8023/token (Method POST)

  request body :
  {
    "username":"aku",
    "password":"test"
  }

  response :
  {
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJyb3N5aWQiLCJpYXQiOjE3MTA0MDAyODEsImV4cCI6MTcxMDQwMjA4MX0.mHMRJyzqsYpmYThqtKdlT2sSMmpx7MWM6-hzCLVennk"
  }
  
- URL API GETALL TASK =http://localhost:8023/task/getall (Method GET)

  response :
  [
    {
        "id": 1,
        "judul": "oli",
        "deskripsi": "tet3",
        "waktu": "2024-03-20T00:00:00.000+00:00"
    },
    {
        "id": 2,
        "judul": "rosyid",
        "deskripsi": "test2",
        "waktu": "2024-03-13T21:25:13.494+00:00"
    }
  ]
  
- URL API GETBYID TASK =http://localhost:8023/task/get/{id} (Method GET)
- URL API ADD TASK =http://localhost:8023/task/add
- URL API DELETE TASK =http://localhost:8023/task/delete/{id}
- URL API UPDATE TASK =http://localhost:8023/task/update/{id}
