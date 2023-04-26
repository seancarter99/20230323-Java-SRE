// This component is taking all the building blocks and building a specific, non-resuable component

import { Nav, NavItem, NavLink, NavSection } from './';

export const AppNav = () => {
    return (
        <Nav>
            <NavSection>
                <NavItem>
                    <NavLink to="/">Home</NavLink>
                </NavItem>
                <NavItem>Hello!</NavItem>
            </NavSection>
            <NavSection jc="flex-end">
                <NavItem>
                    <NavLink to="/about-me">About Me</NavLink>
                </NavItem>
                <NavItem>
                    <NavLink to="/about-me">About You</NavLink>
                </NavItem>
            </NavSection>
        </Nav>
    );
}