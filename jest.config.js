export default {
    transform: {
      '^.+\\.js$': 'babel-jest',
    },
    setupFilesAfterEnv: ['./tests/mocks/databaseMock.js'],
    
  };
  