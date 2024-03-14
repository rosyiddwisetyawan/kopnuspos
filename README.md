
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

  response :
  {
    "id": 2,
    "judul": "rosyid",
    "deskripsi": "test2",
    "waktu": "2024-03-13T21:25:13.494+00:00"
  }
  
- URL API ADD TASK =http://localhost:8023/task/add

  request body :
  {
    "judul":"anil",
    "deskripsi":"test3",
    "waktu":"2024-03-18"
  }

  response :
  {
    "id": 39,
    "judul": "anil",
    "deskripsi": "test3",
    "waktu": "2024-03-18T00:00:00.000+00:00"
  }
  
- URL API DELETE TASK =http://localhost:8023/task/delete/{id}

  response :
  {
    "id": 37,
    "message": "success delete task"
  }
  
- URL API UPDATE TASK =http://localhost:8023/task/update/{id}

  request body :
  {
    "judul":"oli",
    "deskripsi":"test5",
    "waktu":"2024-03-20"
  }

  response :
  {
    "id": 1,
    "judul": "oli",
    "deskripsi": "test5",
    "waktu": "2024-03-20T00:00:00.000+00:00"
  }
