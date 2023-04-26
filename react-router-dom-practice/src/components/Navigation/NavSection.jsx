import styled from "styled-components";

export const NavSection = styled.section`
    display: flex;
    justify-content: ${({jc}) => jc ?? 'flex-start'};
    width: 100%;
`;