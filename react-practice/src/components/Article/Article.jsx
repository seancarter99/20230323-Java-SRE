import Body from './Body';

// Props object contains one specific property called children
// Children represents what's in between the opening and closing tag of my <Article> component

export const Article = ({title, author, children, date}) => {

    return (
        <article>
            <h2>{title ?? 'Insert title here'}</h2>
            <h3>{author}</h3>
            <Body>{children}</Body>
            <h4>{date ?? new Date().toString()}</h4>
        </article>
    );
}