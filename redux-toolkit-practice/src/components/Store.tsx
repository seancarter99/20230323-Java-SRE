import { useState } from "react";
import { Store as StoreType } from "../api/storeApi";

type StoreProps = {
    store: StoreType;
    handleDelete: any;
    children?: React.ReactNode;
}

export const Store = ({store, handleDelete}: StoreProps) => {

    // This store determines it rerenders

    const [isEdit, setIsEdit] = useState(false);
    const [inputName, setInputName] = useState(store.name);


    if (isEdit) {
        return (
            <div className="container">
                <input value={inputName} onChange={e => setInputName(e.target.value)} />
                <input value={store.address} />
                <button onClick={() => setIsEdit(false)}>Cancel Edit Mode</button>
            </div>
        );
    }

    return (
        <div className="container">
            <h2>{store.name}</h2>
            <h3>{store.address}</h3>
            {/* In order to handleDelete with a parameter, use function currying */}
            <button onClick={() => setIsEdit(true)}>Edit</button>
            <button onClick={() => handleDelete(store?.id)}>X</button>
        </div>
    );
}