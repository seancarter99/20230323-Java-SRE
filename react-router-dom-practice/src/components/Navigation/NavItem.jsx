import styled from "styled-components";

export const NavItem = styled.div`
    margin: ${(props) => props.margin ?? '0 0.5em'};

    &:first-child {
        margin-left: 0px;
    }
    /* Utilizes CSS pseudo selectors/classes */
    &:last-child {
        margin-right: 0px;
    }
`;

// const NavItemz = (props) => {
//     return <div >
//         {props.children}
//     </div>
// } 


/* <NavItem margin="1em 1em" /> */