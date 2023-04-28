import { useEffect, useState, useRef } from "react";
import { Store as StoreType, useCreateStoreMutation, useDeleteStoreMutation, useFindAllStoresQuery, useUpdateStoreMutation } from "./api/storeApi";
import { Counter } from "./components/Counter"
import { Display } from "./components/Display"
import "./App.css";
import { Store } from "./components/Store";

// type StoresResponse = {
//   id: number;
//   name: string;
//   address: string;
//   squareFootage: number;
// }

function App() {

  // const [stores, setStores] = useState<StoresResponse[]>([]);

  // When do we fetch the data?

  // Do something when the component first loads
  // For raw HTML/JS, use <script defer> or window.addEventListener('DOMContentLoaded')
  // useEffect(() => {
  //   // Fetch the data
  //   // XMLHttpRequest

  //   fetch('http://localhost:8080/stores')
  //    .then(res => res.json())
  //    .then(data => setStores(data))
  //    .catch(err => console.error(err))

  //   // returns a promise (eventual success or failure of an asynchronous operation)
  //   // fetch('http://localhost:8080/stores')
  //   //   .then(data => {
  //   //     // Whatever is returned in a .then() is returned as a promise
  //   //     // console.log(data.json()); // Data is the JSON data back from the Spring Boot
  //   //     return data.json();
  //   //   })  // Good 399 on down
  //   //   .then(resData => console.log(resData))
  //   //   .catch(err => {
  //   //     console.error(err); // Err is the JSON error send back from Spring Boot
  //   //   }) // Error 4xx on up
  // }, []);

  // Fetch all movies using my custom hook
  const { data: stores, refetch } = useFindAllStoresQuery();
  const [createStore] = useCreateStoreMutation();
  const [updateStore] = useUpdateStoreMutation();
  const [deleteStore] = useDeleteStoreMutation();

  const nameRef = useRef<HTMLInputElement>(null);
  const addressRef = useRef<HTMLInputElement>(null);
  const squareFootageRef = useRef<HTMLInputElement>(null);

  function handleSubmit(event: any) {
    // This needs to be run in the function otherwise the page will refresh
    // In an SPA, you do NOT want the page to refresh
    event.preventDefault();

    // I can use createStore from the mutation hook to create the store itself
    const newStore: StoreType = {
      name: String(nameRef?.current?.value),
      address: String(addressRef?.current?.value),
      squareFootage: Number(squareFootageRef?.current?.value)
    }

    // This is an asynchronous request
    createStore(newStore)
      .unwrap() // returns a Promise of the HTTP Response
      .then(() => refetch()); // refetches the data // Pessimistic update

    // Ensure that the store is created, THEN we fetch
  }

  // If they don't pass in a id, use 0
  function handleDelete(id: number = 0) {
    deleteStore(id)
      .unwrap()
      .then(() => refetch());
  }

  return (
    <>
      <Counter />
      <Display />

      {/* Display ONE store */}
      {/* <div>
        <h1>{stores[0]?.name} {stores[0]?.id}</h1>
        <h2>{stores[0]?.address}</h2>
      </div> */}
      {/* Loop over the array of Store objects and turn into array of JSX elements */}

      {/* Create a form with input elements and a handleSubmit to create the form */}

      <form onSubmit={handleSubmit}>
        Name: <input ref={nameRef} />
        Address: <input ref={addressRef} />
        Square Footage: <input ref={squareFootageRef} />
        {/* Default behavior, buttons inside a form are of type submit */}
        <button>Create Store</button>
      </form>

      {stores?.map(store => {
        return (
          // By default, uses index (BAD if you re-order/sort the array)
          // If you have an id, ALWAYS use that
          <Store key={store.id} store={store} handleDelete={handleDelete} />
        )
      })}
    </>
  )
}

export default App
