jest.mock('../../models/checklist.js', () => {
    const mockData = [
        {
            _id: '1',
            id_radio: "000001",
            id_template: "65d7dc57d92f5f324e02c1b3",
            id_responsavel: "65d7df5a17fceacd1a063689",
            fields: [
                { name: "field_1", checked: "true", description: "" },
                { name: "field_2", checked: "false", description: "erro no sinal" },
                { name: "field_3", checked: "true" }
            ]
        },
        {
            _id: '2',
            id_radio: "000002",
            id_template: "65d7dc57d92f5f324e02c1b3",
            id_responsavel: "65d7df5a17fceacd1a063689",
            fields: [
                { name: "field_1", checked: "false", description: "Erro total" },
                { name: "field_2", checked: "false", description: "erro no sinal" },
                { name: "field_3", checked: "true" }
            ]
        },
    ];

    class MockChecklistModel {
        constructor(data) {
            Object.assign(this, data);
        }

        static find() {
            return Promise.resolve(mockData);
        }

        static findById(id) {
            return Promise.resolve(mockData.find(checklist => checklist._id === id));
        }

        static findByIdAndDelete(id) {
            const index = mockData.findIndex(checklist => checklist._id === id);
            if (index !== -1) {
                return Promise.resolve(mockData.splice(index, 1)[0]);
            }
            return Promise.resolve(null);
        }

        static countDocuments() {
            return Promise.resolve(mockData.length);
        }

        save() {
            if (!this._id) {
                this._id = (Math.max(...mockData.map(d => parseInt(d._id, 10))) + 1).toString();
                mockData.push(this);
            } else {
                const index = mockData.findIndex(checklist => checklist._id === this._id);
                if (index !== -1) {
                    mockData[index] = this;
                }
            }
            return Promise.resolve(this);
        }
    }

    return {
        __esModule: true,
        default: MockChecklistModel, 
        mockData,
    };
});
