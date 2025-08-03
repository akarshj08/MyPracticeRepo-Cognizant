// src/components/Guest.js
import React from 'react';
import FlightList from './FlightList';

const Guest = () => {
  return (
    <div>
      <h3>Welcome, Guest!</h3>
      <p>Please login to book tickets.</p>
      <FlightList isLoggedIn={false} />
    </div>
  );
};

export default Guest;
