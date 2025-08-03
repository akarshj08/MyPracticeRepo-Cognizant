// src/components/FlightList.js
import React from 'react';
import BookButton from './BookButton';

const flights = [
  { id: 1, from: 'Delhi', to: 'Mumbai', time: '10:00 AM' },
  { id: 2, from: 'Chennai', to: 'Bangalore', time: '2:00 PM' },
  { id: 3, from: 'Kolkata', to: 'Hyderabad', time: '6:00 PM' },
];

const FlightList = ({ isLoggedIn }) => {
  return (
    <div>
      <h4>Available Flights</h4>
      <ul>
        {flights.map(flight => (
          <li key={flight.id}>
            {flight.from} ➡ {flight.to} at {flight.time}
            <BookButton isLoggedIn={isLoggedIn} />
          </li>
        ))}
      </ul>
    </div>
  );
};

export default FlightList;
