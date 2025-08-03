// src/components/User.js
import React from 'react';
import FlightList from './FlightList';

const User = () => {
  return (
    <div>
      <h3>Welcome, User!</h3>
      <p>You can now book your tickets below.</p>
      <FlightList isLoggedIn={true} />
    </div>
  );
};

export default User;
