// SPecifically returns the body of the article
const Body = ({children}) => {
    return (
        <div className="article-body">
            {children}
        </div>
    );
}

export default Body;

{/* <Body>This is the children</Body> */}