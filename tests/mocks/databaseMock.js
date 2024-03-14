jest.mock('mongoose', () => ({
  Schema: class Schema {
    static Types = {
      Mixed: Symbol('Mixed'),
    };

    constructor(schema) {
      this.schema = schema;
    }
  },
  model: jest.fn().mockImplementation(() => ({
  })),
  connect: jest.fn().mockResolvedValue({
    connection: {
      host: 'mockHost',
      port: 'mockPort',
      name: 'mockDB',
    },
  }),
  connection: {
    on: jest.fn(),
    once: jest.fn(),
  },
}));
