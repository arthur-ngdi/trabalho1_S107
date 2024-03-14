// tests/controllers/checklistController.test.js
import { createChecklist, getAllChecklists, getChecklist } from '../../controllers/checklist';
import { mockData } from '../../tests/mocks/modelMocks';
import httpMocks from 'node-mocks-http';


const validRequests = {
    "id_radio":"000002",
    "id_template":"65d7dc57d92f5f324e02c1b3",
    "id_responsavel":"65d7df5a17fceacd1a063689",
    "fields":[
        {
            "name":"field_1",
            "checked":"true",
            "description":""
        },
        {
            "name":"field_2",
            "checked":"false",
            "description":"erro no sinal"
        },
        {
            "name":"field_3",
            "checked":"true"
        }
    ]
}

describe('createChecklist Controller', () => {
//   it('should create a checklist successfully', async () => {
//     const request = httpMocks.createRequest({
//       method: 'POST',
//       url: '/checklists',
//       body: validRequests,
//     });
//     const response = httpMocks.createResponse();
//     await createChecklist(request, response);
//     expect(response.statusCode).toBe(201);

// });

  it('should return 400 on error', async () => {
    const request = httpMocks.createRequest({
      method: 'POST',
      url: '/checklists',
      body: {}, 
    });
    const response = httpMocks.createResponse();
    await createChecklist(request, response);
    expect(response.statusCode).toBe(400);
  });
});


describe('getChecklist Controller', () => {
    // it('should return a checklist by ID', async () => {
    //   const request = httpMocks.createRequest({
    //     method: 'GET',
    //     url: '/checklists/1', 
    //     params: { id: '1' },
    //   });
    //   const response = httpMocks.createResponse();
    //   await getChecklist(request, response);
    //   const responseData = JSON.parse(response._getData());
    //   expect(response.statusCode).toBe(200);
    //   expect(responseData._id).toBe('1');
    // });
  
    it('should return 500 if checklist not found', async () => {
      const request = httpMocks.createRequest({
        method: 'GET',
        url: '/checklists/unknown', // ID that does not exist
        params: { id: 'unknown' },
      });
      const response = httpMocks.createResponse();
      await getChecklist(request, response);
      expect(response.statusCode).toBe(500);
    });
  });

//   describe('getAllChecklists Controller', () => {
//     it('should return all checklists', async () => {
//       const request = httpMocks.createRequest({
//         method: 'GET',
//         url: '/checklists',
//       });
//       const response = httpMocks.createResponse();
//       await getAllChecklists(request, response);
//       const responseData = JSON.parse(response._getData());
//       expect(response.statusCode).toBe(200);
//       expect(Array.isArray(responseData)).toBe(true);
//       expect(responseData).toEqual(mockData);
//     });
  
//   });
  