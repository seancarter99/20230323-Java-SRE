import { useSelector } from 'react-redux'

export const Display = () => {

    const counter = useSelector((store: any) => store.counter);

    return <h1 style={{color: 'red'}}>{counter.count}</h1>
}