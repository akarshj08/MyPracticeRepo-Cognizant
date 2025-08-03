// src/components/Header.js
import React from 'react';

const Header = ({ isLoggedIn, handleLogin, handleLogout }) => {
  return (
    <header>
      <h2>Ticket Booking App</h2>
      {isLoggedIn ? (
        <button onClick={handleLogout}>Logout</button>
      ) : (
        <button onClick={handleLogin}>Login</button>
      )}
    </header>
  );
};

export default Header;
