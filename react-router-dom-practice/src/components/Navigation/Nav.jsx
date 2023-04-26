// Higher Order Components
// Decorator design pattern
// Take an existing class and add functionality on top of it

import styled from 'styled-components';

// Nav is a component that is just a regular <nav> tag with this CSS on it
export const Nav = styled.nav`
    font-size: 20px;
    display: flex;
    justify-content: space-between;
    background-color: #240B36;
    color: white;
`;

// const Nav = () => {
//     return (
//         <nav>

//         </nav>
//     );
// }

export default Nav;