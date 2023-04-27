import { createApi, fetchBaseQuery } from '@reduxjs/toolkit/query/react';

// Async Thunk is a way for our reducers to make async HTTP calls to fetch data
// createApi = createSlice + asyncThunk

export type Store = {
    id?: number; // Not required, but it recognizes it possibly being there
    name: string;
    address: string;
    squareFootage: number;
}

export const storeApi = createApi({
    reducerPath: 'storeApi',
    baseQuery: fetchBaseQuery({ baseUrl: 'http://localhost:8080/'  }),
    // API Endpoints
    endpoints: (builder) => ({
        //                          return    param to queryFn
        findAllStores: builder.query<Store[], void>({
            query: () => '/stores'
        }),
        findStoreById: builder.query<Store, number>({
            query: id => `/stores/${id}`
        }),
        createStore: builder.mutation<Store, Store>({
            query: (store) => {
                return {
                    method: 'POST',
                    url: '/stores',
                    body: store
                }
            }
        })
    })
});

export const {
    useFindAllStoresQuery,
    useFindStoreByIdQuery,
    useCreateStoreMutation
} = storeApi;